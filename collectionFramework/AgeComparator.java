package collectionFramework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Stu> {

	@Override
	public int compare(Stu o1, Stu o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
		return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}

}
