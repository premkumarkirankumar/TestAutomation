package com.database.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectingDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
	
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/AllegisData", "root", "root");
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA';");
		
		///*
		rs.next();
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println(rs.getString(4));
		//*/
		
		/*
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
		}
		*/
		conn.close();

	}

}
