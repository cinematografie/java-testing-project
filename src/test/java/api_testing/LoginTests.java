package api_testing;

import api_testing_main.RestAssuredConst;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTests {
    @Test
    public void getLoginUrlTest() {
        RestAssured.get(RestAssuredConst.TestWebsite.BASE_URL + RestAssuredConst.TestEndpoints.DoLogin)
                .then().statusCode(200);
    }

    @Test
    public void createNewUser(){
        Response response = given()
                .body("{ }")
                .contentType("application/json")
                .when()
                .post("https://petstore.swagger.io/v2/user")
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
    }

    public static String loginBody = """
            {
              "username": "someUsername",
              "password": "somePassword"
            }""";
    @Test
    public void sendLoginData() {
        Response response = given()
                .body(loginBody)
                .contentType("application/json")
                .when()
                .post("https://petstore.swagger.io/v2/user")
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void logoutUser() {
        Response response = given()
                .contentType("application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/logout")
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
    }
}
