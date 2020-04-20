package iqbody;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iqbody.pages.MainPage;
import iqbody.steps.MainPageSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MainPageMenu {

    @Steps
    MainPageSteps steps;

    @When("User click Training Menu")
    public void userClickTrainingMenu() {
        steps.click_training();
    }

    @Then("User should see all Training Menu")
    public void userShouldSeeAllTrainingMenu() {
        steps.training_mega_menu_visible();
    }

}
