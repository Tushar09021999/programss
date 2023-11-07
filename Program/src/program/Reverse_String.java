package program;



public class Reverse_String {

		public static void main(String[] args) {
			String str = "i am a java developer";
			String[] s = str.split(" ");
			for(int i= str.length()-1; i>=0; i--) {
				
				System.out.print(str.charAt(i));
			}
			
			System.out.println();
			
			for(int i = s.length-1; i>=0;i--) {
				
				System.out.print(s[i]+" ");
			}
			
			
			
		}
}
