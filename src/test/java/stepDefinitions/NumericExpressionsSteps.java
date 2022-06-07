package stepDefinitions;

import helpers.CalculatorHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class NumericExpressionsSteps {

    CalculatorHelper calculatorHelper;
    private int totalSumInts;
    private int expectedSumInts;
    private double totalSumDoubles;
    private double expectedSumDoubles;
    private int differenceInts;
    private int expectedDifferenceInts;
    private double differenceDoubles;
    private double expectedDifferenceDoubles;

    @Given("there is a Calculator")
    public void there_is_a_calculator() {
        calculatorHelper = new CalculatorHelper();
    }

    @When("we add int numbers {int} and {int}")
    public void we_add_int_numbers_and(int firstNumber, int secondNumber) {
        totalSumInts = calculatorHelper.sumOfNumbers(firstNumber, secondNumber);
    }

    @When("expected sum input result is {int}")
    public void we_have_the_result(int result) {
        expectedSumInts = result;
    }

    @Then("we check if the result is correct")
    public void we_check_the_result_is_correct() {
        assertEquals("Expected sum didn't match!", expectedSumInts, totalSumInts);
    }

    @When("we add decimal numbers {double} and {double}")
    public void we_add_numbers_and(double firstNumber, double secondNumber) {
        totalSumDoubles = calculatorHelper.sumOfDoubles(firstNumber, secondNumber);
    }

    @When("expected sum decimal input result is {double}")
    public void we_have_the_result(double resultDouble) {
        expectedSumDoubles = resultDouble;
    }

    @Then("we check if the decimal result is correct")
    public void we_check_the_decimal_result_is_correct() {
        assertEquals("Expected sum didn't match!", expectedSumDoubles, totalSumDoubles, 0);
    }

    @Given("we calculate difference of int numbers {int} and {int}")
    public void we_calculate_difference_of_int_numbers_and(int a, int b) {
        differenceInts = calculatorHelper.differenceOfNumbers(a, b);

    }

    @Given("we calculate difference of decimal numbers {double} and {double}")
    public void we_calculate_difference_of_decimal_numbers_and(double a, double b) {
        differenceDoubles = calculatorHelper.differenceOfDoubles(a, b);

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
