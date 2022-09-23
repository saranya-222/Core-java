
package basicConcept;
import java.util.Scanner;
public class multiply {

	public static void main(String[] args) {
	    int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
        a=s.nextInt();
        System.out.println("Enter the value of b");
        b=s.nextInt();
        c=a*b;
        System.out.println("multiplication of two numbers..."+c);
	}

}
