package Tests;

import PageObjects.AccountPage;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ro.sit.course06_07.MyCustomException;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseTest {

    LoginPage loginPage;
    AccountPage accountPage;
    RegistrationPage registrationPage;
    WebElement registerPage;


    @DataProvider(name = "registerNegativeDpUserShortLong")
    public Object[][] registerNegativeDpUserShortLong() {
        return new Object[][]{


                {"11b", "Longer username should be used", "chrome"},

                {"asdasdasdsa!!!!221212222222222222222222222", "Shorter username should be used ", "chrome"}


        };
    }

    @Test(dataProvider = "registerNegativeDpUserShortLong")
    public void registerNegativeUseShortLong(String username,
                                             String usernameErr,
                                             String browser) {

        System.out.println("Login with short or long username:" + username + " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);

        System.out.println("Login finished, verify error message");
        Assert.assertEquals(registrationPage.usernameErr(), usernameErr);
    }


    @DataProvider(name = "registerNegativeDpShortPass")
    public Object[][] registerNegativeDpShortPass() {
        return new Object[][]{
                {"user123", "pas1", "chrome", "Longer password should be used"},
        };
    }

    @Test(dataProvider = "registerNegativeDpShortPass")
    public void registerNegativeShortPassword(String username,
                                              String password,
                                              String browser,
                                              String passErr) {

        System.out.println("Login with username:" + username +
                " / short password:" +
                " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);


        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);


        registrationPage.usernameInputRegistration(username);

        registrationPage.passwordInputRegistration(password);
        if (password.length() < 8) {
            System.out.println("Password is too short");
            org.testng.Assert.assertEquals(registrationPage.passError(), passErr);
        }
    }


    @Test(dataProvider = "registerNegativeDpShortPass")
    public void registerNegativeShortPassword2(String username,
                                               String password,
                                               String browser,
                                               String passErr) {

        System.out.println("Registration with username:" + username +
                " / short password:" +
                " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);


        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);


        registrationPage.usernameInputRegistration(username);

        registrationPage.passwordInputRegistration(password);
        System.out.println("Password is too short");
        Assert.assertEquals(registrationPage.passError(), passErr);

    }


    @DataProvider(name = "registerNegativeDpLongPass")
    public Object[][] registerNegativeDpLongPass() {
        return new Object[][]{
                {"user1234", "pas222222222222222222221", "chrome", "Shorter password should be used"},
        };
    }

    @Test(dataProvider = "registerNegativeDpLongPass")
    public void registerNegativeDpLongPass(String username,
                                           String password,
                                           String browser,
                                           String passErr) {

        System.out.println("Registration with username:" + username +
                " / long password:" +
                " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);


        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);


        registrationPage.usernameInputRegistration(username);

        registrationPage.passwordInputRegistration(password);
        System.out.println("Password is too long");
        Assert.assertEquals(registrationPage.passError(), passErr);

    }


    @DataProvider(name = "registerPswConfirmPswDoNotMatch")
    public Object[][] registerPswConfirmPswDoNotMatch() {
        return new Object[][]{
                {"user1234", "Test1234!", "Test1235!", "chrome", "Passwords do not match"},
        };
    }

    @Test(dataProvider = "registerPswConfirmPswDoNotMatch")
    public void registerPswConfirmPswDoNotMatch(String username,
                                                String password,
                                                String password2,
                                                String browser,
                                                String confirmPassError) {

        System.out.println("Registration with username:" + username +
                " Different password :" +
                " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);


        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);


        registrationPage.usernameInputRegistration(username);

        registrationPage.passwordInputRegistration(password);
        System.out.println("Passwords are not the same");
        Assert.assertEquals(registrationPage.confirmPassError(), confirmPassError);

    }

    @DataProvider(name = "registerwithoutuser")
    public Object[][] registerwithoutuser() {
        return new Object[][]{
                {"", "Test1235!", "Test1235!", "chrome", "Please choose an username"},
        };
    }


    @Test(dataProvider = "registerwithoutuser")
    public void registerwithoutuser(String username,
                                    String password,
                                    String password2,
                                    String browser,
                                    String usernameErr) {

        System.out.println("Login with nousername:" + username + " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);

        System.out.println("Login finished, verify error message");
        Assert.assertEquals(registrationPage.usernameErr(), usernameErr);
    }



    @DataProvider(name = "registrationwithoutTermsandConditions")
    public Object[][] registrationwithoutTermsandConditions() {
        return new Object[][]{
                {"larisa123", "Test1235!", "Test1235!", "Larisa", "Ciz", "chrome",  "You need to accept terms"},
        };
    }

    @Test(dataProvider = "registrationwithoutTermsandConditions")
    public void registrationwithoutTermsandConditions (
            String username,
            String password,
            String password2,
            String firstNameRgn,
            String lastNameRgn,
            String browser,
            String acceptTermsErr) throws MyCustomException {

        System.out.println("Login with username:" + username + " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);
        registrationPage.usernameInputRegistration(username);
        registrationPage.passwordInputRegistration(password);
        registrationPage.passwordConfirmInput(password2);
        registrationPage.isCheckBoxSelected();
        registrationPage.clickTermsCheckboxUsingActionsScroll();
        registrationPage.clickRegisterBtn();

        System.out.println("Registration finished, verify error message");
        Assert.assertEquals(registrationPage.acceptTermsErr(), acceptTermsErr);
    }

    @Test(dataProvider = "registrationwithoutTermsandConditions")
    public void registrationSuccessful (
            String username,
            String password,
            String password2,
            String firstNameRgn,
            String lastNameRgn,
            String browser,

            String acceptTermsErr) throws MyCustomException {

        System.out.println("Login with username:" + username + " => on browser:" + browser);

        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);
        registrationPage.usernameInputRegistration(username);
        registrationPage.passwordInputRegistration(password);
        registrationPage.passwordConfirmInput(password2);
        registrationPage.clickTermsCheckboxUsingActionsScroll();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        do {
            registrationPage.isCheckBoxSelected();
        } while (!registrationPage.isCheckBoxSelected());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationPage.clickRegisterBtn();
        System.out.println("Registration finished, verify error message");

    }


}

