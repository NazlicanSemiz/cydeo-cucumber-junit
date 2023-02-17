package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
        //TODO: fix this later THIS IS REMAINDER
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }


}


/*
TC#50: Create a new feature file and new scenarios
1. Create a new feature file named Login.feature
2. Create 3 new scenarios from the below provided user story.
3. User Story:
As a user, I should be able to login with correct credentials to different accounts.
And dashboard should be displayed.
Accounts are: librarian, student, admin
4. Create a new step definition class under step_definitions package
named: LoginStepDefs
5. Run the code. Get the step definitions from the console
6. No Java-selenium code implementation needed. Just add printing line in the
implementation regarding what should be happening when the code is ran.
Ex: “User is on the login page”
 */