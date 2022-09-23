package designPatternConcept;
interface Iterator
{
	public static boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	public Object next();
}
interface Container
{
	public Iterator getIterator();
}
/*class CollectioNames implements Container
{
 String names[]= {"riya","Raj","Ravi","Raghu","Ram"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		//return new IterateCollectionOfNames();
	}
}
/* private  class IterateCollectionOfNames implements Iterator
 {
	 int i;

	/*@Override
/*	public boolean hasNext() {
		
		if(i<names.length)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	@Override
	public Object next() {
        if(this.hasNext())
        {
        	return(names[i+1]);
        }
        else
        {
		return null ;
        }
	}
	 
 }
	
}
public class IteratorPatternEx {

	public static void main(String[] args) {
      CollectioNames ob=new CollectioNames();
      for ( Iterator Iterator: ob.getIterator();Iterator.hasNext();) {
		
	}
      

	}

}*/
