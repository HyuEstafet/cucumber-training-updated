# tests created by: Hyulya Gyuler
@NumericExpressions
Feature: Calculations of sums for different data types

  Background:
    Given there is a Calculator

  Rule: The calculation type is sum
    @SumOfIntegers_PassScenario
    Scenario: Adding Integers
      Given we add int numbers 3 and 5
      When expected sum input result is 8
      Then we check if the result is correct

    @SumOfDecimals_FailScenario
    Scenario: Adding Decimals
      Given we add decimal numbers 1.2 and 3.0
      When expected sum decimal input result is 5.2
      Then we check if the decimal result is correct

  Rule: The calculation type is difference
    @DifferenceOfIntegers_PassScenario
    Scenario: Difference of Integers
      Given we calculate difference of int numbers 10 and 6
      When expected difference input result is 4
      Then we check if the int difference is correct

    @DiffereceOfNegativeDecimals_FailScenario
    Scenario: Difference of Decimals
      Given we calculate difference of decimal numbers 7.5 and 2.5
      When expected difference decimal input result is 3.8
      Then we check if the decimal difference is correct