package practice;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "My name is Tushar";

		String[] s = str.split(" ");
	
		for (int i = s.length-1; i >=0 ; i--) {
			System.out.println(s[i]);
			
		}

	}
}
