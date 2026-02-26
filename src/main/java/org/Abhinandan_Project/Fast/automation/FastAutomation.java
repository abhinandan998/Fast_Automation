package org.Abhinandan_Project.Fast.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FastAutomation {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://fast.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By speed_value_Locator = By.id("speed-value");
        By speed_Unit_locator = By.id("speed-units");
        String className;
        while(true) {
            WebElement speedValueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speed_value_Locator));
            WebElement speedUnitValue = wait.until(ExpectedConditions.visibilityOfElementLocated(speed_Unit_locator));

            System.out.println(speedValueElement.getText() + " "+ speedUnitValue.getText()) ;

            className = speedValueElement.getAttribute("class");
            if(className!=null && className.contains("succeeded"))
            {
                break;
            }

        }
        WebElement speedValueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speed_value_Locator));
        WebElement speedUnitValue = wait.until(ExpectedConditions.visibilityOfElementLocated(speed_Unit_locator));

        System.out.println("-----Final Speed-----");
        System.out.println(speedValueElement.getText() + " "+ speedUnitValue.getText());


    }
}
