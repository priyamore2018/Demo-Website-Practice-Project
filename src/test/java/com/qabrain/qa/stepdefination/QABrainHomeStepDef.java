package com.qabrain.qa.stepdefination;


import com.qabrain.qa.base.BaseTest;
import com.qabrain.qa.pages.QABrainHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QABrainHomeStepDef {

	 public QABrainHomePage qABrainHomePage;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("User is on Home Page");
	}

	@When("User can see the links")
	public void user_can_see_the_links(){
		qABrainHomePage=new QABrainHomePage(BaseTest.driver);
		qABrainHomePage.verifyLoginLink();
	}

	@Then("User will close the Home Page")
	public void user_will_close_the_home_page() {
		
	}


}
