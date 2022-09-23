package java8feturesconcept;
@FunctionalInterface
interface Print{
	public String printable(String s1);
	
}
public class LamdaWithstrngParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p1=(s1)->
		{
			return "Hello "+s1;
		};
  System.out.println("Output :"+p1.printable("Saranya"));

}
}
