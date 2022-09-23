package classesandobject;
import java.util.Scanner;
public class GradeStudentPrac {
	double tot=0,average;
	int t=0;
	public   int  calculateGrade(int[] a, int size)
       {
		
		for(int i=0;i<a.length;i++)
		{
			tot=tot+a[i];
		}
		average=tot/a.length;
		if(average>80)
		{
			t= 1;	
		}
		else if(average >60&&average<80)
		{
			t= 2;
		}
		else if(average<60)
		{
			t=3;
		}
		else if(average>99)
		{
			t=-1;
		}
       	return t;
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        GradeStudentPrac ob=new GradeStudentPrac();
        String s_name;
        int size=0;
        
        System.out.println("Enter the total number of subjects");
        size=sc.nextInt();
        if(size<0)
        {
        	System.out.println("Invalid input");
        	System.exit(0);
        }
        System.out.println("Enter the name of the student...");
       
         s_name=sc.next();
    
        //sc.next();
        int a[]=new int[size];
       System.out.println("Enter the marks of the student.... ");
       for(int i=0;i<size;i++)
       {
    	   a[i]=sc.nextInt();
    	   if(a[i]<0)
    	   {
    		   System.out.println("Invalid input");
    		   System.exit(0);
    	   }
       }
       System.out.println("===========================================================");
      
       int grade= ob.calculateGrade( a, size);
       System.out.println("Name of the Student :"+s_name);
       if(grade==1)
       {
    	  
    	   System.out.println("First Grade University");
       }
       else if(grade==2)
       {
    	
    	   System.out.println("Second grade University");
       }
       else if(grade==3)
       {
    	  	   System.out.println("Third Grade University");
       }
      
       System.exit(0);
       
        
        
	}

}
