package Steps;

import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import utils.EndPoints;

import static org.junit.Assert.assertEquals;

public class CollectorSteps {
    public static void GetAllCollectors() {
        BasicSteps.GetAll(EndPoints.collector);
    }

    public static void GetCollectorById(int id, int code) {
        BasicSteps.GetById(EndPoints.collector, id, code);
    }

    public static int PostCollector(String nickname, int fearFactor, int code) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("nickname",nickname);
        requestParams.put("fearFactor",fearFactor);

        JsonPath jsonPostResponse = BasicSteps.Post(EndPoints.collector,requestParams.toJSONString(), code);

        Assertions.assertAll(
                () -> assertEquals(nickname, jsonPostResponse.get("nickname")),
                () -> assertEquals((Integer)fearFactor, jsonPostResponse.get("fearFactor"))
        );
        return jsonPostResponse.get("id");
    }
    public static void DeleteCollector(int id, int code) {
        BasicSteps.DeleteById(EndPoints.collector, id , code);
    }
}
