package api.getRequest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Example1 {


    @Test
    public void test(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification httpRequest= given();
        Response response=httpRequest.request(Method.GET,"api/users?page=2");
        int statusCode=response.getStatusCode();
        long responseTime=response.getTime();
        System.out.println("in test() status code is "+statusCode);
        System.out.println("in test1() response time is "+responseTime);

    }
    @Test
    public void test1(){
       Response response=RestAssured.get("https://reqres.in/api/users?page=2");
        int statusCode=response.getStatusCode();
        long responseTime=response.getTime();
        System.out.println("in test1() status code is "+statusCode);
        System.out.println("in test1() response time is "+responseTime);
    }
    @Test
    public void test2(){
        long responseTime=given().get("https://reqres.in/api/users?page=2").time();
        System.out.println("in test2() response time is "+responseTime);
    }
}
