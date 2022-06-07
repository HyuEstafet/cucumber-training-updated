package stepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class NumericExpressionsDataTableSteps {

    private final List<Integer> firstColumnNumbers = new ArrayList<>();
    private final List<Integer> secondColumnNumbers = new ArrayList<>();
    int calculationOfFirstColumnNumbers = 0;
    int calculationOfSecondColumnNumbers = 0;
    String calculationType = "";

    @ParameterType("sum|difference")
    public String operation(String operation) {
        return operation;
    }

    @Given("we have the following numbers:")
    public void weHaveTheFollowingNumbers(List<List<Integer>> rows) {
        rows.forEach(column -> {
            firstColumnNumbers.add(column.get(0)); // first column numbers (3, 2)
            secondColumnNumbers.add(column.get(1)); // second column numbers (-1, -5)
        });

        System.out.println("Numbers from column one: " + firstColumnNumbers);
        System.out.println("Numbers from column two: " + secondColumnNumbers);
    }

    @When("we use operator {operation}")
    public void weUseOperatorSumOrDifference(String operation) {

        calculationType = operation;
        System.out.println("Setting calculation type to: " + calculationType);

        if (operation.equals("sum")) {
            for (int n : firstColumnNumbers) {
                calculationOfFirstColumnNumbers = calculationOfFirstColumnNumbers + n;
            }
            secondColumnNumbers.forEach(number -> {
                calculationOfSecondColumnNumbers = calculationOfSecondColumnNumbers + number;
            });
        } else {
            for (int n : firstColumnNumbers) {
                calculationOfFirstColumnNumbers = calculationOfFirstColumnNumbers - n;
            }
            for (int n : secondColumnNumbers) {
                calculationOfSecondColumnNumbers = calculationOfSecondColumnNumbers - n;
            }
        }
        System.out.println("Column one calculations: " + calculationOfFirstColumnNumbers);
        System.out.println("Column two calculations: " + calculationOfSecondColumnNumbers);
    }


    @Then("we print the results and compare")
    public void wePrintTheResults() {
        System.out.println(
                calculationOfFirstColumnNumbers == calculationOfSecondColumnNumbers ? "Calculations are equal!" :
                        (calculationOfFirstColumnNumbers > calculationOfSecondColumnNumbers ? "Calculation of column one is greater: " + calculationOfFirstColumnNumbers :
                                "Calculations of column two is greater: " + calculationOfSecondColumnNumbers));
    }
}
