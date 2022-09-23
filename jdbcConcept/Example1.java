package jdbcConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_details", "root","saran22" );
		//create statement
		Statement s=c.createStatement();
		//execute statement
		ResultSet rs=s.executeQuery("Select * from contact");
		System.out.println("<table><tr><th>Id</th><th>name</th><th>phone</th>");
				while(rs.next())
				{
					System.out.print("<td>"+rs.getInt("contact_id")+"</td>");
					System.out.print("<td>"+rs.getString("name")+"</td>");
					System.out.println("<td>"+rs.getLong("phone")+"</td></table>");
					System.out.println();
				}
				
		 s.close();
		 c.close();
	}

}
