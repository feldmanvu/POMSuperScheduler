package screenobjects;

import dto.Credentials;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends screenobjects.BaseScreen {
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;
    @AndroidFindBy (xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    public LoginScreen fillEmail(String email){
        type (emailEditText,email);
        return this;
    }

    public LoginScreen fillPassword(String password){
        type (passwordEditText,password);
        return this;
    }
    public WizardScreen clicklogin(){
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);
    }
    public WizardScreen complitLogin (Credentials credentials){
        //login
        return new WizardScreen(driver);
    }


}