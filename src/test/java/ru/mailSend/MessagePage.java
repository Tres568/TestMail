package ru.mailSend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MessagePage {
    public static void SendMessage(WebDriver message_page){
        message_page.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        message_page.findElement(By.xpath("//a[@class='compose-button compose-button_white compose-button_short js-shortcut']")).click();
        WebElement Adress = message_page.findElement(By.xpath("//input[@class='container--H9L5q size_s--3_M-_']"));
        Adress.sendKeys(LoginAndPassword.getMail());

        WebElement Title = message_page.findElement(By.xpath("//input[@name='Subject']"));
        Title.sendKeys("test message from robot");

        WebElement BodyMessage = message_page.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]/br"));
        BodyMessage.sendKeys("This is an auto-generated mail");

        message_page.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        message_page.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[2]/div[1]/span[1]")).click();
    }
}
