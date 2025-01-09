package com.ex.selenium1;



//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class Class1 {
//	    public static void main(String[] args) {
//	        // Set up Chrome WebDriver using WebDriverManager
//	        WebDriverManager.chromedriver().setup();
//
//	        // Create a new ChromeDriver instance
//	        WebDriver driver = new ChromeDriver();
//
//	        try {
//	            // Navigate to a URL
//	            driver.get("https://www.google.com");
//
//	            // Print the title of the page
//	            System.out.println("Page Title: " + driver.getTitle());
//
//	            // You can interact with the page, for example:
//	            // driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
//	            // driver.findElement(By.name("btnK")).submit();
//	        } finally {
//	            // Close the browser window
//	            driver.quit();
//	        }
//	    }
//	}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Class1 {

    public static void main(String[] args) {
        // Set path to the ChromeDriver
       

        // Initialize Chrome options (optional, for headless mode)
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Uncomment if you want to run headless (without UI)

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the login page
            driver.get("http://103.211.218.32:5020/#/login");

            // Wait until the login elements are visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increased timeout to 30 seconds

            // Debugging info
            System.out.println("Waiting for username field...");
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-0")));
            System.out.println("Username field is visible.");

            System.out.println("Waiting for password field...");
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-2")));
            System.out.println("Password field is visible.");

            System.out.println("Waiting for Sign In button...");
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("button_id"))); // Ensure this is the correct ID
            System.out.println("Sign In button is clickable.");

            // Input username and password
            usernameField.sendKeys("cityleadhyd@bizkingz.com");
            passwordField.sendKeys("admin1234");

            // Click the Sign In button
            signInButton.click();

            // Wait for successful login and the correct URL
            System.out.println("Waiting for URL to confirm login...");
            wait.until(ExpectedConditions.urlContains("Dashboardhome"));

            // Click on the icon after login
            System.out.println("Waiting for the icon...");
            WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='v-responsive v-img']//img[@class='v-img__img v-img__img--contain']")));
            icon.click();

            System.out.println("Login Successful");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
          //  driver.quit();
        }
    }
}
