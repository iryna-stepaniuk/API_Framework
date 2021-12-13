package StepDefinitions;

import Steps.BasicSteps;
import Steps.DebtSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import utils.EndPoints;

public class DebtStepDefinitions {
    @When("I Get all debts")
    public void iGetAllDebts() {
        DebtSteps.GetAllDebts();
    }

    @When("I Get debt by {int} with {int}")
    public void iGetDebtById(int id, int code) {
        DebtSteps.GetDebtById(id, code);
    }

    @When("I create new debt with {int} {float} {float} and check {int}")
    public void iCreateNewDebtWithStudentIdAmountMonthlyPercent(int studentId, float amount, float monthlyPercent, int code) {
        DebtSteps.PostDebt(studentId,amount,monthlyPercent, code);
    }

    @When("I Delete debt by {int} with {int}")
    public void iDeleteDebtByIdWithResponseCode(int id, int code) {
        DebtSteps.DeleteDebt(id,code);
    }
}
