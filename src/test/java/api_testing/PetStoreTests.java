package api_testing;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class PetStoreTests {

    public static String newPetBody = """
            {
              "id": "0",
              "name": "cat",
              "status": "available"
            }""";

    @Test
    public void createNewPetHappyPath() {
        Response response = given()
                .body(newPetBody)
                .contentType("application/json")
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertTrue(response.asString().contains("cat"));
    }

    public static String updatePetBody =
            """
                    {
                      "id": "333",
                      "name": "chia",
                      "status": "sold"
                    }""";

    @Test
    public void updatePet(){
        Response response = given()
                .contentType("application/json")
                .body(updatePetBody)
                .when()
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertTrue(response.asString().contains("chia"));
    }
}