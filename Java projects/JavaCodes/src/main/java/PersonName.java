import java.util.Arrays;

public class PersonName implements Comparable <PersonName>{

    String fName;
    String lName;
    public PersonName(String f,String l)
    {
        this.fName=f;
        this.lName=l;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
//PersonName pn1=new PersonName("PO","MP");
 //   PersonName pn2=new PersonName("Jl","Kh");

    @Override
    public int compareTo(PersonName o) {
        //if strings are not equal
        if(this.fName.compareTo(o.fName)!=0)
        {
            return this.lName.compareTo(o.fName);
        }
        else {
            return this.lName.compareTo(o.lName);
        }
    }

    public static void main(String[] args) {

        PersonName [] personNames=new PersonName[2];
        personNames [0]=new PersonName("Suresh","Prabhu");
        personNames [1]=new PersonName("Krishna","Sawant");
        Arrays.sort(personNames);
        for(int i=0;i<=1;i++)
        {
        System.out.println(personNames[i]);
    }}
}