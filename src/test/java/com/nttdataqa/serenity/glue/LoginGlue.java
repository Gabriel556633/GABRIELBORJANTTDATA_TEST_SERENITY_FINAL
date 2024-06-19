package com.nttdataqa.serenity.glue;

import com.nttdataqa.serenity.dashboard.Question1;
import com.nttdataqa.serenity.task.AddProductPage;
import com.nttdataqa.serenity.task.OpenPage;
import com.nttdataqa.serenity.task.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Test;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;

public class LoginGlue {

    public static final String ACTOR_NAME = "USer";

    @Before
    public void setTheStag(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingreso a la pagina OpenCart$")
    public void login(String actor){theActorCalled(actor).attemptsTo(OpenPage.loadPage());}

    @When("selecciono un producto (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void seleccionProducto(String name, String country, String city, String card, String month, String year){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart());
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(name, country, city, card, month, year));
        }

    @Then("venta exitosa")
    public void buy_is_successful(){
        System.out.println("DATOS DE VENTA : : "+ (Question1.venta().answeredBy(theActorInTheSpotlight())).trim());
        theActorInTheSpotlight().should(
                seeThat("El valor debe ser: ",Question1.venta(),containsStringIgnoringCase("1180")));
    }
}