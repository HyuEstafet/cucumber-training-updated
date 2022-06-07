package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExpressionsSteps {

    StringHelper helper = new StringHelper();
    String givenParagraph;
    private boolean isCaseSensitive;
    private String firstInputWord;
    private String secondInputWord;
    private String firstInputSentence;
    private String secondInputSentence;
    private int totalWordCount;
    private int totalCharCount;

    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

    @Given("case sensitivity is set to {booleanValue}")
    public void case_sensitivity_is_set_to(Boolean bool) {
        isCaseSensitive = bool;
    }

    @Given("first input word is {word}")
    public void first_input_word_is(String firstWord) {
        firstInputWord = firstWord;
        System.out.println(firstInputWord);
    }

    @When("second input word is {word}")
    public void second_input_word_is(String secondWord) {
        secondInputWord = secondWord;
        System.out.println(secondInputWord);
    }

    @Then("we verify words are equal or not")
    public void we_verify_the_words_are_equal() {
        System.out.printf("Comparing %s with %s", firstInputWord, secondInputWord);
        assertTrue(StringHelper.areWordsEqual(firstInputWord, secondInputWord, isCaseSensitive),
                "Words are not matching and are not equal!");
    }

    @Given("first sentence is {string}")
    public void first_sentence_is_cucumber_is_amazing(String sentenceOne) {
        firstInputSentence = sentenceOne;
        System.out.println("First sentence: " + firstInputSentence);
    }

    @When("second sentence is {string}")
    public void second_sentence_is_cucumber_is_amazing(String sentenceTwo) {
        secondInputSentence = sentenceTwo;
        System.out.println("Second sentence: " + secondInputSentence);
    }

    @Then("we verify sentences are equal or not")
    public void we_verify_cucumber_is_amazing_and_cucumber_is_amazing_are_equal_or_not() {
        System.out.printf("Comparing %s and %s%n", firstInputSentence, secondInputSentence);
        assertTrue(StringHelper.areSentencesEqual(firstInputSentence, secondInputSentence, isCaseSensitive), "Sentences are not matching and are not equal!");
    }

    @Given("the input is a text paragraph")
    public void the_input_is_a_text_paragraph(String docString) {
        givenParagraph = docString;
    }

    @When("the word count is done")
    public void the_word_count_is_done() {
        totalWordCount = StringHelper.getWordsCountFromText(givenParagraph);
        System.out.println("Total word count: " + totalWordCount);
    }

    @Then("the result is verified to equal {int} words")
    public void the_result_is_verified(int numberOfWords) {
        assertEquals(numberOfWords, totalWordCount, "The actual total word count is not equal to the expected word count!");
    }

    @When("the char count is done")
    public void the_char_count_is_done() {
        totalCharCount = StringHelper.getCharsCount(givenParagraph);
        System.out.println("Total char count: " + totalCharCount);
    }

    @Then("the result is verified to equal {int} chars")
    public void the_result_is_verified_to_equal_chars(int numberOfChars) {
        assertEquals(numberOfChars, totalCharCount, "The actual total char count is not equal to the expected char count!");
    }
}

