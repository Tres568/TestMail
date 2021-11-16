package ru.mailSend;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestSendMassage extends WebDriverSettings {

    @Test
    public void TestSendMessage(){
        WebDriver chrome_driver = driver;
        //LOGIN
        LoginPage.Login(chrome_driver);
        //WRITE MESSAGE
        MessagePage.SendMessage(chrome_driver);
    }

}
