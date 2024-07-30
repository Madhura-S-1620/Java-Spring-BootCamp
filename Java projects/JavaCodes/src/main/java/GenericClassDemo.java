public class GenericClassDemo <T>{
    T gc1;
    public T getGc1() {
        return gc1;
    }


    public void setGc1(T gc1) {
        this.gc1 = gc1;
    }

//T points to any data type
    public GenericClassDemo(T to1)
    {
        this.gc1=to1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GenericClassDemo<Integer> gg1=new GenericClassDemo<>(10078);
        System.out.println(gg1.getGc1());
        System.out.println(gg1.gc1.getClass().getName());
        GenericClassDemo<Boolean> gg2=new GenericClassDemo<Boolean>(false);
        System.out.println(gg2.getGc1());
        System.out.println(gg2.gc1.getClass().getName());
        GenericClassDemo<Double> gg3=new GenericClassDemo<>(44.5);
        System.out.println(gg3.getGc1());
        System.out.println(gg3.gc1.getClass().getName());

    }

}