package StepDefinitions;

import Steps.BasicSteps;
import Steps.CollectorSteps;
import io.cucumber.java.en.When;

public class CollectorStepDefinitions {
    @When("I Get all collectors")
    public void iGetAllCollectors() {
        CollectorSteps.GetAllCollectors();
    }

    @When("I Get collector by {int} with {int}")
    public void iGetCollectorById(int id, int code) {
        CollectorSteps.GetCollectorById(id,code);
    }

    @When("I create new collector with {string} and {int} and check {int}")
    public void iCreateNewCollector(String nickname, int fearFactor, int code) {
        CollectorSteps.PostCollector(nickname, fearFactor,code);
    }

    @When("I Delete collector by {int} with {int}")
    public void iDeleteCollectorByIdWithResponseCode(int id, int code) {
        CollectorSteps.DeleteCollector(id,code);
    }
}
