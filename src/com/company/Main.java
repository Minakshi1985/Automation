package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get ("https://www.google.se/");
     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
    }
}
