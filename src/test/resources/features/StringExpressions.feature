# tests created by: Hyulya Gyuler
  @AllStringExpressionsTasks
Feature: Cucumber Text Expressions task

  Background:
    * case sensitivity is set to false

  Rule: Compare the two given words based on case sensitivity true or false
    Scenario: Compare two words
      Given first input word is Cucumber
      When second input word is cucumber
      Then we verify words are equal or not

  Rule: Compare the two given sentences based on case sensitivity true or false
    Scenario: Compare two sentences
      Given first sentence is "Cucumber is amazing!"
      When second sentence is "cucumber is amazing!"
      Then we verify sentences are equal or not

  Rule: Count the words using the helper class and verify the word count
    Scenario: Word count
      Given the input is a text paragraph
    """
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est  laborum.
    """
      When the word count is done
      Then the result is verified to equal 70 words

  Rule: Count the chars using the helper class and verify the char count
    Scenario: Char count
      Given the input is a text paragraph
    """
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est  laborum.
    """
      When the char count is done
      Then the result is verified to equal 446 chars