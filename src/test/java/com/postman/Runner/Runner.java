package com.postman.Runner;
/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/User.feature",
        glue = "com.postman.stepdefinitions",

        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
