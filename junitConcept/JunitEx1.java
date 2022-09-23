package junitConcept;

public class JunitEx1 {

	public int square(int a)
	{
		return a*a;
	}
	public int count(String a)
	{
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='A')
				count++;
		}
		return count;
	}

}
