package com.google.qa.screenplaydatatable.stepdefinitions;

import com.google.qa.screenplaydatatable.models.DatosModel;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScreenplayDatatableStepdefinitions {

    private DatosModel datosModel;
    private Map<String, String> map;


    @Given("^Daniel wants to look for a phrase$")
    public void danielWantsToLookForAPhrase() throws Exception {


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
}
