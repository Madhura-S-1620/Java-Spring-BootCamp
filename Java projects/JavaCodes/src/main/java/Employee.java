class Manager1{
	
	int id;
	private double salary;
	public Manager1()
	{
		System.out.println("default constructor...");
	}
	public Manager1(int id,double sal)
	{
		this.id=id;
		this.salary=sal;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class Employee {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager1 mobj=new Manager1();
mobj.id=890;
Manager1 obj2=new Manager1(222,45900.56);
		System.out.println(obj2.id);
		obj2.setSalary(56000.89);
		System.out.println(obj2.getSalary());
	}
 
}
 