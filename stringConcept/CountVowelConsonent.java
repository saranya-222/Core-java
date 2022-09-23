package stringConcept;
import java.util.Scanner;
public class CountVowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0,ccount=0,scount=0,ncount=0,spcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string...");
		String h=sc.nextLine();
		System.out.println("Count of vowels and consonents.....");
		for(int i=0;i<h.length();i++)
		{
			if(h.charAt(i)=='a'||h.charAt(i)=='e'||h.charAt(i)=='i'||h.charAt(i)=='o'||h.charAt(i)=='u'||h.charAt(i)=='A'||h.charAt(i)=='E'||h.charAt(i)=='I'||h.charAt(i)=='O'||h.charAt(i)=='U')
			{
				vcount++;
			}
			else if(h.charAt(i)>='a'&&h.charAt(i)<='z')
			{
				ccount++;
			}
			else if(h.charAt(i)==' ')
			{
			  scount++;	
			}
			else if(h.charAt(i)>='0'&&h.charAt(i)<='9')
			{
				ncount++;
			}
			else
			{
				spcount++;
			}
    				
		}
		  System.out.println("VOWEL COUNT...."+vcount);
	      System.out.println("CONSONENT COUNT...."+ccount);
	      System.out.println("SPACE COUNT...."+scount);
	      System.out.println("NUMBER COUNT...."+ncount);
	      System.out.println("SPECIAL CASE COUNT...."+spcount);

	}

}
