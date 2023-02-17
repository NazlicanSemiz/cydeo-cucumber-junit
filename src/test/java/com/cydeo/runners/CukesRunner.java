package com.cydeo.runners;

import com.cydeo.utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,
        tags = "@Regression"

)
public class CukesRunner {

}
