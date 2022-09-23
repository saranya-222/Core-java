package classesandobject;
import java.util.Scanner;
public class SecondLarge {
	int t=0,j,s;
    public int input(int a[],int size)
    {
    	//this.a[size]=d[size];
    	//this.size=size;
		
    	for(int i=0;i<size;i++)
    	{
    		
    			if(a[i]>t)
    			{
    			 t=a[i];
    			}
    		
    	}
    		for( int i=0;i<size;i++)
        	{
        		
        			if(a[i]>s&&a[i]<t)
        			{
        			 s=a[i];
        			}
        	}	
    	
    	return(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array....");
		 size=sc.nextInt();
		 if(size<0)
			{
				System.out.println("Invalid size array...");
				System.exit(0);
			}
		int d[]=new int[size];
		
		System.out.println("Enter the array elements....");
			for(int i=0;i<size;i++)
			{
				d[i]=sc.nextInt();
				if(d[i]<0)
				{
					System.out.println("Invalid input");
				System.exit(0);
				}
			}
		
		SecondLarge ob=new SecondLarge();
		int s=ob.input(d,  size);
		System.out.println("Second largest...."+s);

	}

}
