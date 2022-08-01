package Electricity;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectionclass {
	Connection cn;
	Statement stm;
	public connectionclass(){
	
	try{
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//create connection
		String url="jdbc:mysql://localhost:3306/billing";
		String user="root";
		String pass="root";
		cn=DriverManager.getConnection(url,user,pass);
		if(cn!=null)
		{
			System.out.println("connection is created sucessfully");
		}
		else{
			System.out.println("connection is not created");
		}
        cn.close();
}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
