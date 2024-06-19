package com.nttdataqa.serenity.task;

import com.nttdataqa.serenity.userInterface.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;


    public PurchaseFormPage(String name, String country, String city, String card, String month, String year) {
            this.name=name;
            this.country=country;
            this.city=city;
            this.card=card;
            this.month=month;
            this.year=year;
    }

    public static Performable withData(String name, String country, String city, String card, String month, String year){
        return instrumented(PurchaseFormPage.class, name,  country,  city,  card,  month,  year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                WaitUntil.the(PurchasePageInterface.NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(name).into(PurchasePageInterface.NAME),

                WaitUntil.the(PurchasePageInterface.COUNTRY,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(country).into(PurchasePageInterface.COUNTRY),

                WaitUntil.the(PurchasePageInterface.CITY,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.CITY),

                WaitUntil.the(PurchasePageInterface.CARD,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(card).into(PurchasePageInterface.CARD),

                WaitUntil.the(PurchasePageInterface.MONTH,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(month).into(PurchasePageInterface.MONTH),

                WaitUntil.the(PurchasePageInterface.YEAR,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(year).into(PurchasePageInterface.YEAR),

                WaitUntil.the(PurchasePageInterface.PURCHASE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.PURCHASE)

        );
    }
}