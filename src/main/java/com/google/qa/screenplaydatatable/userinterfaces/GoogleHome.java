package com.google.qa.screenplaydatatable.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class GoogleHome extends PageObject{

	Actor actor;


	 public static final Target SEARCH_BAR = Target.the("Search bar")
	        	.located(By.name("q"));
	 
	 public static final Target SEARCH_BUTTON = Target.the("Search news")    		
	            .located(By.name("btnK"));



}
