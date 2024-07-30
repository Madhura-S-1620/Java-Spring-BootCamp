import java.util.HashSet;
import java.util.Set;

class User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class HashSetUserDefinedObject {
    public static void main(String[] args) {
        Set<User1> users = new HashSet<>();
        users.add(new User1("Rajeev", 25));
        users.add(new User1("John", 34));
        users.add(new User1("Steve", 29));
        
        users.forEach(user -> {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        });
    }
}
