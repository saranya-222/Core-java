package practicals;
import java.util.Scanner;
@FunctionalInterface
interface Percent
{
	double percentage(double m1,double m2,double m3);
}
public class LamdaPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks of the student");
      System.out.println("Tamil :");
      double ma1=sc.nextDouble();
      System.out.println("English :");
      double ma2=sc.nextDouble();
      System.out.println("Maths :");
      double ma3=sc.nextDouble();
      Percent ob=(m1,m2,m3)->
      {
    	  return (m1+m2+m3)/3;
      };
      System.out.println("Percentage :"+String.format("%.2f", ob.percentage(ma1, ma2, ma3)));
	}

}
