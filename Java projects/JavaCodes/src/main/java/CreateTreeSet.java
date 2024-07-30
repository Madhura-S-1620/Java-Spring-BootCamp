import java.util.TreeSet;
import java.util.SortedSet;
public class CreateTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String>fruits=new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Guava");
		System.out.println(fruits);
		fruits.add("Lichi");
		System.out.println(fruits);
		fruits.add("apple");
		System.out.println(fruits);
		

	}

}
