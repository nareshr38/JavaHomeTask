package cleancodetests;

import com.ranguht.code.javabasics.cleancodeautomation.model.HomePage;
import com.ranguht.code.javabasics.cleancodeautomation.pages.SignInPage;
import com.ranguht.code.javabasics.cleancodeautomation.pages.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class CTest1 {



    public WebDriver driver = new FirefoxDriver();
    @DataProvider(name = "cleanCodeTestData")
    public Object[][] testDataCleanCodeTests() {
        return new Object[][]{
                {"testAutomationUser","time4Death"},
                {"testAutomationUser1","smiley123$"},
                {"testAutomationUser2","watch123$"}
        };
    }

    @Test(dataProvider = "cleanCodeTestData")


    public void testOneCanLoginGithub(String USERNAME,String PASSWORD)
    {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        StartPage startPage = new StartPage(driver);
        startPage.open();
        SignInPage signInPage = startPage.invokeSignIn();
        HomePage homePage = signInPage.signIn(USERNAME, PASSWORD);
        String loggedInUserName = homePage.getLoggedInUserName();
        Assert.assertEquals(USERNAME, loggedInUserName);
        driver.quit();
    }

}
