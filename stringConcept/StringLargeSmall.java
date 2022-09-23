package stringConcept;
import java.util.Scanner;
public class StringLargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l=" ";
		String m=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required  string");
		String h=sc.nextLine();
		String ss[]=h.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);
		}
		for(int i=0;i<ss.length;i++)
		{
			
				if(ss[i].length()>l.length())
				{
				l=ss[i];
				}
		}
				for(int i=0;i<ss.length;i++)
				{
					
						if(ss[i].length()<l.length())
						{
						m=ss[i];
						}
			
			
				}
		System.out.println("The longest  word in the given string is..."+l);
		System.out.println("The smallest word in the given string...."+m);

	}

}
