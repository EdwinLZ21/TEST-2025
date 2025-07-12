package com.bdd.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {
        "html:target/build/cucumber-html-report",
        "pretty:target/build/cucumber-pretty.txt",
        "json:target/build/cucumber.json"},
        //junit = {"-step-notifications"},
        features = {"src/test/resources/web"},

        glue = {"com.bdd"},
        tags = "@DEMOQA_SCENARIO_01"
)

public class RunnerTest {
}