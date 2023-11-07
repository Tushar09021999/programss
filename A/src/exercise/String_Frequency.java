package exercise;

public class String_Frequency {
	
	public static void main(String[] args){

		int[] arr ={1,2,4,4,5,3,4,9,7,7,8,2,1};
		int[] temp = new int[arr.length];
		int j=0;
		
		for(int i =0;i<arr.length-1;i++){

			
			if(arr[i]!=arr[i+1]){

				temp[j] = arr[i+1];
				j++;
		

				}

			}
		
		
		
		
		


		for(int x:temp){
			if(x!=0) {
		System.out.print(x);
			}
	}

}
}
