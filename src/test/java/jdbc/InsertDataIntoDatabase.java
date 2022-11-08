package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDataIntoDatabase {

	public static void main(String[] args) throws SQLException {
		
		//step1: Create an object for driver
		Driver dbDriver=new Driver();
		
		//step 2: Register dbDriver to JDBC
		DriverManager.registerDriver(dbDriver);
		
		//step 3: Establish JDBC connection 
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
	
		//step 4: Create statement
		Statement statement=connection.createStatement();
		
		//step 5: Execute Query
		int result=statement.executeUpdate(" insert into wcsm18(EmpId,EmpName,Address)values(20,'Bhupen','Pune')");
		System.out.println("Rows Affected: "+result);
		
		ResultSet res=statement.executeQuery("select * from wcsm18");
		
		while(res.next())
		{
			System.out.println(res.getInt("EmpId")+"\t"+res.getString("EmpName")+"\t"+res.getString("Address")+"\t");
			
		}
		//step 6: close the connection
		connection.close();
	}

}
