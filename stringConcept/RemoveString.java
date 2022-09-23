package stringConcept;
import java.util.Scanner;
public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string....");
      String n=sc.next();
      System.out.println("Enter the letter which u need to remove from the given string...");
      String h=sc.next();
      System.out.println("Enter the string which u need to replace...");
      String j=sc.next();
      System.out.println("Your replaced  string is...");
      System.out.println(n.replace(h, j));
	}

}
