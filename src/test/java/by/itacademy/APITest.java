package by.itacademy;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class APITest {
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
}
