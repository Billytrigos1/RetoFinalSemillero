package com.postman.stepdefinitions;

import com.postman.questions.BuilDataUser;
import com.postman.questions.DeleteResponse;
import com.postman.questions.PutDataResponse;
import com.postman.questions.ServerResponse;
import com.postman.tasks.DeleteTask;
import com.postman.tasks.PostUserTask;
import com.postman.tasks.PutUserTask;
import com.postman.utils.Data;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class UserStepDefinition {

    private EnvironmentVariables environmentVariables;
    private String theRestApiBaseUrl;

    Actor user= Actor.named("user");
    Map<String, String> data = Data.extractTo().get(0);
    Map<String, String> data3 = Data.extractTo1().get(0);

    @Before
    public void setUpBaseUrl(){
        theRestApiBaseUrl= environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://fakestoreapi.com");
        user.whoCan(CallAnApi.at(theRestApiBaseUrl));

    }
    @When("I consume the endpoint  and the user sent data")
    public void iConsumeTheEndpointAndTheUserSentData() {
        user.attemptsTo(
                PostUserTask.on()

        );

    }
    @Then("I cant validate server response")
    public void iCantValidateServerResponse() {

        user.should(
                seeThat(
                        "The response code was: ",
                        ServerResponse.was(),
                        equalTo(Integer.parseInt(data.get("Code")))
                )
        );


    }
    @When("I consume the endpoint  and the user sent edit data")
    public void iConsumeTheEndpointAndTheUserSentEditData() {
        user.attemptsTo(
                PutUserTask.on()

        );

    }
    @Then("I cant validate server response whit statu")
    public void iCantValidateServerResponseWhitStatu() {

        user.should(
                seeThat(
                        "The response code was: ",
                        PutDataResponse.was(),
                        equalTo(Integer.parseInt(data3.get("Code")))
                )
        );
    }
    @When("I consume the endpoint  and Delete the user")
    public void iConsumeTheEndpointAndDeleteTheUser() {

        user.attemptsTo(
                DeleteTask.on()
        );

    }

    @Then("I cant validate the number Phone")
    public void iCantValidateTheNumberPhone() {

        Map<String, String> data = Data.extractTo().get(0);
        String x = BuilDataUser.was().answeredBy(user).getPhone();

        user.should(
                seeThat(
                        "The phone number was",
                        res -> BuilDataUser.was().answeredBy(user).getPhone(),
                        equalTo(data.get("phone"))
                )
        );
    }
    }


