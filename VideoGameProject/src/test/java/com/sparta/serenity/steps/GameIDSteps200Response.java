package com.sparta.serenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.RestRequests.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.thucydides.core.environment.SystemEnvironmentVariables.createEnvironmentVariables;


public class GameIDSteps200Response {
    @Given("I am using the VideoGame API")
    public void iAmUsingTheVideoGameAPI() {
        given().baseUri(createEnvironmentVariables().getProperty("videogamedb.api.url"));
    }

    @When("I look up a video gameId {int}")
    public void iLookUpAVideoGameID(int gameId) {
        when().get(createEnvironmentVariables().getProperty("videogame.api.basepath")+ gameId);
    }


    @Then("I should receive {int} response code")
    public void iShouldReceiveResponseCode(int code) {
        then().statusCode(code);

    }


}

