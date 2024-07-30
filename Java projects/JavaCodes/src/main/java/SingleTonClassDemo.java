public class SingleTonClassDemo {

    private static SingleTonClassDemo instance;
    public  synchronized static SingleTonClassDemo getInstance()
    {

        if(instance==null)
        {
            instance= new SingleTonClassDemo();
            System.out.println("new Object is created");
        }
        else {
            System.out.println("The object already exists");
        }
        return  instance;
    }
    public  void  message(String str)
    {

        System.out.println("message() is called"+ str);
    }
}
