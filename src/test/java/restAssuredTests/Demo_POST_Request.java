package restAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo_POST_Request {
	
	public static HashMap<String,String> map =new HashMap<String,String>();
	
	
	@BeforeClass
	public void postData() {
		map.put("FirstNme",RestUtils.getFirstName());
		map.put("LastName",RestUtils.getLastName());
		map.put("getUserName",RestUtils.getUserName());
		map.put("getPassword",RestUtils.getPassword());
		map.put("getEmail",RestUtils.getEmail());
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";	
	}
	
	@Test
	public void testPost() {
		given()
		   .contentType("application/json")
		   .body(map)
		.when()
		   .post()
		.then()
		   .statusCode(201)
		   .and()
		   .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		   .and()
		   .body("Message",equalTo("Opertion completed succesfully"));
	}

}
