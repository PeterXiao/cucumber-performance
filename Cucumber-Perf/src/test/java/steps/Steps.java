package steps;

import java.util.Random;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@When("^System out \"([^\"]*)\"$")
	public void system_out(String arg1) throws Exception {
		//System.out.println(arg1);
		java.util.Random rand = new Random();
		int sleep = (100+rand.nextInt(200)) + 1;
		Thread.sleep(sleep);
	}
	
	@When("^Check (\\d+)$")
	public void check(int arg1) throws Exception {
	   //System.out.println("int:" +arg1);

	}

	@Then("^Verify$")
	public void verify(DataTable arg1) throws Exception {
	  
	}

}
