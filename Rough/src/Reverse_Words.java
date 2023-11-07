
public class Reverse_Words {
	
	
	public static void main(String[] args) {
		
		
		String str = "im a java developer";
		String[] s = str.split(" ");
		
		for(int i = s.length-1; i>=0; i--) {
			System.out.print(s[i]+" ");
			
			
			
		}
		
		
		
	}

}
