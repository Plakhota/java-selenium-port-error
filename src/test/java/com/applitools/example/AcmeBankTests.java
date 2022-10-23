package com.applitools.example;


import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class AcmeBankTests {

@Test
    public void test() {
    WebDriver driver = new ChromeDriver();

    if (driver != null)
        driver.quit();
	
    }
    
}
