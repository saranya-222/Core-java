package stringConcept;
import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string...");
		String h=s.nextLine();
		System.out.println("Enter  the character to count ....");
		char ch=s.next().charAt(0);
		for(int i=0;i<h.length();i++)
		{
			if(h.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("The countage of given character...."+count);

	}

}
