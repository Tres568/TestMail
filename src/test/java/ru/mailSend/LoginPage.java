package ru.mailSend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends WebDriverSettings {
    public static void Login(WebDriver login_page){
        login_page.get("https://mail.ru");
        WebElement Login = login_page.findElement(By.xpath("//input[@name='login']"));
        Login.clear();
        Login.sendKeys(LoginAndPassword.getMail());

        login_page.findElement(By.xpath("//button[@class='button svelte-1tib0qz']")).click();
        System.out.println("Ввел логин");

        login_page.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement Password = login_page.findElement(By.xpath("//input[@name='password']"));
        Password.clear();
        Password.sendKeys(LoginAndPassword.getPassword());

        login_page.findElement(By.xpath("//button[@class='second-button svelte-1tib0qz']")).click();

    }

}
