package basicConcept;
import java.util.Scanner;
public class ExSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice;
         Scanner sc=new Scanner(System.in);
         System.out.println("\n1.Monday\n2.tuesday\n3.wednesday\n4.thursday\n5.Friday\n6.saturday\n7.Sunday\n\n\nEnter your choice...");
        
         choice=sc.nextInt();
         switch(choice)
         {
         case 1:System.out.println(" Monday");
         break;
         case 2:System.out.println("Tuesday");
         break;
         case 3:System.out.println("Wednesday");
         break;
         case 4:System.out.println("Thursday");
         break;
         case 5:System.out.println("Friday");
 		 break;
         case 6:System.out.println("Saturday");
 		 break;
         case 7:System.out.println("Sunday");
 		 break;
         default:System.out.println("Invalid choice..");
         
         }
	}

}
