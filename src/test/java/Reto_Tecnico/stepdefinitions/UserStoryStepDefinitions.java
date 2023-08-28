package Reto_Tecnico.stepdefinitions;

import Tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.RegistrationData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class UserStoryStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Enter the registration option$")
    public void Entertheregistrationoption(List<RegistrationData> RegistrationData) {
        OnStage.theActorCalled("Julieth").wasAbleTo(Openup.thePage(), (UserRegistration.OnthePage()));
    }



    @When("^Enter the form data$")
    public void Entertheformdata(List<RegistrationData> data)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Dataentrystepone.thepage(data), Dataentrysteptwo.thepage(data), Dataentrystepthree.thepage(data), Dataentrystepfour.thepage(data), Completeregister.thepage(data));
    }


    @Then("^The user is created to be able to access the tools$")
    public void Theuseriscreatedtobeabletoaccessthetools() {
    }
}
