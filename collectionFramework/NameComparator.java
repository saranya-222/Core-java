package collectionFramework;

import java.util.Comparator;

public class NameComparator implements Comparator<Stu> {
	

	
	@Override
	public int compare(Stu o1, Stu o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
