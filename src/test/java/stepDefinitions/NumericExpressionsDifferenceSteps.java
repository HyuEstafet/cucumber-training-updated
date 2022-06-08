package stepDefinitions;

import helpers.DifferenceCalculatorHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class NumericExpressionsDifferenceSteps {
    DifferenceCalculatorHelper differenceCalculatorHelper = new DifferenceCalculatorHelper();

    private int differenceInts;
    private int expectedDifferenceInts;
    private double differenceDoubles;
    private double expectedDifferenceDoubles;

    @Given("there is a Difference Calculator")
    public void there_is_a_calculator() {
        differenceCalculatorHelper = new DifferenceCalculatorHelper();
    }

    @Given("we calculate difference of int numbers {int} and {int}")
    public void we_calculate_difference_of_int_numbers_and(int a, int b) {
        differenceInts = differenceCalculatorHelper.calculate(a, b);

    }

    @Given("we calculate difference of decimal numbers {double} and {double}")
    public void we_calculate_difference_of_decimal_numbers_and(double a, double b) {
        differenceDoubles = differenceCalculatorHelper.calculate(a, b);

    }

    @When("expected difference input result is {int}")
    public void expected_difference_input_result_is(int resultDifference) {
        expectedDifferenceInts = resultDifference;

    }

    @Then("we check if the int difference is correct")
    public void we_check_if_the_int_difference_is_correct() {
        assertEquals("Expected difference didn't match!", expectedDifferenceInts, differenceInts);
    }

    @When("expected difference decimal input result is {double}")
    public void expected_difference_decimal_input_result_is(double resultDifferenceDecimals) {
        expectedDifferenceDoubles = resultDifferenceDecimals;
    }

    @Then("we check if the decimal difference is correct")
    public void we_check_if_the_decimal_difference_is_correct() {
        assertEquals("Expected difference didn't match!", expectedDifferenceDoubles, differenceDoubles, 0);
    }
}
