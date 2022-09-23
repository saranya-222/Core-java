package basicConcept;
import java .util.Scanner;
public class SeriesOdd {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range...");
        n=sc.nextInt();
        System.out.println("The odd series are...");
        for(int i=0;i<n;i++)
        {
        	if(i%2!=0)
        	{
        		System.out.print(i+" ");
        	}
        }
	}

}
