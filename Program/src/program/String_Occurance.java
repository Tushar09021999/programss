package program;

public class String_Occurance {
	
	public static void main(String[] args) {
		String str = "i am java developer";
		
		for(char c='a'; c<='z'; c++) {
			
			int count = 0;
			for(int i=0; i<str.length();i++) {
				
				if(c==str.charAt(i)) {
					count++;
				}
				
			}if(count!=0) {
				System.out.println(c+":"+count);
				}
		}
	}
}
