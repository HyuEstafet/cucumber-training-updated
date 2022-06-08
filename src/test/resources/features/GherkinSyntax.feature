# tests created by: Hyulya Gyuler
  @GherkinTasks
Feature: Gherkin Syntax tasks

  Background:
    * user is on the homepage

  Rule: Testing login with the given credentials
    @LoginTestSuccess
    Scenario Outline: User Login
      Given user clicks on the login button
      When user inserts a "<username>"
      And user inserts a "<password>"
      And user presses the user login button
      Then user logs in successfully

      Examples: Credentials
        | username | password |
        | user123  | pass123  |
        | user456  | pass456  |
        | user789  | pass789  |

    @LoginTestFail
    Scenario: User Login Failed
      Given user clicks on the login button
      When user inserts an invalid "username"
      And user inserts an invalid "password"
      And user presses the user login button
      Then fails to login

  Rule: Testing sign up form for new users with mandatory and optional fields
    @SignUpTest
    Scenario Outline: New user sign up
      Given user enters payroll number as "<PayrollNumber>"
      When user enters firstname as "<firstName>" and lastname as "<lastName>"
      And user enters address "<address>"
      And user enters phoneNumber "<phoneNumber>"
      And user enters username "<username>"
      And user enters email "<email>"
      And user enters the password as "<password>"
      Then user clicks on the register button and see the success message as "<successMessage>"

      Examples: User Information
        | PayrollNumber | firstName | lastName    | address        | phoneNumber  | username    | email         | password | successMessage          |
        | 333028        | NameOne   | LastNameOne | TestAddressOne | 456-279-5588 | UserNameOne | one@gmail.com | Pass123. | successfully registered |
        | 333029        | NameTwo   | LastNameTwo | TestAddressTwo | 456-279-5599 | UserNameTwo | two@gmail.com | Pass456. | successfully registered |

  Rule: To use a data table with one column
    @PrintingStudentsNames
    Scenario: Printing a list of Students names
      * print the below students list
        | Luke Kingshot  |
        | Yvonne Nakato  |
        | Nick Clements  |
        | Jenni Yates    |
        | Dominic Taylor |

  Rule: To use a data table with multiple columns
    @PrintingStudentsCredentials
    Scenario: Printing students credentials
      * print the below students credentials:
        | username         | password  |
        | user_1@gmail.com | 12345     |
        | user_2@yahoo.com | SECRET123 |
        | user_3@abv.bg    | 0000000   |