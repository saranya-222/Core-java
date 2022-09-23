package basicConcept;
import java.util.Scanner;
public class ArrayAscDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of values...");
        n=sc.nextInt();	  
		int a[]=new int[n];
		System.out.println("Enter the array elements....");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 for(int i=0;i<4;i++)
		 {
			 for(int j=i+1;j<5;j++)
			 {
				 if(a[i]>a[j])
				 {
					 t=a[i];
					 a[i]=a[j];
					 a[j]=t;
					 
				 }
			 }
		 }
		 System.out.println("Ascending order of first five elements....");
		 for(int i=0;i<5;i++)
		 {
			System.out.println(a[i]); 
		 }
		 for(int i=5;i<9;i++)
		 {
			 for(int j=i+1;j<10;j++)
			 {
				 if(a[i]<a[j])
				 {
					 t=a[i];
					 a[i]=a[j];
					 a[j]=t;
					 
				 }
			 }
		 }
			
			System.out.println("Descending order of next five elements");
			for(int i=5;i<n;i++) {
				System.out.println(a[i]);
			}
		}
	}
