package collectionFramework;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
   public Employee(int id,String name,int age)
   {
	   super();
	   this.id=id;
	   this.name=name;
	   this.age=age;
   }
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		 return 0;
		else if(age>o.age)
			return 1;
		else 
			return -1;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
		
	}

