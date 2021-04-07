package api.postRequest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Example1 {

    @Test
    public void test(){
        RestAssured.baseURI="http://localhost:3000/";
        RequestSpecification httpReq=RestAssured.given();
        httpReq.header("Content-Type","application/json");
        HashMap<String,String> map=new HashMap<>();
        map.put("id","5");
        map.put("title","java");
        map.put("author","abc");
        JSONObject jsonObject=new JSONObject(map);


        httpReq.body(jsonObject.toJSONString());
        Response response=httpReq.request(Method.POST,"posts/");
        int code=response.statusCode();
        System.out.println("response code is "+code);
        System.out.println("response time is "+response.time());
        Assert.assertEquals(code,201);

    }


}
