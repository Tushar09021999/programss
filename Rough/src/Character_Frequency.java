
public class Character_Frequency {
	public static void main(String[] args) {
		String str = "Tushar apple anar";
		char c = 't';
		int count =0;
		for(int i = 0 ; i<str.length();i++) {
			
			if(c==str.charAt(i)) {
				
				count++;
			}
			
		}
		System.out.println(c+": "+ count);
	}

}
