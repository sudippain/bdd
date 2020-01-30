package com.bdd.bdd_example;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class DisscountServiceTest 
  
{
	DisscountService disoff= null;
	String percentage = "";
	@Given("^Execute DiscountService Bussiness$")
	public void execute_DiscountService_Bussiness() throws Throwable {
		disoff= new DisscountService();
	   
	}

	@When("^If i will enter (\\d+)$")
	public void if_i_will_enter(int arg1) throws Throwable {
		percentage = disoff.getDiscount(arg1);
	}

	@Then("^we should get ten percentage discount$")
	public void we_should_get_ten_percentage_discount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals("10%", percentage);
	}

	@Then("^we should get fifteen percentage discount$")
	public void we_should_get_fifteen_percentage_discount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals("15%", percentage);
	}



	@Then("^we should get NA percentage discount$")
	public void we_should_get_NA_percentage_discount() throws Throwable {
		  Assert.assertEquals("NA", percentage);
			 
	}
	


}
