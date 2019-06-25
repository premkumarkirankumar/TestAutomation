package com.database.utils;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;*/


public class JSONToJavaObjects {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper om=new ObjectMapper();
		OpcoDetails od=om.readValue(new File("C:\\Users\\kpremkumar\\Documents\\allegis-automation-coe-training\\JSONFILES\\OpcoInfo.JSON"), OpcoDetails.class);
		
		System.out.println(od.getOpcoName());
		System.out.println(od.getEmployees());
		System.out.println(od.getLocation());

	}

}
