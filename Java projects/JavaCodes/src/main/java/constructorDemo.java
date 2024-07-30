public class constructorDemo {
int i=9,j=8;
    public constructorDemo()
    {
        System.out.println("Inside the default constructor..");
    }

    public constructorDemo(int i,int j)
    {
        this();
        System.out.println(i);
        System.out.println(j);
        System.out.println("After using this keyword");
        this.i=i;
        this.j=j;
        System.out.println(i);
        System.out.println(j);
    }
    private  static int x;
    private static int y;

    public  int getX() {
        return x;
    }

    public  void setX(int x) {
    	constructorDemo.x = x;
    }

    public  int getY() {
        return y;
    }

    public  void setY(int y) {
    	constructorDemo.y = y;
    }

    public static void main(String[] args) {
    	constructorDemo he=new constructorDemo();

        System.out.println("Hello");
        System.out.println(he.i);
        System.out.println(he.j);
        constructorDemo he2=new constructorDemo(3,4) ;
    }
}
 
