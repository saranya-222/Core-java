package classesandobject;
import java.util.Scanner; 
public class Example1 {
 int a,b;
 Scanner sc=new Scanner(System.in);

  public void input()
  {
	  System.out.println("Enter the a value...");
	  a=sc.nextInt();
	  System.out.println("Enter the b value...");
	  b=sc.nextInt();
  }
  public void output()
  {
	  System.out.println("Added="+(a+b));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Example1 ();
		e.input();
		e.output();
	}

}
