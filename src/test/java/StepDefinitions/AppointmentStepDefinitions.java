package StepDefinitions;

import Steps.AppointmentSteps;
import io.cucumber.java.en.When;

public class AppointmentStepDefinitions {

    @When("Create appointment with {int} and check {int}")
    public void createAppointmentWithDeptId(int debtId, int code) {
        AppointmentSteps.PostAppointment(debtId, code);
    }

    @When("I Get all appointments")
    public void iGetAllAppointments() {
        AppointmentSteps.GetAllAppointments();
    }

    @When("I Get appointment by {int} with {int}")
    public void iGetAppointmentById(int id, int code) {
        AppointmentSteps.GetAppointmentById(id, code);
    }

    @When("I Delete appointment by {int} with {int}")
    public void iDeleteAppointmentByIdWithResponseCode(int id, int code) {
        AppointmentSteps.DeleteAppointment(id,code);
    }
}
