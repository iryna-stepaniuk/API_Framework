package Steps;

import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import utils.EndPoints;

import static org.junit.Assert.assertEquals;

public class DebtSteps {
    public static void GetAllDebts() {
        BasicSteps.GetAll(EndPoints.debt);
    }

    public static void GetDebtById(int id, int code) {
        BasicSteps.GetById(EndPoints.debt, id, code);
    }

    public static int PostDebt(int studentId, float amount, float monthlyPercent, int code) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("studentId",studentId);
        requestParams.put("amount",amount);
        requestParams.put("monthlyPercent",monthlyPercent);

        JsonPath jsonPostResponse = BasicSteps.Post(EndPoints.debt,requestParams.toJSONString(), code);

        Assertions.assertAll(
                () -> assertEquals((Integer)studentId, jsonPostResponse.get("studentId")),
                () -> assertEquals((Float)amount, jsonPostResponse.get("amount")),
                () -> assertEquals((Float)monthlyPercent, jsonPostResponse.get("monthlyPercent"))
        );
        return jsonPostResponse.get("id");
    }
    public static void DeleteDebt(int id, int code) {
        BasicSteps.DeleteById(EndPoints.debt, id , code);
    }
}
