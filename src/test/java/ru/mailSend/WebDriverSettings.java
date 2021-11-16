package ru.mailSend;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Tres/JAVA_TESTS/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Тест начат");
    }
    @After
    public void Close(){
        System.out.println("Тест Закончен");
        driver.quit();

    }
}
