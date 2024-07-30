
public class AccessSpecifierDemo {

	static private int var1= 78;
	static public int var2= 34;
	static protected int var3= 64;
	static private int var4= 45;
	
	 public static void print() {
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierDemo asobj=new AccessSpecifierDemo();
        asobj.print();
        
	}

}
