package org.example.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.utility.Services;

public class PetStoreApiStepDef {

    String base = "https://petstore.swagger.io/v2/";
    Services services = new Services();
    Response response;

    @Given("^I have base URI$")
    public void i_have_base_URI() {
        RestAssured.baseURI = base; // to set the base URI


    }

    @When("^I post the API to add the pet$")
    public void i_post_the_API_to_add_the_pet() {
        response = services.postPet(); // do POST of API
        response.prettyPrint();


    }

    @Then("^I should get the status code (\\d+)$")
    public void i_should_get_the_status_code(int code) {
        response.then().statusCode(code);

    }

    @When("^I post the API to get the pet$")
    public void i_post_the_API_to_get_the_pet() {
        response = services.getPet();
    }

    @When("^I delete the pet$")
    public void iDeleteThePet() {
        response = services.deletePet();

    }
}
