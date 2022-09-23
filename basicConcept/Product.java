package basicConcept;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		double amount=0,disc;
		char ch;
		Scanner sc=new Scanner(System.in);
		do 
		{
		System.out.println("product\t\t\t     Code\nComputer stationary\t\t1\nFixed disk\t\t\t2\nComputers\t\t\t3\n\n");
		System.out.println("Enter the choice...");
		choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:System.out.println("Computer Stationary\nEnter the amount...");
		 amount=sc.nextDouble();
		 if(amount>=500)
		 {
			 disc=0.12*amount;
		     System.out.println("The amount with the discount is...."+disc);
		 }
		     else if(amount>=300&&amount<500)
		     {
		    	 disc=0.08*amount;
		         System.out.println("The amount with the discount is...."+disc);
		     }
		     else if(amount<300)
		     {
		    	 disc=0.02*amount;
		    	 System.out.println("The amount with the discount is...."+disc);
		     }
		       break;
		 case 2:System.out.println("Fixed disk\nEnter the amount...");
		 amount=sc.nextDouble();
		 if(amount>=2000)
		 {
			 disc=0.10*amount;
			 System.out.println("The amount with the discount is..."+disc);
		 }
		 else if(amount>=1500&&amount<2000)
		 {
			 disc=0.05*amount;
			 System.out.println("The amount  with the discount is..."+disc);

		 }
		  break;
		 case 3:System.out.println("Computers\nEnter the amount....");
		        amount=sc.nextDouble();
		        if(amount>=5000)
		        {
		        	disc=0.10*amount;
		        	System.out.println("The amount with the discount is..."+disc);
		        }
		        	else if(amount<5000&&amount>=2500)
		        	{
		        		disc=0.05*amount;
		        		System.out.println("The amount with the discount is..."+disc);
		        	}
		        break;
		        }
		 System.out.println("Do you want to continue y/n");
		 ch=sc.next().charAt(0);
		 }while(ch=='y'||ch=='Y');
		}
	}


