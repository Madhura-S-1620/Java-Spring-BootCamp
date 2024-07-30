import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class KEVHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj1=new HashMap<>();
		obj1.put(1," Madhura");
		obj1.put(2, "Naina");
		obj1.put(3, "Elsa");
		obj1.put(4, "Ria");
		obj1.put(5, "Neha");
		System.out.println(obj1);
		
		Set<Integer> keys = obj1.keySet();
		Collection<String> values = obj1.values();
		Set<Map.Entry<Integer, String>> entries = obj1.entrySet();
		
		System.out.println("keys of Obj1 : " + keys);
        System.out.println("values from Obj1 :" + values);
        System.out.println("entries from Obj1 :" + entries);

	}

}
