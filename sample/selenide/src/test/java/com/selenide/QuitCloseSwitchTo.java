package com.selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class QuitCloseSwitchTo {

    @Test
    public void quitCloseSwitchTo() throws InterruptedException {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title : "+title());
        Thread.sleep(2000);
        $(By.xpath("//a[contains(@href,\"OrangeHRMInc\")]")).click();
        Thread.sleep(2000);
        switchTo().window(1);
        System.out.println("Title : "+title());
        Thread.sleep(2000);
        closeWindow();
        Thread.sleep(2000);
        switchTo().window(0);
        System.out.println("Title : "+title());
        Thread.sleep(2000);
        closeWebDriver();
    }
}
