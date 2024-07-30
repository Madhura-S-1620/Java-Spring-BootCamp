import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=scanner.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements of  the array:");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("The array is:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j]) {
					System.out.println("The common elements are:" + array[i]);
				}
			}
		}

	}

}
