package practicals;
import java.util.Scanner;
@FunctionalInterface
interface Interest {
	float simpleInterest(float p,float n,float r);
}
public class InterestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount :");
		float pr=sc.nextFloat();
		System.out.println("Enter the no of years  : ");
		float nr=sc.nextFloat();
		System.out.println("Enter the rate of interest :");
		float rn=sc.nextFloat();
		Interest ob=(p,n,r)->
		{
			return p*n*r;
		};
		System.out.println("Simple Interest :"+ob.simpleInterest(pr,nr,rn));
		

	}

}
