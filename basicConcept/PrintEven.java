package basicConcept;
import java.util.Scanner;
public class PrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the a");
       a=sc.nextInt();
       System.out.println("Enter the b");
       b=sc.nextInt();
       System.out.println("The even numbers between the ranges are...");
       for(int i=a;i<b;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.println(i);
    		   sum=sum+i;
    	   }
       }
       System.out.println("The sum of even numbers between the range..."+sum);
	}

}
