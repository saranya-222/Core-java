package java8feturesconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WithStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("AbinayaSri","Bolenath","ThanvKrish","Vigneshwaran","Yuva","Guru");
		//Creating Stream
		Stream<String> names=l.stream(); 
		//doing intermediate operation
		Stream<String> Allnames=names.filter(str->str.length()>7);
		//Terminal operation
		Allnames.forEach(str->System.out.print(str+" "));//printing the names

	}

}