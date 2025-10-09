package Jdbc;
import java.sql.*;
import javax.sql.*;

public class demo {

	public static void main(String[] args) throws Exception {
		
		String URL = "jdbc:mysql://localhost:3306/teegala";
		String USER = "root";
		String PASSWORD = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("The Driver is loaded");
    
    //step 2
    Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	System.out.println("Connection Established");
	
	//step-3 : statement creation
		Statement st = con.createStatement();
		
		//step-4 : execute a query
		st.executeUpdate("CREATE TABLE student(sid int,sname varchar(20))");
		System.out.println("Table created");
		
		st.close();
		con.close();
	}

}
