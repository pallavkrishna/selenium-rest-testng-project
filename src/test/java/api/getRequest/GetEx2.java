package api.getRequest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetEx2
{

    @Test
    public void get(){
        RestAssured.baseURI="http://localhost:3000";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/posts");
        response.getBody().print();
    }
}
