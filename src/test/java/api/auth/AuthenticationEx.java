package api.auth;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuthenticationEx
{
    @BeforeClass
    public void setup(){
        RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA","TestPassword");
    }
    @Test
    public void test(){
        int code=RestAssured.given()
                .get("https://restapi.demoqa.com/authentication/CheckForAuthentication")
                .getStatusCode();
        System.out.println(code);
    }
}
