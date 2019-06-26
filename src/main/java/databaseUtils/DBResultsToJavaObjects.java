package databaseUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBResultsToJavaObjects {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn = null;
	
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/AllegisData", "root", "root");
		
		Statement st=conn.createStatement();
		//ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' LIMIT 1;");
		ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' ;");
		
		
		while(rs.next()) {
			OpcoDetails od= new OpcoDetails();
			od.setOpcoName(rs.getString(1));
			od.setCurrentDate(rs.getString(2));
			od.setEmployees(rs.getInt(3));
			od.setLocation(rs.getString(4));
			
			System.out.println(od.getOpcoName());
			System.out.println(od.getCurrentDate());
			System.out.println(od.getEmployees());
			System.out.println(od.getLocation());
		}
		conn.close();

	}

}
