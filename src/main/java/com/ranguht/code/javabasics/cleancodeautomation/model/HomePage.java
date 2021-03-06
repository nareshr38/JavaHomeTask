package com.ranguht.code.javabasics.cleancodeautomation.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public static final String GITHUB_BASE_URL = "http://www.github.com";

    @FindBy(xpath = "//button[@aria-label='Switch account context']/span")
    private WebElement linkLoggedInUser;

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(GITHUB_BASE_URL);
    }

    public String getLoggedInUserName() {
        return linkLoggedInUser.getText();
    }

    public Integer hasUserLoggedIn() {
        if (linkLoggedInUser.getText() != "") {
            return 1;
        }
        else {
            return -1;
        }
    }
}
