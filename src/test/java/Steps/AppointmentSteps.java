package Steps;

import io.cucumber.java.af.En;
import io.cucumber.java.sl.In;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.junit.Assert;
import utils.EndPoints;

public class AppointmentSteps {
    public static void GetAllAppointments() {
        BasicSteps.GetAll(EndPoints.appointment);
    }

    public static void GetAppointmentById(int id, int code) {
        BasicSteps.GetById(EndPoints.appointment, id, code);
    }

    public static int PostAppointment(int debtId, int code) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("debtId", debtId);

        JsonPath jsonPostResponse = BasicSteps.Post(EndPoints.appointment,requestParams.toJSONString(), code);

        Assert.assertEquals((Integer)debtId, jsonPostResponse.get("debtId"));

        return jsonPostResponse.get("id");
    }
    public static void DeleteAppointment(int id, int code) {
        BasicSteps.DeleteById(EndPoints.appointment, id , code);
    }
}
