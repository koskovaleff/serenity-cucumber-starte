package iqbody;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iqbody.steps.MainPageSteps;
import net.thucydides.core.annotations.Steps;

public class RegButtonEnabled {

    @Steps
    MainPageSteps steps;

    @Given("User open homepage")
    public void userOpenHomepage() {
        steps.open_main_page();
    }

    @When("User click Login button")
    public void userClickLoginButton() {
        steps.click_login_button();
    }

    @Then("Register button should be visible")
    public void registerButtonShouldBeVisible() {
        steps.check_reg_button();
    }
}
