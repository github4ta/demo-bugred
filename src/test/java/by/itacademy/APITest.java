package by.itacademy;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class APITest {
    @Disabled
    @Test
    void testCreateNewUser() {
        String endPoint = "http://users.bugred.ru/tasks/rest/deleteuser";
        String name = "Bob2";
        String email = "Bob2@mail.com";
        String password = "123455";
        String requestBody = String.format("{\"name\":\"%s\",\"email\":\"%s\",\"password\":\"%s\"}",name,email,password);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(endPoint)
                .then().statusCode(200);
    }
    @Test
    void testGetUserInfo(){
        String endPoint = "http://users.bugred.ru/tasks/rest/getuser";
        String email = "yakush4@mail.ru";

        String requestBody = String.format("{\"email\":\"%s\"}",email);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .get(endPoint)
                .then().statusCode(200)
                .body("email",is(email));

    }
    @Test
    public void WeatherMessageBody()
    {
        String email = "yakush4@mail.ru";
        String requestBody = String.format("{\"email\":\"%s\"}",email);
        RestAssured.baseURI = "http://users.bugred.ru/tasks/rest";

        RequestSpecification httpRequest = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody);
        Response response = httpRequest.get("/getuser");

        // Retrieve the body of the Response
        ResponseBody body = response.getBody();

        // By using the ResponseBody.asString() method, we can convert the  body
        // into the string representation.
        System.out.println("Response Body is: " + body.asString());
    }
}
