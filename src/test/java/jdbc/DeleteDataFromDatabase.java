package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		
		//step1: create an object for driver
		Driver dbdriver=new Driver();
		
		//step2: Register dbDriver to JDBC
		DriverManager.registerDriver(dbdriver);
		
		//step3: Establish Jdbc connection 
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel", "root", "root");
	
		//step4: Create statement
		Statement statement=connection.createStatement();
		
		//step5: Execute the Query
		int result=statement.executeUpdate("delete from wcsm18 where EmpId=11");
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
