package restAssuredTests;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Demo_PUT_Request {
	
	public static HashMap<String,String> map= new HashMap<String,String>();
	

	/*String empName=RestUtils.empName();
	String empAge=RestUtils.empAge();
	String empSalary=RestUtils.empSalary();*/
	static int emp_id=6;	
	
	@BeforeClass
	public void putDate() {
		
	   /* map.put("name",empName);
		map.put("age", empAge);
		map.put("salary", empSalary);*/
		
		map.put("empName",RestUtils.empName());
		map.put("empAge",RestUtils.empAge());
		map.put("empSalary",RestUtils.empSalary());
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+emp_id;
			
	}
	@Test
	public void testPUT() {
		
		given()
		   .contentType("application/json")
		   .body(map) 
		.when()
		   .put()
		.then()
		.statusCode(200)
		.log().all();
	}

}
