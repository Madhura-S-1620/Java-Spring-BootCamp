public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        String name1="Charan";
        String name2=new String("Krishna");
        String name3=name1;
        System.out.println(name1);
        System.out.println(name1.hashCode());
        System.out.println(name2);
        System.out.println(name2.hashCode());
        System.out.println(name3);
        System.out.println(name3.hashCode());
name3=new String("Narayan");
        System.out.println(name3.hashCode());
        name1="Das";
        System.out.println(name1);
        System.out.println(name1.hashCode());
        name1="Shiv";
        System.out.println(name1.hashCode());
    StringBuffer name4=new StringBuffer("Swami");
        System.out.println("Before appending name4:" + name4);
        System.out.println(name4.hashCode());
    name4.append(name3);
        System.out.println("After appending name4:"+ name4);
        System.out.println(name4.hashCode());
        
        String name6=new String("Sobalkar");
       StringBuilder name5=new StringBuilder("Madhura");
        
        System.out.println("Before appending name5:" + name5);
        System.out.println(name5.hashCode());
        name5.append(name6);
        System.out.println("After appending name5:"+ name5);
        System.out.println(name5.hashCode());
      System.out.println("========================================================");
        
        StringBuilder sb= new StringBuilder("");
        int s=sb.capacity();                               //formula to calculate capacity is same for builder and buffer//(oldcapacity*2)+2
        System.out.println(s);
        
        StringBuilder sb1= new StringBuilder("Hello");
        sb1.reverse();
        System.out.println(sb1);
        
        StringBuilder sb2= new StringBuilder("Hello");
        sb2.append("Java");
        System.out.println(sb2);
        
        StringBuilder sb3= new StringBuilder("Hello");
        sb3.insert(1,"Java");
        System.out.println(sb3);
        
        
        StringBuilder sb4= new StringBuilder("Hello");
        sb4.replace(1,4,"Java");
        System.out.println(sb4);
        
        
        StringBuilder s6=new StringBuilder();
        System.out.println(s6.capacity());
        s6.append("New York City");
        s6.ensureCapacity(5);
        System.out.println(s6.capacity());
        
        
    }
}
 
