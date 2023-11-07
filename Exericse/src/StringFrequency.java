
public class StringFrequency {

	public static void main(String[] args) {
		String str = "tushar";
		
		char c = 'u';
		int count =0;
		
		for(int i =0; i<str.length();i++) {
			
			if(c==str.charAt(i)) {
				count++;
				
			}
			
		}
		
		System.out.println(c+" "+count);
	}
}
