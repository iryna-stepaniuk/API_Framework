package Steps;

import io.restassured.path.json.JsonPath;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Assertions;
import utils.EndPoints;

import static org.junit.Assert.assertEquals;

public class StudentSteps {

    public static void GetAllStudents() {
        BasicSteps.GetAll(EndPoints.student);
    }

    public static void GetStudentById(int id, int code) {
        BasicSteps.GetById(EndPoints.student, id, code);
    }

    public static int PostStudent(String name, int age, boolean sex, int risk, int code) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name",name);
        requestParams.put("age",age);
        requestParams.put("sex",sex);
        requestParams.put("risk",risk);

        JsonPath jsonPostResponse = BasicSteps.Post(EndPoints.student,requestParams.toJSONString(), code);
        Assertions.assertAll(
                () -> assertEquals("Name of created student is incorrect", name, jsonPostResponse.get("name")),
                () -> assertEquals("Sex of created student is incorrect", sex, jsonPostResponse.get("sex")),
                () -> assertEquals("Age of created student is incorrect", (Integer)age, jsonPostResponse.get("age")),
                () -> assertEquals("Risk of created student is incorrect", (Integer)risk, jsonPostResponse.get("risk"))
        );
        return jsonPostResponse.get("id");
    }
    public static void DeleteStudent(int id, int code) {
        BasicSteps.DeleteById(EndPoints.student, id , code);
    }
}
