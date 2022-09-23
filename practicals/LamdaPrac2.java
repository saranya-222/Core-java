package practicals;
import java.util.Scanner;
@FunctionalInterface
 interface Area {
	float circle(float r);
	
 }
public class LamdaPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle....");
		float a=sc.nextFloat();
          Area ob=(r)->{
        	return   (float) (3.14*r*r);
          };
          System.out.println("\nArea of the circle  :"+ob.circle(a));
	}

}
