package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {


    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
WebElement acceptClick= Driver.getDriver().findElement(By.xpath("//div[.='Accept all']"));
acceptClick.click();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle= "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }
}