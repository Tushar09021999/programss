package practice;

public class Countwords {
	public static void main(String[] args) {
		String str = " Tushar Homraj Mule";
//		String z = str.trim();
		String[] s = str.trim().split(" ");
		int count = s.length;
		System.out.println(count);
		
	
		
		for (String x : s) {
			System.out.println(x);
			
		}
		
		
	}

}

