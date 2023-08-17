package Tests;

import PageObjects.CookiePage;
import PageObjects.LoginPage;
import PageObjects.CookiePage;
import PageObjects.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class HomeworkCookie extends BaseTest {
    LoginPage loginPage;
    CookiePage cookiePage;


    @Test
    public void createCookieFromCode(){
        loginPage=new LoginPage(driver);
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver); // see the value of cookie, by accessing the goToCookiePage method
        Cookie pageTitleCookie = driver.manage().getCookieNamed("cookiePageTitle");
        Assert.assertEquals(cookiePage.getPageTitle(), pageTitleCookie.getValue(),"Incorrect page title");
    }


    @Test
    public void createCookieUsingButton() {
        loginPage = new LoginPage(driver);
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver);
        driver.navigate().refresh();
        cookiePage.clickSetCookieButton();
        Cookie consentCookie = driver.manage().getCookieNamed("gibberish");
        Assert.assertNotNull(consentCookie, "Checking that the cookie is not null");
        System.out.println("Consent cookie value: " + consentCookie.getValue());
        Assert.assertEquals(consentCookie.getValue(), cookiePage.getDisplayedCookie(), "Incorrect cookie values");
    }

    @Test
    public void deleteCookie() {
        loginPage=new LoginPage(driver);
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver);
        Assert.assertTrue(cookiePage.setCookieButtonIsDisplayed(),
                "Cookie button is not displayed");
        driver.navigate().refresh();
        cookiePage.clickSetCookieButton();
        Cookie consentCookie = driver.manage().getCookieNamed("gibberish");
        Assert.assertNotNull(consentCookie, "Checking that the cookie is not null");
        System.out.println("Consent cookie value: " + consentCookie.getValue());
        Assert.assertEquals(consentCookie.getValue(), cookiePage.getDisplayedCookie(),
                "Incorrect cookie values");
        cookiePage.removeCookie();
        Assert.assertEquals("", cookiePage.getDisplayedCookie(), "Incorrect cookie values");
        consentCookie = driver.manage().getCookieNamed("gibberish");
        Assert.assertNull(consentCookie, "Cookie is still present");

    }

    @Test
    public void deleteAllCookies ()
        throws IOException {
            loginPage = new LoginPage(driver);
            loginPage.goToCookiePage();
            cookiePage = new CookiePage(driver);
            Assert.assertTrue(cookiePage.setCookieButtonIsDisplayed(),
                    "Cookie button is not displayed");
            driver.navigate().refresh();
            cookiePage.clickSetCookieButton();
            Set<Cookie> allCookies = driver.manage().getCookies();
            for (Cookie cookie : allCookies) {
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }
            System.out.println("-----------------------");
            driver.manage().deleteAllCookies();
            allCookies = driver.manage().getCookies();
            for (Cookie cookie : allCookies) {
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }


    }
}
