package com.nttdataqa.serenity.task;

import com.nttdataqa.serenity.userInterface.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.UnhandledAlertException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;



public class AddProductPage implements Task {


    public static Task addProductsToCart(){return instrumented(AddProductPage.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{

        actor.attemptsTo(
                WaitUntil.the(PurchasePageInterface.PRODUCT2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.PRODUCT2),

                WaitUntil.the(PurchasePageInterface.ANADIR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.ANADIR),

                WaitUntil.the(PurchasePageInterface.HOME, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.HOME),


                WaitUntil.the(PurchasePageInterface.PRODUCT1, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.PRODUCT1),

                WaitUntil.the(PurchasePageInterface.ANADIR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.ANADIR).withNoDelay(),

                WaitUntil.the(PurchasePageInterface.GOCART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.GOCART),

                WaitUntil.the(PurchasePageInterface.ORDER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.ORDER)
                );
        }catch (UnhandledAlertException e){
            try{
                System.out.println("PROBLEMAS 1 CON EL ALERT al añadir el producto ");
                System.out.println("REALIZAR LA PRUEBA NUEVAMENTE ");
                actor.attemptsTo(
                        Switch.toAlert().andAccept(),
                        WaitUntil.the(PurchasePageInterface.HOME, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.HOME),


                        WaitUntil.the(PurchasePageInterface.PRODUCT1, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.PRODUCT1),

                        WaitUntil.the(PurchasePageInterface.ANADIR, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.ANADIR).withNoDelay(),

                        WaitUntil.the(PurchasePageInterface.GOCART, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.GOCART),

                        WaitUntil.the(PurchasePageInterface.ORDER, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.ORDER)

                );

            }catch (UnhandledAlertException e1){
                System.out.println("PROBLEMAS 2 CON EL ALERT al añadir el producto ");
                System.out.println("REALIZAR LA PRUEBA NUEVAMENTE ");
                actor.attemptsTo(
                        Switch.toAlert().andAccept(),
                        WaitUntil.the(PurchasePageInterface.GOCART, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.GOCART),

                        WaitUntil.the(PurchasePageInterface.ORDER, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(PurchasePageInterface.ORDER)
                );
            }

        }
    }
}
