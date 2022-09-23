package java8feturesconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("AbinayaSri","Bolenath","ThanvKrish","Vigneshwaran","Yuva","Guru");
		List<String>names=l.stream().filter(str->str.length()>6&&str.length()<10).collect(Collectors.toList());
		names.forEach(str->System.out.println(str+" "));
       //Method refernce->It is a short hand notation of lamda expression
		names.forEach(System.out::println);
	}

}
