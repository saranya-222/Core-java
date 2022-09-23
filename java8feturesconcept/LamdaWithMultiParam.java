package java8feturesconcept;
@FunctionalInterface
interface Multi {
	public int add(int a,int b);
}
public class LamdaWithMultiParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m=(a, b)->a+b;
		Multi m1=(p,q)->
				{
			     return p-q;
				};
				System.out.println("Object 1=m :"+m.add(6, 5));
				System.out.println("object 2=m1 :"+m1.add(5, 3));

	}

}
