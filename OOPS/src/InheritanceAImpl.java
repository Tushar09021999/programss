
public class InheritanceAImpl extends InheritanceA {
	
	public String first(String q, String p) {
		System.out.println("child");
		
		
		return q+p;
		
	
	
	}
	
	public void test() {
		System.out.println("Starting....");
		
		
		
	}
	
	
	
	
	
	
 public static void main (String[] args){
	  int a = 20;
	 
	 InheritanceAImpl e = new InheritanceAImpl();
    int z1 =  e.Hello(500);
	 System.out.println(z1);
	 System.out.println(a);
	 System.out.println(e.i);
	 
	 e.test();
	 
	 
	System.out.println(e.first());
	System.out.println(e.first(100)); 
	System.out.println( e.first(40,60));
	
System.out.println(	e.first("tushar", "mule")
);	
	
	

	
	 
	 
 }

	
	
}
