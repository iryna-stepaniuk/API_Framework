package StepDefinitions;

import Models.Student;
import Steps.StudentSteps;
import io.cucumber.java.en.*;

public class StudentStepDefinitions {

    @When("Create student with {string} {int} {} {int} and check {int}")
    public void createStudentWithNameAgeSexRisk(String name, int age, boolean sex, int risk, int code ) {
        int id = StudentSteps.PostStudent(name, age, sex, risk, code);
    }

    @When("I Get all students")
    public void iGetAllStudents() {
        StudentSteps.GetAllStudents();
    }

    @When("I Get student by {int} with {int}")
    public void iGetStudentById(int id, int code) {
        StudentSteps.GetStudentById(id, code);
    }

    @When("I Delete student by {int} with {int}")
    public void iDeleteStudentByIdWithResponseCode(int id, int code) {
        StudentSteps.DeleteStudent(id, code);
    }
}
