package RestAssuredAPI.RestAssuredAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET {
	
	@Test
	void getweather() {
		
		//Specify Base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response Object
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//Print response in console window
		String responsebody = response.getBody().asString();
		
		System.out.println("responsebody is "+responsebody);
		// converts json format to string format
	}

}
