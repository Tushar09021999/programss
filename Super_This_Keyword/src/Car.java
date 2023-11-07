
public class Car extends Vehicle{
	
	int z = 102000000;
	
	Car(){
		
		super(" parent");
		System.out.println(super.i);

		System.out.println(super.i=500);
System.out.println("car is created by child");
		
	}
	
	Car(String name){
		this();
		
	System.out.println("car name is: " + name);
		
		
	}
	

}
