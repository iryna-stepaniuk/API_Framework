package StepDefinitions;

import Clients.AppointmentClient;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIStepDefinitions {

    @Then("Create appointment with {int}")
    public void createAppointmentWithDeptId(int deptId) {
        AppointmentClient appointment = AppointmentClient.builder()
                .deptId(deptId)
                .build();
        throw new io.cucumber.java.PendingException();
    }

}
