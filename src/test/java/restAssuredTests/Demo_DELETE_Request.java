package restAssuredTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Demo_DELETE_Request {
	@BeforeClass
	
	public void deleteData() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/16";	
	}
	
	@Test
	public void testPost() {
		given()
		 
		.when()
		   .delete()
		.then()
		   .statusCode(200)
		   .log().all();
	}

}
