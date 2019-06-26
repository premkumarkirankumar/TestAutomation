package databaseUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;*/



public class JavaObjectsToMultipleJSONFille {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, JsonGenerationException, JsonMappingException, IOException {

		Connection conn = null;
		ArrayList<OpcoDetails> a=new ArrayList<OpcoDetails>();

	
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/AllegisData", "root", "root");
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' ;");
		
		
		while(rs.next()) {
			OpcoDetails od= new OpcoDetails();
			od.setOpcoName(rs.getString(1));
			od.setCurrentDate(rs.getString(2));
			od.setEmployees(rs.getInt(3));
			od.setLocation(rs.getString(4));
			a.add(od);
			
		}
		

		for(int i=0;i<a.size();i++)
		{
		ObjectMapper om=new ObjectMapper();
		om.writeValue(new File("C:\\Users\\kpremkumar\\Documents\\allegis-automation-coe-training\\JSONFILES\\OpcoInfo"+i+".JSON"),a.get(i));
		}
		conn.close();

	}

}
