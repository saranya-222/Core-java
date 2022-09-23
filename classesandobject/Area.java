package classesandobject;
import java.util.Scanner;
public class Area {
	Scanner s=new Scanner(System.in);
   public void cir()
   {
	   double r;
	   System.out.println("Enter the radius of the circle...");
	   r=s.nextDouble();
	   System.out.println("Area of the circle is..."+(3.14*r*r)+"\n\n");
	   
   }
   public void tri()
   {
	   double b,h;
	   System.out.println("Enter the base of the triangle...");
	   b=s.nextDouble();
	   System.out.println("Enter the height of the triangle...");
	   h=s.nextDouble();
	   System.out.println("Area of the triangle is..."+(0.5*b*h)+"\n\n");
	   
   }
   public void rect()
   {
	   double l,b;
	   System.out.println("Enter the length of the rectangle...");
	   l=s.nextDouble();
	   System.out.println("Enter the breadth of the rectangle...");
	   b=s.nextDouble();
	   System.out.println("Area of the triangle is..."+(l*b)+"\n\n");
	   
   }
   public void sqr()
   {
	   double a;
	   System.out.println("Enter the side length of the square...");
	   a=s.nextDouble();
	   System.out.println("Area of the square is..."+(a*a)+"\n\n");
	   
   }
				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area r=new Area();
		r.cir();
		r.tri();
		r.rect();
		r.sqr();
     
	}

}
