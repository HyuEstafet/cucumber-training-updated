# tests created by: Hyulya Gyuler
@NumericExpressionsDifference
Feature: Calculations of differences for different data types

  Background:
    * there is a Difference Calculator

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