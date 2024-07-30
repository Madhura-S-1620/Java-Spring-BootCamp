import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> persons=new LinkedList<>();
        persons.add("person1");
        persons.add("person2");
        persons.add("person3");
        persons.add("person4");
        persons.add("person5");
        persons.add("person6");
        System.out.println(persons);
        persons.remove();
        System.out.println(persons);
        persons.remove();
        System.out.println(persons);
        persons.remove();
        System.out.println(persons);
        persons.remove();
        System.out.println(persons);
        persons.remove();
        System.out.println(persons);
        persons.poll();
        System.out.println(persons);
        //persons.remove();
        System.out.println(persons);
    }
}
 