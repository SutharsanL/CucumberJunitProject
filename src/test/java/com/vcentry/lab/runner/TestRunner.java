package com.vcentry.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class) //junit main method
@CucumberOptions(
features="src/test/resources/features",
glue="com.vcentry.lab.stepDefinition", //stepdefn pkg name
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true, // readable console
dryRun = false, //dry run used to check feature file steps 
                  //were implemented in TestSteps
//tags = "@validlogin or @sanity"
tags="@login"
		)

public class TestRunner {

}
