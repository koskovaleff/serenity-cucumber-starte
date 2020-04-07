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

    public void findRegisterButton () {
        LoginButton.click();
        RegisterButton.shouldBeVisible();
    }

    public void findLoginButton2 () {
        LoginButton2.waitUntilClickable();
        LoginButton2.shouldBeVisible();
    }




}

