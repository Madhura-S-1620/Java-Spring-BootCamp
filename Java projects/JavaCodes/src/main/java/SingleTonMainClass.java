public class SingleTonMainClass {
public static void  main(String [] args)
{

    SingleTonClassDemo sobj1=SingleTonClassDemo.getInstance();
    SingleTonClassDemo sobj2=SingleTonClassDemo.getInstance();
    sobj1.message("Jay");
    sobj2.message("Shre Swami Narayan..");
}
}