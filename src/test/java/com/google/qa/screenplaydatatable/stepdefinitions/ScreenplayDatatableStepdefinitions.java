package com.google.qa.screenplaydatatable.stepdefinitions;

import com.google.qa.screenplaydatatable.interaction.AbrirPaginaInicio;
import com.google.qa.screenplaydatatable.models.DatosModel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.After;
import org.junit.Before;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ScreenplayDatatableStepdefinitions {

    private DatosModel datosModel;
    private Map<String, String> map;


    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Daniel wants to look for a phrase$")
    public void danielWantsToLookForAPhrase() throws Exception {
        setStage();
        theActorCalled("actor").wasAbleTo(AbrirPaginaInicio.paginaInicio());
    }



    @When("^he looks for the phrase$")
    public void heLooksForThePhrase(DataTable dataTable) {
        map = dataTable.asMaps().get(0);
        datosModel = new DatosModel(map);
        System.out.println(datosModel.getNombre());
        System.out.println(datosModel.getApellido());
        System.out.println(datosModel.getResultado_esperado());


    }

    @Then("^he expects to find the phrase$")
    public void heExpectsToFindThePhrase() throws Exception {

    }

    @After
    public void closeDriver(){
        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().quit();
    }
}
