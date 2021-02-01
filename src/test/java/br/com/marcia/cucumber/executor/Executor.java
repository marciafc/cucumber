package br.com.marcia.cucumber.executor;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:bdd",
        glue = "br.com.marcia.cucumber.restAssured",
        monochrome = true,
        dryRun = false)
public class Executor {
}
