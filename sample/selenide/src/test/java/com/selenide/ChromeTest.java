package com.selenide;

/*import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;*/

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ChromeTest {

    @Test
    public void chromeVerify() throws InterruptedException {
        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");*/
        /*    ChromeOptions options = new ChromeOptions();*/

        // Configuration.browser = "firefox";
        // WebDriver wm = new ChromeDriver(options);
        // WebDriver wm = new ChromeDriver();
        // System.setProperty("selenide.browser","firefox");
        //Configuration.headless = true;
        // wm.get("http://google.com");
        //Configuration.browser = "edge";
/*        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://google.com");
        Thread.sleep(2000);
        $(By.name("q")).setValue("About life");
        Thread.sleep(2000);
        $(By.name("btnK")).click();
        Thread.sleep(2000);*/

       // WebDriverManager.chromedriver().browserVersion("96.0.4664.110").setup();

        // WebDriverManager.chromedriver().setup();

       /* ChromeOptions options = new ChromeOptions();

//options.addArguments("--headless");

        options.addArguments("--disable-notifications");

        options.addArguments("--disable-gpu");

        options.addArguments("--disable-extensions");

        options.addArguments("--no-sandbox");

        options.addArguments("--disable-dev-shm-usage");

       // options.addArguments("--remote-allow-origins=*");  // this i added  this and it worked, Thanks a ton  xinchao zhang !!

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        options.merge(capabilities);

        WebDriver wd = new ChromeDriver(options);

       // wd.manage().window().maximize();

        wd.get("http://google.com");
        wd.close();*/
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //WebDriver wd = new ChromeDriver();
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        //wd.get("http://google.com");
        //open("https://www.amazon.in/");
        open("http://google.com");
        Thread.sleep(1000);
        /*SelenideElement element = $(By.id("nav-link-accountList-nav-line-1"));
        SelenideElement element2 = $(By.className("nav-line-1-container"));
        SelenideElement element1 = $(By.id("nav_prefetch_yourorders"));
        System.out.println(element2.innerHtml());*/

     //   actions().moveToElement(element).click(element1).perform();
       // Thread.sleep(3000);
        $(By.name("q")).setValue("About life");
        Thread.sleep(1000);
        $(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(appear);
        Thread.sleep(1000);
    }
}
