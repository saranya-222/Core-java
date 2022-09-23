package basicConcept;
import java.util.Scanner;
public class ArrayAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     Scanner d=new Scanner(System.in);
    
     System.out.println("Enter the total num...");
     n=d.nextInt();
     int a[]=new int[n];
     int b[]=new int[n];
     System.out.println("Enter the array elements...");
     for(int i=0;i<n;i++)
     {
    	 a[i]=d.nextInt();
     }
     for(int i=0;i<n-1;i++)
     {
    	 for(int j=i+1;j<n;j++)
    	 {
    		if(a[i]>a[j])
    		{
    			int t=a[i];
    			a[i]=a[j];
    			a[j]=t;
    		}
    	 }
    	
     }
     System.out.println("Ascending order...");
     for(int i=0;i<n;i++)
     {
    	System.out.println(a[i]); 
     }
     
	}

}
