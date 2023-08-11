package Tests;


import PageObjects.AccountPage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {

    LoginPage loginPage;
    AccountPage accountPage;


    @FindBy(xpath = "//a[contains(@href,'signup')]")
    private WebElement registerPageBtn;

    @DataProvider(name = "loginNDp")
    public Object[][] loginNegativeDataProvider() {
        return new Object[][]{
                {"", "", "chrome", "Please enter your username", "Please enter your password"},
                {"", "somePassword", "edge", "Please enter your username", ""},
                {"test", "", "firefox", "", "Please enter your password"},
                {"zebra", "zebrapassword", "chrome", "", ""}
        };
    }

    @DataProvider(name = "loginPDp")
    public Object[][] loginPositiveDataProvider() {
        return new Object[][]{
                {"dingo", "dingopassword", "chrome"},
                {"camel", "camelpassword", "chrome"},
                {"zebra", "zebrapassword", "chrome"},
        };
    }

    @Test(dataProvider = "loginNDp")
    public void loginNegative(String username, String password, String browser, String usernameErr, String passErr) {
        System.out.println("Login with username:" + username + "/password:" + password + "=> on browser:" + browser);
        setUpDriver(browser);
        driver.get(baseUrl);
        System.out.println("Open Browser");

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login(username, password);
        System.out.println("Login finished, verify error message");
        Assert.assertEquals(loginPage.geUsernameErr(), usernameErr);
        Assert.assertEquals(loginPage.getPassErr(), passErr);
    }

    @Test(dataProvider = "loginPDp")
    public void loginPositive(String username, String password, String browser) {
        System.out.println("Login with username:" + username + "/password:" + password + "=> on browser:" + browser);
        setUpDriver(browser);
        driver.get(baseUrl);
        System.out.println("Open Browser");

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login(username, password);
        System.out.println("Login finished, verify error message");
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.getName().contains(username));
        System.out.println ("Logout user");
    }
}


