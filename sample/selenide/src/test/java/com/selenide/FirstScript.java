package com.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class FirstScript {

    @Test
    public void firstScript() throws InterruptedException {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://google.com");
        Thread.sleep(1000);
        $(By.name("q")).setValue("About life");
        Thread.sleep(1000);
        $(By.name("btnK")).click();
        $(By.className("logo")).shouldHave(appear);
        Thread.sleep(1000);
        int size = $$(By.cssSelector(".LC20lb")).size();
        System.out.println("size = " + size);
        $$(By.cssSelector(".LC20lb")).shouldHave(CollectionCondition.size(size));
    }
}
