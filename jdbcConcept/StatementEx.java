package jdbcConcept;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	Connection c;
	Statement s;
	ResultSet rs;
	public StatementEx () throws ClassNotFoundException, SQLException
	{
		c=MyConnection.getConnection();
		System.out.println("Connection get Starts");
	}
	public void getData() throws SQLException
	{
		s=c.createStatement();
		rs=s.executeQuery("select * from contact");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t\t");
			System.out.print(rs.getString(2)+"\t\t");
			System.out.print(rs.getLong(3)+"\t\t");
			System.out.println();
		}
		s.close();
		c.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StatementEx ob=new StatementEx();
		ob.getData();

	}

}
