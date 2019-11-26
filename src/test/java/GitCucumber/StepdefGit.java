package GitCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefGit {
	@Given("I enter {int} for calculation")
	public void enter1(int num)
	{
		System.out.println("I enter "+num+" to add");
	}
	@And("I press {word}")
	public void add(String operator)
	{
		System.out.println("I press "+operator);
	}
	@And("I again enter {int} for calculation")
	public void enter2(int num)
	{
		System.out.println("I again enter "+num+" to add");
	}
	@When("I press1 {word}")
	public void press(String operator)
	{
		System.out.println("Press "+operator);
	}
	@Then("The result should be {int}")
	public void screen(int num)
	{
		System.out.println("The screen should display" +num);
	}


}
