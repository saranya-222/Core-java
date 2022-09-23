package basicConcept;
import java.util.Scanner;
public class Do_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString choice;
		String choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter your choice...\n1.circle\n2.Traingle\n3.Rectangle");
		choice=sc.next();
		switch(choice)
		{
		case "circle":
			double r;
			System.out.println("Enter the radius...");
			r=sc.nextDouble();
			System.out.println("Area of the circle is..."+(3.14*r*r));
			break;
		case "Triangle":
			double b,h;
			System.out.println("Enter the base...");
			b=sc.nextDouble();
			System.out.println("Enter the height...");
			h=sc.nextDouble();
			System.out.println("Area of the Triangle is..."+(0.5*b*h));
			break;
		case "Rectangle":
			double l,br;
			System.out.println("Enter the breadth...");
			br=sc.nextDouble();
			System.out.println("Enter the length...");
			l=sc.nextDouble();
			System.out.println("Area of the Triangle is..."+(0.5*br*l));
			break;
			default:System.out.println("Invalid choices...");
			
		}
		System.out.println("Do you want to continue...y/n");
		ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		}

	}


