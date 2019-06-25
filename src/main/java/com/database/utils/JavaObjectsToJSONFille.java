package com.database.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;*/


public class JavaObjectsToJSONFille {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, JsonGenerationException, JsonMappingException, IOException {

		Connection conn = null;
		OpcoDetails od= new OpcoDetails();
	
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/AllegisData", "root", "root");
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' LIMIT 1;");
		//ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' ;");
		
		
		while(rs.next()) {
			
			od.setOpcoName(rs.getString(1));
			od.setCurrentDate(rs.getString(2));
			od.setEmployees(rs.getInt(3));
			od.setLocation(rs.getString(4));
			
		}
		

		ObjectMapper om=new ObjectMapper();
		om.writeValue(new File("C:\\Users\\kpremkumar\\Documents\\allegis-automation-coe-training\\JSONFILES\\OpcoInfo.JSON"),od);
		
		conn.close();

	}

}
