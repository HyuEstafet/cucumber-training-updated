package stepDefinitions;

import io.cucumber.java.en.Given;

public class HelloWorldSteps {
    @Given("print {string}")
    public void print(String string) {
        System.out.println("Hello World!");
    }
}
