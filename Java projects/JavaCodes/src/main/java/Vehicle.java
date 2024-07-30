public class Vehicle {
	
	String name;
	int noOfTyres;
	String colour;
	
	void start() {
		System.out.println(colour+ " " + name + "started");
	}
 
	void brake()
	{
		System.out.println("brake applied to the vehicle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vobj=new Vehicle();
		vobj.name = "Truck";
		vobj.colour = "Blue";
		vobj.noOfTyres = 4;
		vobj.start();
		vobj.brake();
		
	}
 
}
