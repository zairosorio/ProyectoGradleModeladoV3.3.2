package com.google.qa.screenplaydatatable.interaction;

import com.google.qa.screenplaydatatable.userinterfaces.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicio  {
    public static Performable paginaInicio() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(GoogleHome.class));
    }

}
