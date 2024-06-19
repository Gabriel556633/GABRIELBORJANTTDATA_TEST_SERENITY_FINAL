package com.nttdataqa.serenity.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    private final String url;

    public OpenPage(String url){this.url = url;}
    public static Task loadPage(){
        String url = "https://www.demoblaze.com/";
        return instrumented(OpenPage.class,url);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
