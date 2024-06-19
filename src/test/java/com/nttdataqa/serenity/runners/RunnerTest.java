package com.nttdataqa.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "com.nttdataqa.serenity.glue",
        tags = "@producto1Path"
)

public class RunnerTest {
}
