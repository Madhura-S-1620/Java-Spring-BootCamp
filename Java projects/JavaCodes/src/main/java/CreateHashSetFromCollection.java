import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CreateHashSetFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numberDivisibleBy5=new ArrayList<>();
		numberDivisibleBy5.add(5);
		numberDivisibleBy5.add(10);
		numberDivisibleBy5.add(15);
		numberDivisibleBy5.add(20);
		numberDivisibleBy5.add(25);
		
		List<Integer>numberDivisibleBy3=new ArrayList<>();
		numberDivisibleBy5.add(3);
		numberDivisibleBy5.add(6);
		numberDivisibleBy5.add(9);
		numberDivisibleBy5.add(12);
		numberDivisibleBy5.add(15);
		
		Set<Integer>numberDivisibleBy5or3=new HashSet<>(numberDivisibleBy5);
		numberDivisibleBy5.addAll(numberDivisibleBy3);
		System.out.println(numberDivisibleBy5or3);
		
		

	}

}
