import java.util.ArrayList;
import java.util.List;
class User{
   private String name;
   private int age;
   
   public User(String name,int age) {
	   this.name=name;
	   this.age=age;
	   
   }
   public String getName(){
	   return name;
   }
   
   public String setName(){
	 return this.name= name;
   }
   
   public int getAge(){
	   return age;
   }
   
   public int setAge(){
	 return this.age= age;
   }
   
}
public class ArrayListUserDefinedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("Steve", 29));
        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });
    }


	}


