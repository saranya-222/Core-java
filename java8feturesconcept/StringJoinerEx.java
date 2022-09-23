package java8feturesconcept;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringJoiner j=new StringJoiner(",");
      j.add("Ravi");
      j.add("Raghu");
      j.add("Renu");
      j.add("Ram");
      j.add("jaanu");
      j.add("Malar");
      j.add("Manas");
      System.out.println("Using delimiter :"+j);
      System.out.println("\n\n");
      StringJoiner j1=new StringJoiner("-","{" ,"}");
      j1.add("Ravi");
      j1.add("Raghu");
      j1.add("Renu");
      j1.add("Ram");
      j1.add("jaanu");
      j1.add("Malar");
      j1.add("Manas");
      System.out.println("Using delimieter,prefix and suffix :"+j1);
      
      String convert=j1.toString();
      System.out.println("\n joiner toString :"+convert);
      System.out.println("char at index 6 :"+convert.charAt(6));
	}

}
