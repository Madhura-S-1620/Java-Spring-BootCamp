import java.util.ArrayList;
import java.util.Collections;
class Emp implements Comparable<Emp>{
    int id;
    String name;
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Emp o) {
        if(this.id==o.id){
            return 0;
        }
        else if(this.id > o.id){
            return 1;
        }
        else {
            return -1;
        }
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList <Emp> emplist=new ArrayList<>();
        emplist.add(new Emp(12,"Harshit"));
        emplist.add(new Emp(10,"Rekha"));
        emplist.add(new Emp(7,"Priti"));
        emplist.add(new Emp(14,"Rishi"));
        emplist.add(new Emp(2,"Amol"));
        Collections.sort(emplist);
        for(Emp id: emplist)
        {
            System.out.println(id);
        }
    }
}
 
