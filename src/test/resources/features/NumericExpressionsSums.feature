# tests created by: Hyulya Gyuler
@NumericExpressionsSum
Feature: Calculations of sums for different data types

  Background:
    Given there is a Sum Calculator

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
