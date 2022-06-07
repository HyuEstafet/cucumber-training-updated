package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GherkinSyntaxSteps {
    List<Map<String, String>> dataStudents;
    private List<String> studentsList = new ArrayList<>();


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("The user is on the homepage");
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_user_login_button() {
        System.out.println("User clicks on the login button");
    }

    @When("user inserts a {}")
    public void user_inserts_a(String string) {
        System.out.println("User inserts a username and a password");
    }

    @When("user presses the user login button")
    public void user_presses_the_user_login_button() {
        System.out.println("User presses the user login button");
    }

    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        System.out.println("Logged in successfully");
    }

    @When("user inserts an invalid {}")
    public void user_inserts_an_invalid(String string) {
        System.out.println("User inserts a username and a password (invalid)");

    }

    @Then("fails to login")
    public void fails_to_login() {
        System.out.println("Login failed");

    }

    @Given("user enters payroll number as {}")
    public void user_enters_payroll_number_number_as(String string) {
        System.out.println("User inserts a payroll number");

    }

    @When("user enters firstname as {} and lastname as {}")
    public void user_enters_firstname_as_and_lastname_as(String string1, String string2) {
        System.out.println("User inserts a first name and last name");

    }

    @When("user enters address {}")
    public void user_enters_address(String string) {
        System.out.println("User inserts address");

    }

    @When("user enters phoneNumber {}")
    public void user_enters_phone_number(String string) {
        System.out.println("User inserts a phone number");

    }

    @When("user enters username {}")
    public void user_enters_username(String string) {
        System.out.println("User inserts a username");

    }

    @When("user enters email {}")
    public void user_enters_email(String string) {
        System.out.println("User inserts an e-mail");

    }

    @When("user enters the password as {}")
    public void user_enters_the_password_as(String string) {
        System.out.println("User inserts a password");

    }

    @Then("user clicks on the register button and see the success message as {}")
    public void user_clicks_on_the_register_button_and_see_the_success_message_as(String string) {
        System.out.println("User registers successfully");

    }

    @Given("print the below students list")
    public void we_have_the_below_students_list(List<String> list) {
        studentsList = list;
        System.out.println("All student names printed: ");
        for (String eachStudent : studentsList) {
            System.out.println(eachStudent);
        }
    }

    @Given("print the below students credentials:")
    public void we_have_the_below_shopping_data(DataTable credentials) {
        List<Map<String, String>> dataStudents = credentials.asMaps(String.class, String.class);
        System.out.println("Student credentials stored in a map: " + dataStudents);
        System.out.println("Student credentials listed:");
        for (Map<String, String> eachStudentCredential : dataStudents) {
            System.out.println("User " + eachStudentCredential.get("username") + " has " + eachStudentCredential.get("password") + " for password.");
        }
    }

}
