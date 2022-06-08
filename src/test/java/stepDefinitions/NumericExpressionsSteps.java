package stepDefinitions;

import helpers.Calculator;
import helpers.DifferenceCalculatorHelper;
import helpers.SumCalculatorHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class NumericExpressionsSteps {
    Calculator calculator;
    private int calculationInts;
    private int expectedCalculationInts;
    private double calculationDoubles;
    private double expectedCalculationDoubles;

    @ParameterType("sum|difference")
    public Calculator calculation(String operation) {
        return operation.equalsIgnoreCase("sum") ? new SumCalculatorHelper() : new DifferenceCalculatorHelper();
    }

    @Given("there is a {calculation} calculator")
    public void there_is_a_calculator(Calculator calc) {
        calculator = calc;
    }

    @Given("we calculate difference/sum of int numbers {int} and {int}")
    public void we_calculate_difference_of_int_numbers_and(int a, int b) {
        calculationInts = calculator.calculate(a, b);

    }

    @Given("we calculate difference/sum of decimal numbers {double} and {double}")
    public void we_calculate_difference_of_decimal_numbers_and(double a, double b) {
        calculationDoubles = calculator.calculate(a, b);

    }

    @When("expected difference/sum input result is {int}")
    public void expected_difference_input_result_is(int resultInts) {
        expectedCalculationInts = resultInts;

    }

    @Then("we check if the int difference/sum is correct")
    public void we_check_if_the_int_difference_is_correct() {
        assertEquals("Expected difference didn't match!", expectedCalculationInts, calculationInts);
    }

    @When("expected difference/sum decimal input result is {double}")
    public void expected_difference_decimal_input_result_is(double resultDecimals) {
        expectedCalculationDoubles = resultDecimals;
    }

    @Then("we check if the decimal difference/sum is correct")
    public void we_check_if_the_decimal_difference_is_correct() {
        assertEquals("Expected difference didn't match!", expectedCalculationDoubles, calculationDoubles, 0);
    }
}
