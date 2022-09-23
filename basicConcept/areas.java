package basicConcept;
import java.util.Scanner;
public class areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double r,b,h;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the radius");
   r=s.nextDouble();
   System.out.println("Enter the base of the triangle");
   b=s.nextDouble();
   System.out.println("Enter the height");
   h=s.nextDouble();
   System.out.println("Area of the circle...."+(3.14*r*r));
   System.out.println("Area of the triangle...."+(0.5*b*h));
   
	}

}
