package objectConcept;

public class AutoBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i=a;// Autoboxing ,from java version 5
		Integer j=Integer.valueOf(a);// before java version 5
		System.out.println(a+" "+i+" "+j);
		System.out.println();
		Integer x=new Integer(20);
		int y=x;//unboxing,from java version 5
		int z=x.intValue();//before java version 5
		System.out.println(x+" "+y+" "+z);
		

	}

}
