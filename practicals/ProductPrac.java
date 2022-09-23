package practicals;
import java.util.Scanner;
public class ProductPrac {
    int temp=1;
	  public int divisibleByThreeFive(int num)
	  {
		  if(num<0)
			  return -1;
		  while(num>0)
		  {
			  int r=num%10;
			   temp=temp*r;
			   num/=10;
		  }
		  
		  if(temp%3==0||temp%5==0)
			{
				 	return 1;
		    }
			else 
			{
			 return 0;	
			}

		
		  //return temp;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number required....");
		int num=sc.nextInt();
		ProductPrac ob=new ProductPrac();
		int s=ob.divisibleByThreeFive(num);
		if(s==1)
		{
			System.out.println("yes");
		}
		else if(s==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
