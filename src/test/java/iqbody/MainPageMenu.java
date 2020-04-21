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

    @When("User click Nutrition Menu")
    public void userClickNutritionMenu() {
        steps.click_nutrition();
    }

    @Then("User should see all Nutrition Menu")
    public void userShouldSeeAllNutritionMenu() {
        steps.nutrition_mega_menu_visible();
    }

    @When("User click Knowledge Base Menu")
    public void userClickKnowledgeBaseMenu() {
        steps.click_knowledge_base();
    }

    @Then("User should see all Knowledge Base Menu")
    public void userShouldSeeKnowledgeBaseMenu() {
        steps.knowledge_base_menu_visible();
    }

    @When("User click About Us Menu")
    public void userClickAboutUsMenu() {
        steps.click_about_us();
    }

    @Then("User should see all About Us menu")
    public void userShouldSeeAboutUsMenu() {
        steps.about_us_menu_visible();
    }

    @When("User click Online Trainer")
    public void userClickOnlineTrainer() {
        steps.click_online_trainer();
    }

    @Then("User should see Online Trainer page")
    public void userShouldSeeOnlineTrainerPage() {
        steps.online_trainer_menu_visible();
    }


}
