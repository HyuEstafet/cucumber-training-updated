# tests created by: Hyulya Gyuler
@ParameterTypeAndDataTable
Feature: Testing ParameterType and Data Table calculations

  Rule: Calculations are done by columns and then compared
    @TestingSum
    Scenario: Sum of numbers by columns from a Data Table
      Given we have the following numbers:
        | 3  | 2  |
        | -1 | -5 |
      When we use operator sum
      Then we print the results and compare

    @TestingDifference
    Scenario: Difference of numbers by columns from a Data Table
      Given we have the following numbers:
        | 3  | 2  |
        | -1 | -5 |
      When we use operator difference
      Then we print the results and compare