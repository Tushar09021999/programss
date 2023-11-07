
public class Encapsulation {
	
	
	 
		
	private String firstName;
	private String lastName;
	private int id;
	 private int speed;
	 
	 
	 
	 
	public Encapsulation(String firstName, String lastName, int id) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	public String getLastName() {
		return lastName;
	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
	 

	
	public static void main(String[] args) {
		
		
		Encapsulation e = new Encapsulation("tushar", "mule", 5);
		
//		e.setFirstName("tushar");
//		e.setLastName("mule");
//		e.setId(7);
		
		System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
		System.out.println(e.getId());
		
		
		
		
		
	}
	
		
		
	
		
		
	

}
