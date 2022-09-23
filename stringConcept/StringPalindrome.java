package stringConcept;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string.....");
		String h=sc.next();
		boolean b=isPalindrome(h);
		if(b==true)
			System.out.println("Palindrome string...");
		else
			System.out.println("Not a palindrome string.....");
		
	

}

	private static boolean isPalindrome(String h) {
		// TODO Auto-generated method stub
		int length=h.length();
		for(int i=0;i<length/2;i++)
		{
			if(h.charAt(i)!=h.charAt(length-i-1))
				return false;
		}
		return true;
		
	}


}