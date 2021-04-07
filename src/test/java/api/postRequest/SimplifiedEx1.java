package api.postRequest;

import io.restassured.http.Method;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

/*import io.restassured.matcher.RestAssuredMatchers.*;
import   org.hamcrest.Matchers.*;*/

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class SimplifiedEx1 {

    @Test
    public void test(){
        baseURI="http://localhost:3000/";
        HashMap<String,String> map=new HashMap<>();
        map.put("id","7");
        map.put("title","java");
        map.put("author","abc");
        for(Map.Entry<String,String> print: map.entrySet()){
            System.out.println(print.getKey());
            System.out.println(print.getValue());
        }
       /* JSONObject jsonObject=new JSONObject(map);
        given().
                header("Content-Type","application/json").
        when().
                body(jsonObject.toJSONString()).
        and().
                 request(Method.POST,"ports/").
        then().statusCode(201);*/
    }
}
