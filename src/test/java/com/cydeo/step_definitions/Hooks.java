package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to each scenario and each step
 */

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order =1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value ="@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====Setting up browser using cucumber @Before");
    }


    @After
    public void teardowndScenario(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------- applying tearDown using @AfterStep");
    }

}
