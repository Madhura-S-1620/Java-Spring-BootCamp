public class StaticDemo {
    int x1=1;
    //non static data members can be accessed via object
    //static members can directly access through static context.
    static  int y1=1;
    public StaticDemo(){
        System.out.println("inside StaticDemo Constructor...");
        System.out.println("Printing non static data " + x1++);
        System.out.println("Printing static data "+ y1++);
    }

    public static void main(String[] args) {
        StaticDemo obj1=new StaticDemo();//
        StaticDemo obj2=new StaticDemo();
        StaticDemo obj3=new StaticDemo();
        StaticDemo obj4=new StaticDemo();

    }
}
 