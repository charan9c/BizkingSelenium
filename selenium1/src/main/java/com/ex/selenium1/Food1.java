package com.ex.selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Food1 {

//    public static void main(String[] args) {
//        // Initialize WebDriver (ensure you've set the correct path for ChromeDriver)
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Navigate to the login page
//            driver.get("http://216.10.243.218:5014/#/admin");
//
//            // Initialize WebDriverWait with a 20-second timeout
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//            // Wait for the first button to be clickable and click it
//            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
//            button.click();
//
//            // Wait for the second button to be clickable and click it
//            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[2]//div//div")));
//            button1.click();
//            Thread.sleep(1000);
//            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[3]//div//div")));
//            button2.click();
//            Thread.sleep(1000);
//            WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[4]//div//div")));
//            button3.click();
//            Thread.sleep(1000);
//            // Wait for a specific element on the next page to ensure navigation has occurred
//            // Replace this with an element you expect to appear on the next page
//            System.out.println("Navigated to the all page successfully");
//
//        } catch (Exception e) {
//            // Print the exception if something goes wrong
//            e.printStackTrace();
//        } finally {
//            // Ensure the driver is quit (browser closes after the test)
//            driver.quit();
//        }


	

//	    public static void main(String[] args) {
//	        // Initialize WebDriver (ensure you've set the correct path for ChromeDriver)
//	        WebDriver driver = new ChromeDriver();
//
//	        try {
//	            // Navigate to the login page
//	            driver.get("http://216.10.243.218:5014/#/admin");
//
//	            // Initialize WebDriverWait with a 20-second timeout
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	            // Wait for the first button to be clickable and click it
//	            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
//	            button.click();
//
//	            // Wait for the second button to be clickable and click it
//	            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[2]//div//div")));
//	            button1.click();
//
//	            // Wait for the third button to be clickable and click it
//	            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[3]//div//div")));
//	            button2.click();
//
//	            // Wait for the fourth button to be clickable and click it
//	            WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[4]//div//div")));
//	            button3.click();
//
//	            // Wait for a specific element on the next page to ensure navigation has occurred
//	            // Replace this with an element you expect to appear on the next page after navigation
//	            WebElement someElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='some-class']")));
//	            System.out.println("Navigated to the all page successfully");
//
//	        } catch (Exception e) {
//	            // Print the exception if something goes wrong
//	            e.printStackTrace();
//	        } finally {
//	            // Ensure the driver is quit (browser closes after the test)
//	            driver.quit();
//	        }
//	    }
//	}


//    public static void main(String[] args) {
//        // Initialize WebDriver (ensure you've set the correct path for ChromeDriver)
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Navigate to the login page
//            driver.get("http://216.10.243.218:5014/#/admin");
//
//            // Initialize WebDriverWait with a 20-second timeout
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//            // Wait for the first button to be clickable and click it
//            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
//            button.click();
//Thread.sleep(1000);
//            // Wait for the second button to be clickable and click it
//            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[2]//div//div")));
//            button1.click();
//            Thread.sleep(1000);
//            // Wait for the third button to be clickable and click it
//            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[3]//div//div")));
//            button2.click();
//            
//            // Wait for the fourth button to be clickable and click it
//            WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[4]//div//div")));
//            button3.click();
//            
//            // Debugging step: Print the page source to see what the DOM contains
//          //  System.out.println(driver.getPageSource());
//
//            // Try waiting for a different element (make sure this element is visible on the next page)
//          //  WebElement someElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'expected-class-name')]")));
//            System.out.println("Navigated to the page successfully");
//
//        } catch (Exception e) {
//            // Print the exception if something goes wrong
//            e.printStackTrace();
//        } finally {
//            // Ensure the driver is quit (browser closes after the test)
//            driver.quit();
//        }
//    }
//}


    public static void main(String[] args) {
        // Initialize WebDriver (ensure you've set the correct path for ChromeDriver)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the login page
            driver.get("http://216.10.243.218:5014/#/admin");

            // Initialize WebDriverWait with a 20-second timeout
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Wait for the first button to be clickable and click it
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
            button.click();

            // Wait for 2 seconds to observe the click action
            Thread.sleep(1000);

            // Wait for the second button to be clickable and click it
            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[2]//div//div")));
            button1.click();

            // Wait for 2 seconds to observe the click action
            Thread.sleep(1000);
            WebElement button1a = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
            button.click();
            // Wait for the third button to be clickable and click it
            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[3]//div//div")));
            button2.click();

            // Wait for 2 seconds to observe the click action
            Thread.sleep(1000);
            
            WebElement button1b = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header//button//span[3]//i")));
            button.click();

            // Wait for the fourth button to be clickable and click it
            WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//a[4]//div//div")));
            button3.click();

            // Wait for 2 seconds to observe the click action
            Thread.sleep(1000);

            // Debugging step: Print the page source to see what the DOM contains
         //   System.out.println(driver.getPageSource());

            // Wait for a specific element on the next page (change this to the actual element you expect to appear)
          //  WebElement someElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'expected-class-name')]")));
            System.out.println("Navigated to the page successfully");

        } catch (Exception e) {
            // Print the exception if something goes wrong
            e.printStackTrace();
        } finally {
            // Ensure the driver is quit (browser closes after the test)
            driver.quit();
        }
    }
}  

