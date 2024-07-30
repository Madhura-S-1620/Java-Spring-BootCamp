import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] > array[j]) {
                   
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        
        System.out.println("The sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        
        
    }
}
