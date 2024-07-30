import java.util.Scanner;

public class Example2 {
	int id;
	String title;
	int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 eobj = new Example2();
		eobj.id=183;
		eobj.title="The Train";
		eobj.price=500;
		System.out.println(eobj.id);
		System.out.println(eobj.title);
		System.out.println(eobj.price);
		
		System.out.println("Printing the user input:");
		Scanner scanner=new Scanner(System.in);
		eobj.id=scanner.nextInt();
		eobj.title=scanner.next();
		eobj.price=scanner.nextInt();
		System.out.println(eobj.id);
		System.out.println(" ");
		System.out.println(eobj.title);
		System.out.println(" ");
		System.out.println(eobj.price);
		
		
		
		

	}

}
