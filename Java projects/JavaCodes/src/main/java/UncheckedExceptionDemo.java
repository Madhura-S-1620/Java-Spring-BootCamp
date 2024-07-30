public class UncheckedExceptionDemo {
    public void processArray(int[] array) {
        try {
            int element = array[6]; // This might throw
            // ArrayIndexOutOfBoundsException
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: " + e.getMessage());
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        UncheckedExceptionDemo uncheckedExceptionDemo=new UncheckedExceptionDemo();
       int x[]=new int[]{4,5,3,7,8,4};
        uncheckedExceptionDemo.processArray(x);
    }

}
 