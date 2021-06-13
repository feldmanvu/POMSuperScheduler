package tests;

import config.ConfigBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class LoginTest extends ConfigBase {

    @Test
    public void loginTest(){
        boolean isLogged =
                new SplashScreen(driver)
                        .checkVersion("0.0.3")
                        .fillEmail("john@gmail.com")
                        .fillPassword("Jj123456$")
                        .clicklogin()
                        .skipWizard()
                        .isFabAddPresent();

        Assert.assertTrue(isLogged);


    }


    @Test
    public void complitLoginTest() {
    }
}