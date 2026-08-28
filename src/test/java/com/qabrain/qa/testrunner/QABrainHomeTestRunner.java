package com.qabrain.qa.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"/Users/hrushi/Desktop/Priyanka/eclipse_workspace/Demo-Website-Practice-Project/src/test/resources/Feature/QaBrainHome.feature"},
		glue= {"com.qabrain.qa.stepdefination","com.qabrain.qa.hook"}
		)
public class QABrainHomeTestRunner extends AbstractTestNGCucumberTests {

}
