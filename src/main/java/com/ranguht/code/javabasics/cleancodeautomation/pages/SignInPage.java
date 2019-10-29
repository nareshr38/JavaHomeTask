package com.ranguht.code.javabasics.cleancodeautomation.pages;

import com.ftajava.ftaclass.cleancodeautomation.model.HomePage;
import com.ftajava.ftaclass.cleancodeautomation.model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public static final String GITHUB_BASE_URL = "http://www.github.com";

    @FindBy(id = "login_field")
    private WebElement loginUsername;

    @FindBy(id = "password")
    private WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;

    private WebDriver driver;

    public SignInPage(WebDriver mDriver) {
        this.driver = mDriver;
        PageFactory.initElements(mDriver, this);
    }

    public HomePage signIn(String username, String password) {
        loginUsername.sendKeys(username);
        loginPassword.sendKeys(password);
        buttonSubmit.click();
        return new HomePage(driver);
    }

    public boolean isReadyToSignIn() throws Exception {
        if (buttonSubmit.isDisplayed()){
            return true;
        }
        else {
            throw new Exception();
        }
    }

    public void open() {
        driver.get(GITHUB_BASE_URL);
    }

    public HomePage signIn(User user){
        return this.signIn(user.getUsername(), user.getPassword());
    }

}