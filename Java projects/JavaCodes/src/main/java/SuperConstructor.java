class A{

    int y=8;
    public A()
    {

        System.out.println("Inside A Constructor");
    }

}
class B extends A{
    public B()
    {
        System.out.println("Inside B Constructor");

    }
    public B(String msg)
    {
        System.out.println("Message is:" + msg);
    }
    public B(int x)
    {
        this("Welcome");
        System.out.println(x + "value");
    }
}
class C extends B{
    public C()
    {
        super(6);

        System.out.println("Inside C Constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        C cobj=new C();

    }

}
 