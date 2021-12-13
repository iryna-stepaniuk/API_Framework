package Steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import utils.EndPoints;

public class BasicSteps {
    public static void GetAll(String path) {
        ValidatableResponse res = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.BASE_URI+path)
                .then()
                .assertThat()
                .statusCode(200);
    }
    public static void GetById(String path, int id, int code) {
        ValidatableResponse res =
                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .when()
                        .get(EndPoints.BASE_URI + path + id)
                        .then()
                        .assertThat()
                        .statusCode(code);
    }
    public static void DeleteById(String path, int id, int code){
        ValidatableResponse res =
                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .when()
                        .delete(EndPoints.BASE_URI + path + id)
                        .then()
                        .assertThat()
                        .statusCode(code);
    }

    public static JsonPath Post(String path, String param, int code) {
        return
                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .body(param)
                        .when()
                        .post(EndPoints.BASE_URI + path)
                        .then()
                        .assertThat()
                        .statusCode(code)
                        .extract()
                        .body().jsonPath();
    }
}
