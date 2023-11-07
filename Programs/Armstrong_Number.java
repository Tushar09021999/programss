package Programs;

public class Armstrong_Number {
    public static void main(String[] args){

         int num=153;
         int temp=num;
         int n,sum=0;
         int count =0;
         int ori =temp;

         while(temp>0){


         }

         while(num>0){

             n=num%10;
             num= num/10;
             sum = sum+(n*n*n);

         }

         if(temp==sum){
             System.out.println("Armstrong Number");
         }
         else {
             System.out.println("Not a Armstrong Number");
         }
    }
}
