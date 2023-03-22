package com.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class BackForward {


    @Test
    public void backForward() throws InterruptedException {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://google.com");
        System.out.println("title : "+title());
        Thread.sleep(1000);
        open("http://amazon.in");
        System.out.println("title : "+title());
        Thread.sleep(1000);
        back();
        System.out.println("title : "+title());
        Thread.sleep(1000);
        forward();
        System.out.println("title : "+title());
        Thread.sleep(1000);
        refresh();
        Thread.sleep(1000);
        System.out.println("title : "+title());
    }
}
