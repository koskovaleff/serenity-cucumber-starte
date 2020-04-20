package iqbody.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://iq-body.ru/")
public class MainPage extends PageObject {

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[2]/div/div/div[3]/div/a")
    public WebElementFacade LoginButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[2]/div/button")
    public WebElementFacade RegisterButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[1]/div/form/div/button")
    public WebElementFacade LoginButton2;

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div/div[2]/div/ul/li[2]/a")
    public WebElementFacade Training;

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div/div[2]/div/ul/li[3]/a")
    public WebElementFacade Nutrition;

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div/div[2]/div/ul/li[4]/a")
    public WebElementFacade KnowledgeBase;

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div/div[2]/div/ul/li[5]/a")
    public WebElementFacade AboutUs;

    @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div/div[2]/div/ul/li[6]/a")
    public WebElementFacade OnlineTrainer;

    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div[2]")
    public WebElementFacade TrainingMegaMenu;

    public void findRegisterButton () {
        LoginButton.click();
        RegisterButton.shouldBeVisible();
    }

    public void findLoginButton2 () {
        LoginButton2.waitUntilClickable();
        LoginButton2.shouldBeVisible();
    }

    public void openTrainingMenu () {
        Training.waitUntilClickable();
        Training.click();
    }

    public void openNutritionMenu () {
        Nutrition.waitUntilClickable();
        Nutrition.click();
    }

    public void openKnowledgeBaseMenu () {
        KnowledgeBase.waitUntilClickable();
        KnowledgeBase.click();
    }

    public void openAboutUsMenu () {
        AboutUs.waitUntilClickable();
        AboutUs.click();
    }

    public void openOnlineTrainerPage () {
        OnlineTrainer.waitUntilClickable();
        OnlineTrainer.click();
    }

    public void TrainingMegaMenu () {
        TrainingMegaMenu.shouldBeVisible();
    }

}

