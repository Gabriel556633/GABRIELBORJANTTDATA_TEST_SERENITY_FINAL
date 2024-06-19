package com.nttdataqa.serenity.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class Question1 {
    public static Question<String> venta() {
        return actor-> TextContent.of(GetInformation.INFOSALE).answeredBy(actor);
    }
}
