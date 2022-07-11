package com.vcentry.lab.stepDefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.vcentry.lab.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{
@Before
public void beforeScenario(Scenario s) {
	System.out.println("-----------before scenario "+s.getName()+"-----------");
}

@After
public void afterScenario(Scenario s) {
	System.out.println("-----------after scenario "+s.getName()+"-----------");
   getDriver.get(Thread.currentThread().getId()).close();
}

@AfterStep
public void afterStep(Scenario s) {
	if(s.isFailed()) {
		final byte[] scn=((TakesScreenshot)getDriver
				.get(Thread.currentThread().getId()))
				.getScreenshotAs(OutputType.BYTES);
		s.attach(scn,"image/png","image");
	}
}

}
