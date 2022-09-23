package basicConcept;
public class MarksDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0,j=0,s=0;
		int roll[]= {1,2,3,4,5};
		int marks[]= {65,58,89,42,76};
		for(int i=0;i<marks.length-1;i++)
		{
			for( j=i+1;j<marks.length;j++)
			{
				if(marks[i]<marks[j])
				{
					t=marks[i];
					marks[i]=marks[j];
					marks[j]=t;
					s=roll[i];
					roll[i]=roll[j];
					roll[j]=s;					
				}
			}
		}
			System.out.println("Descending order of marks.....");
			System.out.print("ROLLNO:"+" ");
			for(int i=0;i<marks.length;i++)
			{
			    System.out.print( roll[i]+"\t ");	
			}
			System.out.println();
			System.out.print("MARKS:"+" ");
			for(int i=0;i<marks.length;i++)
			{
				System.out.print(marks[i]+" \t ");
			}
		}
	  
	}


