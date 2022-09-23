package java8feturesconcept;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[10];
	//str[5]="Welcome";
		Optional<String> op=Optional.ofNullable(str[5]);
		if(op.isPresent())
		{
			String up=str[5].toUpperCase();
			System.out.println(up);
		}
		else
		{
			System.out.println("no value present at the 5th position");
		}
		

	}

}
