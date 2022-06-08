package stepDefinitions;

import helpers.SumCalculatorHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class NumericExpressionsSumsSteps {

    SumCalculatorHelper sumCalculatorHelper = new SumCalculatorHelper();
    private int totalSumInts;
    private int expectedSumInts;
    private double totalSumDoubles;
    private double expectedSumDoubles;
    private int differenceInts;
    private int expectedDifferenceInts;
    private double differenceDoubles;
    private double expectedDifferenceDoubles;

    @Given("there is a Sum Calculator")
    public void there_is_a_calculator() {
        sumCalculatorHelper = new SumCalculatorHelper();
    }

    @When("we add int numbers {int} and {int}")
    public void we_add_int_numbers_and(int firstNumber, int secondNumber) {
        totalSumInts = sumCalculatorHelper.calculate(firstNumber,secondNumber);
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
        totalSumDoubles = sumCalculatorHelper.calculate(firstNumber,secondNumber);
    }

    @When("expected sum decimal input result is {double}")
    public void we_have_the_result(double resultDouble) {
        expectedSumDoubles = resultDouble;
    }

    @Then("we check if the decimal result is correct")
    public void we_check_the_decimal_result_is_correct() {
        assertEquals("Expected sum didn't match!", expectedSumDoubles, totalSumDoubles, 0);
    }
}
