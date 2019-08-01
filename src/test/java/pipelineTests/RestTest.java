package pipelineTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class RestTest {
	
	
	//@Test
	 public void GetWeatherDetailsCondensed() {
		
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/Hyderabad");
	System.out.println("Response Body is =>  " + response.asString());
	 }	
	
	@Test
	public void requestConsole() {

		RestAssured.baseURI ="https://petstore.swagger.io";
		String value = "available";
		
		RestAssured.given().param("status", value).when().get("api/now/table/sc_request").then().assertThat().statusCode(200);
		Response response = RestAssured.given().param("status",value).when().get("v2/pet/findByStatus");
		System.out.println(response.asString());


	}
	

}
