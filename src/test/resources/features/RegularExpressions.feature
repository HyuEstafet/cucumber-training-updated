# tests created by: Hyulya Gyuler
Feature: Using regex with Cucumber

  Background:
    * case sensitivity is set to be false

  Rule: Remove certain characters using regex and verify the result

    Scenario: Extend compare words tests to compare two words after removing letters and digits
      Given the first input word is Cucumberss11
      When I remove first occurrence of s
      And I remove all occurrences of 0
      And the second input word is cucumbers
      Then verify if the words are same or not

    Scenario: Extend compare sentences tests to compare two sentences after removing certain characters
      Given the first input sentence is "I am testing with RegEx ((it’s working??!!!)"
      When I remove first occurrence of symbol (
      And I remove all occurrences of symbol ?
      And the second input sentence is "i am testing with regex (it’s working!!!)"
      Then verify if the sentences are the same or not

    Scenario: Extend word and char count tests
      Given there is a text
    """
    I am testing   whitespaces - is the count correct?
    """
      When I remove all whitespace chars before -
      And I remove more than one consecutive whitespace chars with a single space
      And count the words
      Then verify that the result is 8