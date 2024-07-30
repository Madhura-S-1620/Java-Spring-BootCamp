class M{
    public void M_method()
    {
        System.out.println("Inside M_method");
    }
}
class N extends M{
    public void M_method()
    {
        M_method();
        System.out.println("Modifying M_method in N class");
    }
    public void N_method()
    {
        super.M_method();
        System.out.println("Inside N_method");
    }
}
class O extends N{
    public void O_method()
    {
        N_method();
        System.out.println("Inside O_method");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        O obj=new O();
        obj.O_method();
    }
}
 
