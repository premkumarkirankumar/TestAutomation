package com.database.utils;

/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.json.JsonObject;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import groovy.json.StringEscapeUtils;

public class JavaObjectsToNestedJSONFille {

	public static void main(String[] args)
			throws SQLException, ClassNotFoundException, JsonGenerationException, JsonMappingException, IOException {

		Connection conn = null;
		ArrayList<OpcoDetails> a = new ArrayList<OpcoDetails>();
		JSONArray ja = new JSONArray();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AllegisData", "root", "root");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from OpcoInfo where CurrentDate=CURDATE() and Location ='NA' ;");

		while (rs.next()) {
			OpcoDetails od = new OpcoDetails();
			od.setOpcoName(rs.getString(1));
			od.setCurrentDate(rs.getString(2));
			od.setEmployees(rs.getInt(3));
			od.setLocation(rs.getString(4));
			a.add(od);

		}

		for (int i = 0; i < a.size(); i++) {
			Gson g = new Gson();
			String jsonString = g.toJson(a.get(i));
			ja.add(jsonString);
		}

		JSONObject jo = new JSONObject();
		jo.put("result", ja);
		
		System.out.println(jo.toJSONString());
		
		String unescapeString= StringEscapeUtils.unescapeJava(jo.toJSONString());
		
		System.out.println(unescapeString);
		
		String string1= unescapeString.replace("\"{", "{");
		String finalJson=string1.replace("}\"", "}");
		
		System.out.println(finalJson);
		
		try(FileWriter file = new FileWriter("C:\\Users\\kpremkumar\\Documents\\allegis-automation-coe-training\\JSONFILES\\Single.JSON")) {
			file.write(finalJson);
		}
		

		
		
		conn.close();

	}

}
*/