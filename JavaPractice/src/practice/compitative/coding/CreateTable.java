package practice.compitative.coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception 
	{
		// Initialize an appropriate JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Connect DB server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl2","webinar","webinar");
		
		// Create a provision for passing SQL queries to connected database
		Statement st = con.createStatement();
		
		// Passing SQL query to create DB table
		String sql = "create table emp(empno number(5), ename varchar(30), sal number(10,2), primary key (empno))";
		
		try
		{
			st.execute(sql);
			System.out.println("DB table created.....!");
		}
		catch(Exception e)
		{
			System.out.println("ERROR :"+e.getMessage());
		}
		finally
		{
			// Close the connection with DB
			st.close();
			con.close();
		}
		

	}

}
