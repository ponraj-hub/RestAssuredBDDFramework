package restAssuredTests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;


public class SingleAndMultipleContent {
	
	@Test(priority=1)
	//status code and log response
	public void getId() {
		given().when().get("https://jsonplaceholder.typicode.com/posts/5").then().statusCode(200)
		.log().all();	
	}
	
	@Test(priority=2)
	//Single content using JSON Path finder
	public void testSingleContent()
	{
		given()
		.when()
		  .get("https://jsonplaceholder.typicode.com/posts/5")
		.then()
		  .statusCode(200)
		  .body(".title",equalTo("nesciunt quas odio"));
	}
	

	@Test(priority=3)
	//Multiple content using JSON path finder
	public void testMultipleContent()
	{
		given()
		.when()
		  .get("https://services.groupkt.com/country/get/all")
		.then()
		  .statusCode(200)
		  .body("RestResponse.result.name",hasItems("India","Australia","Srilanka"));
	}

	private ResponseAwareMatcher<Response> hasItems(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//parameter and header passing
	@Test(priority=4)
	//Single content using JSON Path finder
	public void testParamAndHeaders()
	{
		given()
		 .param("MyName", "Ponraj")
		 .header("MyHeader","INDIAN")
		.when()
		  .get("https://services.groupkt.com/country/get/all")
		.then()
		  .statusCode(200);
	}
	
}
