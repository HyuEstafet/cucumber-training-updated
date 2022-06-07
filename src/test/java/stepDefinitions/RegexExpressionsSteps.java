package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexExpressionsSteps {
    StringHelper helper = new StringHelper();
    private boolean isCaseSensitive;
    private String wordOne;
    private String wordTwo;
    private String sentenceOne;
    private String sentenceTwo;
    private String givenText;
    private int countedWordsTotal;

    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public Boolean boolVal(String value) {
        return Boolean.valueOf(value);
    }

    @Given("case sensitivity is set to be {boolVal}")
    public void case_sensitivity_is_set_to(Boolean bool) {
        isCaseSensitive = bool;
    }

    @Given("the first input word is {word}")
    public void the_first_input_word_is(String inputWord) {
        wordOne = inputWord;
        System.out.println("The first given word is: " + wordOne);
    }

    @When("^I remove first occurrence of ([a-zA-z])$")
    public void i_remove_first_occurrence_of(String letter) {
        wordOne = wordOne.replaceFirst(letter, "");
        System.out.println("Updated word after removing the first occurrence of the given letter is: " + wordOne);
    }

    @When("^I remove all occurrences of ([\\d])$")
    public void i_remove_all_occurrences_of(String digit) {
        wordOne = wordOne.replaceAll(digit, "");
        System.out.println("Updated word after removing all occurrences of the given digit is: " + wordOne);
    }

    @When("the second input word is {word}")
    public void the_second_input_word_is(String secondInputWord) {
        wordTwo = secondInputWord;
        System.out.println("The second given word is: " + wordTwo);
    }

    @Then("verify if the words are same or not")
    public void verify_if_the_words_are_same_or_not() {
        System.out.printf("Comparing %s and %s", wordOne, wordTwo);
        assertTrue(StringHelper.areWordsEqual(wordOne, wordTwo, isCaseSensitive), "The two give words are not equal and not the same!");
    }

    @Given("the first input sentence is {string}")
    public void the_first_input_sentence_is(String sentenceA) {
        sentenceOne = sentenceA;
        System.out.println("The first sentence is set to: " + sentenceOne);
    }

    @When("^I remove first occurrence of symbol ([“\\(\\)\\[\\],;\\-'])$")
    public void i_remove_first_occurence_of_symbol(String symbolFirst) {
        sentenceOne = sentenceOne.replaceFirst(String.format("\\%s", symbolFirst), "");
        System.out.println("Updated first sentence after removing the first occurrence of the given symbol: " + sentenceOne);
    }

    @When("^I remove all occurrences of symbol ([\\.\\?!:])$")
    public void i_remove_all_occurences_of_symbol(String symbolAll) {
        sentenceOne = sentenceOne.replaceAll(String.format("\\%s", symbolAll), "");
        System.out.println("Updated first sentence after removing all occurrences of the given symbol: " + sentenceOne);
    }

    @When("the second input sentence is {string}")
    public void the_second_input_sentence_is(String sentenceB) {
        sentenceTwo = sentenceB;
        System.out.println("The second sentence is set to: " + sentenceTwo);
    }

    @Then("verify if the sentences are the same or not")
    public void verify_if_the_sentences_are_the_same_or_not() {
        System.out.printf("Comparing %s and %s", sentenceOne, sentenceTwo);
        assertTrue(StringHelper.areSentencesEqual(sentenceOne, sentenceTwo, isCaseSensitive), "The two give words are not equal and not the same!");
    }

    @Given("there is a text")
    public void there_is_a_text(String docString) {
        givenText = docString;
        System.out.println("The given text is: " + givenText);
    }

    @When("^I remove all whitespace chars before ([,\\.\\-\\?!:])$")
    public void i_remove_all_whitespace_chars_before(String symbols) {
        givenText = givenText.replaceAll("\\s+(?=[,\\.\\-\\?!:])", "");
        System.out.println("Updated text after removing the whitespace chars before the symbols: " + givenText);
    }

    @When("I remove more than one consecutive whitespace chars with a single space")
    public void i_remove_more_than_one_consecutive_whitespace_chars_with_a_single_space() {
        givenText = givenText.replaceAll("  ", "");
        System.out.println("Updated text after removing more than one consecutive whitespaces: " + givenText);
    }

    @When("count the words")
    public void count_the_words() {
        countedWordsTotal = StringHelper.getWordsCountFromText(givenText);
    }

    @Then("verify that the result is {int}")
    public void verify_that_the_result_is(int expectedWordCount) {
        System.out.println("Total word count: " + countedWordsTotal);
        assertEquals(expectedWordCount, countedWordsTotal, "The actual total word count is not equal to the expected word count!");
    }

}

