package jdbcConcept;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class ProcedureCallEx {
	 Connection con;
	 CallableStatement cs;
	 PreparedStatement ps;
	 ResultSet rs;


	public ProcedureCallEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getConnection();
		System.out.println("Connection gets established.........");
		}
	public void insertDetails(int rollno,String name,float percentage ,String dob,String email,long phone,String city) throws SQLException
	{
		cs=con.prepareCall("{call(insertDetails(?,?,?,?,?,?,?)}");
		cs.setInt(1, rollno);
		cs.setString(2, name);
		cs.setFloat(3,percentage);
		cs.setObject(4,dob);
		cs.setString(5, email);
		cs.setLong(6, phone);
		cs.setString(7, city);
		cs.execute();
		System.out.println("Records are inserted");
	}
   public void viewAll() throws SQLException
   {
	   ps=con.prepareStatement("select * from student_details");
	   rs=ps.executeQuery();
	   while(rs.next())
	   {
		   System.out.print(rs.getInt(1)+"\t");
		   System.out.print(rs.getString(2)+"\t");
		   System.out.print(rs.getFloat(3)+"\t");
		   System.out.print(rs.getObject(4)+"\t");
		   System.out.print(rs.getString(5)+"\t");
		   System.out.print(rs.getLong(6)+"\t");
		   System.out.print(rs.getString(7)+"\t");
		   System.out.println();
		   
	   }
	  
   }
   public void displayMinMax(float min,float max) throws SQLException
   {
	   ps=con.prepareStatement("select * from  Student_details where percentage between =? and =? order by desc");
	   ps.setFloat(1, min);
	   ps.setFloat(2, max);
	   rs=ps.executeQuery();
	   while(rs.next())
	   {
		   System.out.print(rs.getInt(1)+"\t");
		   System.out.print(rs.getString(2)+"\t");
		   System.out.print(rs.getFloat(3)+"\t");
		   System.out.print(rs.getObject(4)+"\t");
		   System.out.print(rs.getString(5)+"\t");
		   System.out.print(rs.getLong(6)+"\t");
		   System.out.print(rs.getString(7)+"\t");
		   System.out.println();
		   
	   }
	   
   }
	   public void viewOnCondition(int rollno) throws SQLException
	   {
		 ps=con.prepareStatement("select * from Student_details where rollno=?");   
		 ps.setInt(1, rollno);
		 rs=ps.executeQuery();
		   while(rs.next())
		   {
			   System.out.print(rs.getInt(1)+"\t");
			   System.out.print(rs.getString(2)+"\t");
			   System.out.print(rs.getFloat(3)+"\t");
			   System.out.print(rs.getObject(4)+"\t");
			   System.out.print(rs.getString(5)+"\t");
			   System.out.print(rs.getLong(6)+"\t");
			   System.out.print(rs.getString(7)+"\t");
			   System.out.println();
			   
		   }
	   
	   }
	   
    public void viewByCity(String city) throws SQLException
    {
    	ps=con.prepareStatement("select * from Student_details where city=?");
   	 ps.setString(1,city);
		 rs=ps.executeQuery();
		   while(rs.next())
		   {
			   System.out.print(rs.getInt(1)+"\t");
			   System.out.print(rs.getString(2)+"\t");
			   System.out.print(rs.getFloat(3)+"\t");
			   System.out.print(rs.getObject(4)+"\t");
			   System.out.print(rs.getString(5)+"\t");
			   System.out.print(rs.getLong(6)+"\t");
			   System.out.print(rs.getString(7)+"\t");
			   System.out.println();
   }
    }
    	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		int rollno,choice = 0;
		String name,dob,city,email;
		float percentage;
		long phone;
		ProcedureCallEx ob=new ProcedureCallEx();
		System.out.println("Enter the required choice...");
		choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Enter the roll no....");
		    rollno=sc.nextInt();
		    System.out.println("Enter the student name.....");
		    name=sc.next();
		    System.out.println("Enter the percentage.....");
		    percentage=sc.nextFloat();
		    System.out.println("Enter the date of birth(YYYY-MM-DD)....");
		    dob=sc.next();
		    System.out.println("Enter the email id....");
		    email=sc.next();
		    System.out.println("Enter the phone number.....");
		    phone=sc.nextLong();
		    System.out.println("Enter the city name....");
		    city=sc.next();
		    System.out.println();
	    	 ob.insertDetails(rollno, name, percentage, dob,email, phone, city);
	    	 break;
	    
	    case 2:
	    	    ob.viewAll();
	    	    break;
	    case 3:
	    	System.out.println("Enter the roll no...");
	    	rollno=sc.nextInt();
	    	 ob.viewOnCondition(rollno);
	    	 break;
	    case 4:
	    	 System.out.println("Enter the city name.....");
	    	 city=sc.next();
	    	 ob.viewByCity(city);
	    	 break;
	    case 5:
	    	System.out.println("Enter the minimum percentage...");
	    	float min=sc.nextFloat();
	    default :
	    	
	    	System.out.println("Invalid Choice....");
	    }	    

	}

}
