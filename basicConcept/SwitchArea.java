package basicConcept;
import java.util.Scanner;
public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice...\n1.circle\n2.Traingle\n3.Rectangle");
		choice=sc.next();
		switch(choice)
		{
		case "circle":
			double r;
			System.out.println("Enter the radius...");
			r=sc.nextDouble();
			System.out.println("Area of the circle is..."+(3.14*r*r));
		case "Triangle":
			double b,h;
			System.out.println("Enter the base...");
			b=sc.nextDouble();
			System.out.println("Enter the height...");
			h=sc.nextDouble();
			System.out.println("Area of the Triangle is..."+(0.5*b*h));
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

	}

}
