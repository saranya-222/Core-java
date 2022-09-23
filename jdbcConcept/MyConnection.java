package jdbcConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
  static Connection c;
  public static Connection getConnection() throws ClassNotFoundException, SQLException
  {
	  if(c==null)
	  {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_details","root","saran22");
		 return c;
	  }
	  else
	  {
		  return c;
	  }
		  
  }
}
