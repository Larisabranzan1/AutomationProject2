package PageObjects;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath = "//a[contains(@href,'signup')]")
    private WebElement registerPageBtn;

    @FindBy(tagName = "h2")
    private WebElement loginPagebtn;

    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement loginbtn;


    private WebElement rememberMe;

    @FindBy(xpath = "//input[@id='user']/../..//small")
    private WebElement usernameErr;


    @FindBy(xpath = "//input[@id='pass']/../..//small")
    private WebElement passErr;


    @FindBy(css = "a[href*='alerts']")
    private WebElement cookieButtonElement;

    @FindBy(css = "a[href*='alerts']")
    private WebElement alertsButtonElement;

    @FindBy(css = "a[href*='hover']")
    private WebElement hoverButtonElement;

    @FindBy(css = "a[href*='modal']")
    private WebElement modalButtonElement;


    @FindBy(css = "a[href*='signup']")
    private WebElement signUpButtonElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }


    public void goToLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(loginPagebtn));
        loginPagebtn.click();
    }

    public void login(String username, String pass) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(pass);
        loginbtn.click();
    }

    public String getPassErr() {
        try {
            return passErr.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }

    public String geUsernameErr() {
        try {
            return usernameErr.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }

    public void accessRegistrationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(registerPageBtn));
        registerPageBtn.click();
    }

    public void goToRegistrationPage(){
        wait.until(ExpectedConditions.visibilityOf(registerPageBtn));
        registerPageBtn.click();
    }

    public void goToCookiePage() {
        wait.until(ExpectedConditions.visibilityOf(cookieButtonElement));
        cookieButtonElement.click();
        Cookie cookie = new Cookie("cookiePageTitle", "The gibberish talking cookie");
        driver.manage().addCookie(cookie);
//        return new CookiePage(driver);
    }


    public void goToAlertsPage() {
        wait.until(ExpectedConditions.visibilityOf(alertsButtonElement));
        alertsButtonElement.click();
    }

    public void goToHoverPage() {
        wait.until(ExpectedConditions.visibilityOf(hoverButtonElement));
        hoverButtonElement.click();
    }

    public void goToModalPage() {
        wait.until(ExpectedConditions.visibilityOf(modalButtonElement));
        modalButtonElement.click();
    }



    //  public CookiePage goToCookiePage(){
  //      wait.until(ExpectedConditions.visibilityOf(cookieButtonElement));
  //      cookieButtonElement.click();
 //      return new CookiePage(driver);
 //   }


}
