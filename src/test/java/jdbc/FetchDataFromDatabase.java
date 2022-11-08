package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromDatabase {

	public static void main(String[] args) throws SQLException{
		
		//Step 1 created an object for db driver
		Driver dbDriver= new Driver();
		
		//Import Driver from com.mysql.cj.jdbc only'
		//new Driver(); throws SQLException
		
		//Step 2 Register this dbdriver to JDBC
		DriverManager.registerDriver(dbDriver);
		
		//step 3: Establish the JDBC connection
		//Import Connection, statement and ResultSet from java.sql package only
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
	
		//Step 4: Create the statement
		Statement statement=connection.createStatement();
		
		//step 5: Execute the query
		ResultSet result=statement.executeQuery("select * from wcsm18");
		
		//step 6: Fetch the data
		while(result.next())
		{
			System.out.println(result.getInt("EmpId")+"\t"+result.getString("EmpName")+"\t"+result.getString("Address"));
			
		}
		
		//step 7: close database connection
		connection.close();
	}

}
