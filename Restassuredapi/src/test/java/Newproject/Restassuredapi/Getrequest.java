package Newproject.Restassuredapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrequest {
  @Test
  public void getmethod() {
	  
	  RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
	  
	  
	  RequestSpecification httpreq=RestAssured.given();
	  
	  Response response = httpreq.request(Method.GET);
	  
	  String res_body=response.getBody().asString();
	  System.out.println(res_body);
  }
}
