package jdbcConcept;
import java.sql.*;
import java.util.Scanner;

import javax.naming.spi.ObjectFactoryBuilder;

public class PreparedStatementEx {
	Statement s;
	PreparedStatement ps;
	Connection con;
	ResultSet rs;
	public PreparedStatementEx() throws SQLException, ClassNotFoundException
	{
		con=MyConnection.getConnection();
		System.out.println("Connection gets started....");
		s=con.createStatement();
	//	s.execute("create table Info (id int,name varchar(30),phone_number varchar(30),city varchar(40))");
		//System.out.println("Table created successfully....");
		
			}
	public void getDataBySalary(float min,float max) throws SQLException
	{
	ps=con.prepareStatement("select * from employee_details where price between ? and ?");
	ps.setFloat(1, min);
	ps.setFloat(2, max);
	rs=ps.executeQuery();
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getFloat(3)+"\t");
		System.out.print(rs.getDate(4)+"\t");
		System.out.print(rs.getString(5)+"\t");
		System.out.print(rs.getString(6)+"\t");
		System.out.println();
	}
	}
   public  void insertValues(int id,String name,long phone,String city) throws SQLException
   {
	   ps= con.prepareStatement("insert into Info values(?,?,?,?)");
	   ps.setInt(1, id);
	   ps.setString(2, name);
	   ps.setLong(3, phone);
	   ps.setString(4, city);
	   int x=ps.executeUpdate();
	   System.out.println(x+"Data inserted successfully...");
	   
   }
   public void updateValues(int id,long phone) throws SQLException
   {
	   ps=con.prepareStatement("update customer_info set phone_number = ? where id =? ");
	   ps.setLong(1, phone);
	   ps.setInt(2, id);
	   ps.executeUpdate();
	   System.out.println("Data updated successfully....");
   }
   public void deleteRecord(int id) throws SQLException
   {
	   ps=con.prepareStatement("delete from customer_info where id=?");
	   ps.setInt(1, id);
	   ps.executeUpdate();
	   System.out.println("Record deleted successfully....");
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		PreparedStatementEx ob= new PreparedStatementEx();
	// System.out.println("Enter the mn and maxi salary range...");
	/* float min=sc.nextFloat();
	 float max=sc.nextFloat();
	 PreparedStatementEx ob= new PreparedStatementEx();
	 ob.getDataBySalary(min,max);
	 System.out.println("\n\n\n");
	 System.out.println("Enter the id..");
     int id=sc.nextInt();
     System.out.println("Enter the employee name..");
     String name=sc.next();
     System.out.println("Enter the phone number..");
     long phone=sc.nextLong();
     System.out.println("Enter the city name..");
     String city=sc.next();
    ob.insertValues(id, name, phone, city);*/
    System.out.println("Enter the customer id to update phone number....");
   int id=sc.nextInt();
   System.out.println("Enter the phone number ..");
    Long phone=sc.nextLong();
  
    ob.updateValues(id, phone);
    System.out.println("Enter the id to delete to delete the record....");
    id=sc.nextInt();
    ob.deleteRecord(id);
	}

}
