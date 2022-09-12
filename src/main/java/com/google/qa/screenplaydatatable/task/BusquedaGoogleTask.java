package com.google.qa.screenplaydatatable.task;

import com.google.qa.screenplaydatatable.userinterfaces.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;

public class BusquedaGoogleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int search = GoogleHome.SEARCH_BAR.resolveAllFor(actor).size();
        System.out.println(search);

    }
}
