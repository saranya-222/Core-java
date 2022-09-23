package stringConcept;
import java.util.Scanner;
public class StringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required string...");
		 h=sc.nextLine();
		String splitedString[]=h.split(" ");
		System.out.println(splitedString.length);

	}

}
