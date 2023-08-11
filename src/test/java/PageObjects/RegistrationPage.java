package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.sit.course06_07.MyCustomException;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RegistrationPage {

    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;
    Actions actions;

    @FindBy(xpath = "//a[contains(@href,'signup')]")
    private WebElement registerPageBtn;

    @FindBy(tagName = "h2")
    private WebElement loginPageBtn;

    @FindBy(id = "username")
    private WebElement usernameRegistration;

    @FindBy(id = "password")
    private WebElement passwordRegistration;

    @FindBy(id = "password2")
    private WebElement confirmPwsRgn;

    @FindBy(id = "Mr")
    private WebElement mr;

    @FindBy(id = "Ms")
    private WebElement ms;

    @FindBy(id = "input-first-name")
    private WebElement firstNameRgn;

    @FindBy(id = "input-last-name")
    private WebElement lastNameRgn;

    @FindBy(id = "input-email")
    private WebElement emailRgn;

    @FindBy(id = "input-dob")
    private WebElement dateOfBirth;

    @FindBy(id = "input-nationality")
    private WebElement nationality;

    @FindBy(css = "input#terms+label")
    private WebElement acceptTerms;

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement submitButton;



    @FindBy(xpath = "//Input[@id='username']/../..//small[2]")
    private WebElement usernameErr;
    //Please choose a shorter username

    @FindBy(xpath = "//Input[@id='password1']/../..//small[2]")
    private WebElement passError;
    //input[@id='password2']/../..//small[2]


    @FindBy(xpath = "//Input[@id='password2']/../..//small[2]")
    private WebElement confirmPassError;
    //input[@id='password2']/../..//small[2]


    @FindBy(xpath="//input[@id='terms']/../..//small")
    private WebElement acceptTermsErr;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }


    public String getName(){
        wait.until(ExpectedConditions.visibilityOf(registerPageBtn));
        return registerPageBtn.getText();
    }

    public void usernameInputRegistration(String username){
        wait.until(ExpectedConditions.elementToBeClickable(usernameRegistration));
        usernameRegistration.clear();
        usernameRegistration.sendKeys(username);
        usernameRegistration.submit();
    }

    public void passwordInputRegistration(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordRegistration));
        passwordRegistration.clear();
        passwordRegistration.sendKeys(password);
        passwordRegistration.submit();
    }


    public void passwordConfirmInput(String confirmPass){
        wait.until(ExpectedConditions.elementToBeClickable(confirmPwsRgn));
        confirmPwsRgn.clear();
        confirmPwsRgn.sendKeys(confirmPass);
        confirmPwsRgn.submit();
    }



    public void clickTermsCheckboxUsingActionsScroll() throws MyCustomException {
        wait.until(ExpectedConditions.visibilityOf(acceptTerms));
        int currentRetry = 0;
        while (currentRetry < 50) {
            try {
                actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
                acceptTerms.click();
                break;
            } catch (MoveTargetOutOfBoundsException | ElementClickInterceptedException e) {
                currentRetry++;
            }
        }
        if (currentRetry >= 50) {
            throw new MyCustomException("Max retry reached");
        }
    }

    public void clickTermsUnCheckboxUsingActionsScroll() throws MyCustomException {
        wait.until(ExpectedConditions.visibilityOf(acceptTerms));
        int currentRetry = 0;
        while (currentRetry < 50) {
            try {
                actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
                acceptTerms.click();
                break;
            } catch (MoveTargetOutOfBoundsException | ElementClickInterceptedException e) {
                currentRetry++;
            }
        }
        if (currentRetry >= 50) {
            throw new MyCustomException("Max retry reached");
        }
    }


    public void unclickTermsCheckboxUsingActionsScroll() throws MyCustomException {
        wait.until(ExpectedConditions.visibilityOf(acceptTerms));
        int currentRetry = 0;
        while (currentRetry < 50) {
            try {
                actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
                if (acceptTerms.isSelected()) {
                    acceptTerms.click();
                }
                break;
            } catch (MoveTargetOutOfBoundsException | ElementClickInterceptedException e) {
                currentRetry++;
            }
        }
        if (currentRetry >= 50) {
            throw new MyCustomException("Max retry reached");
        }
    }

    public boolean isCheckBoxSelected(){
        return acceptTerms.isSelected();
    }

    public void clickRegisterBtn(){
        Actions clickAction = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        wait.until(presenceOfElementLocated(By.xpath("//button")));
        clickAction.moveToElement(submitButton);
        submitButton.sendKeys(Keys.ENTER);
        submitButton.click();
    }

    public String usernameErr() {
        try {
            return usernameErr.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }

    public String passError() {
        try {
            return passError.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }


    public String confirmPassError() {
        try {
            return confirmPassError.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }

    public String acceptTermsErr() {
        try {
            return acceptTermsErr.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }


}
