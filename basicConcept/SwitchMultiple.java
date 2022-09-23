package basicConcept;
import java.util.Scanner;
public class SwitchMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu Options are...\n1.Even or Odd\n2.+ or -\n3.Palindrome\n4.Armstrong\n\n\nEnter the choice...");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int a;
				System.out.println("Enter the value of a");
				a=sc.nextInt();
		
				if(a%2==0)
					System.out.println("The number is even...");
				else
				System.out.println("The number is odd");
				break;
			case 2:
				int b;
				System.out.println("Enter the value...");
				b=sc.nextInt();
				if(b>0)
					System.out.println("The number is positive...");
				else if(b<0)
					System.out.println("The number is negative...");
				else
					System.out.println("Zero");
              break;
			case 3:
				int n,r=0,sum=0;
				System.out.println("Enter the number...");
				n=sc.nextInt();
				int f=n;
                for(;f>0;)
                {
                	r=f%10;
               sum=sum*10+r;
                    f=f/10;
                }
                    if(sum==n)
                    	System.out.println("The number is a palindrome....");
                    else
                    	System.out.println("The number is not a palindrome....");
                    break;
			case 4:
				int g,s=0;
				System.out.println("Enter the number");
				g=sc.nextInt();
				int temp=g;
				while(temp>0)
				{
					int q=temp%10;
					 s=s+(q*q*q);
					 temp=temp/10;
					 
				}
				if(s==g)
					System.out.println("The number is an armstrong number...");
				else
					System.out.println("The number is not an armstrong number...");
				break;
                 default :
                	 System.out.println("Invalid choice");
			}
                	 System.out.println("Do you want to continue yes/no...");
                	 ch=sc.next().charAt(0);
                	 
			}while(ch=='y'||ch=='Y');
				
			
		}
		
		
}
	


