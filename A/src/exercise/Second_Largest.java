package exercise;

public class Second_Largest {
	
	public static void main(String[] args){

		
		int[] x= {1,2,4,5,6,7};
		System.out.println(secondLargest(x));
		
		
	}



	public static int secondLargest(int[] x){


		int sl=0;
		int l =x[0];

		for(int i =0;i<x.length; i++){

		if(x[i]>l){
		sl=l;	
		l=x[i];
		

	}
	else if(x[i]>sl){
			sl=x[i];
		}
		

		}
	return sl;

	}





}
