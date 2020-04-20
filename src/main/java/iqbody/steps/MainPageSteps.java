package iqbody.steps;

import iqbody.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class MainPageSteps {

    MainPage page;

    @Step
    public void open_main_page() {
        page.open();
    }

    @Step
    public void click_login_button() {
        page.findRegisterButton();
    }

    @Step
    public void check_reg_button() {
        page.findLoginButton2();
    }

    @Step
    public void click_training() {
        page.openTrainingMenu();
    }

    @Step
    public void click_nutrition() {
        page.openNutritionMenu();
    }

    @Step
    public void click_knowledge_base() {
        page.openKnowledgeBaseMenu();
    }

    @Step
    public void click_about_us() {
        page.openAboutUsMenu();
    }

    @Step
    public void click_online_trainer() {
        page.openOnlineTrainerPage();
    }

    @Step
    public void training_mega_menu_visible() {
        page.TrainingMegaMenu();
    }

}
