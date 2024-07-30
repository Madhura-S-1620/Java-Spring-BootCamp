
public class Example1 {
	
	public static void main() {
		System.out.println("HHH in main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HHH");
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		main();

	}
	

}
