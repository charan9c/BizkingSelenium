package com.ex.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class C2 {

    public static void main(String[] args) {
        // Set path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_your_chromedriver");

        // Initialize Chrome options (optional, for headless mode)
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Uncomment if you want to run headless (without UI)

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the login page
            System.out.println("Navigating to login page...");
            driver.get("http://103.211.218.32:5020/#/login");

            // Wait for the page to load completely (ensure JavaScript finishes execution)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increased timeout
            System.out.println("Waiting for username field...");

            // Wait for the username field to be visible
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-0")));
            System.out.println("Username field is visible");

            // Wait for password field to be visible
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-2")));
            System.out.println("Password field is visible");

            // Wait for sign-in button to be clickable
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("button_id"))); // Replace with actual button ID
            System.out.println("Sign-in button is clickable");

            // Scroll the username field into view if it's not visible on the screen
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", usernameField);

            // Input username and password
            usernameField.sendKeys("cityleadhyd@bizkingz.com");
            passwordField.sendKeys("admin1234");

            // Click the Sign In button using JavaScript (in case normal click fails)
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signInButton);
            System.out.println("Sign In button clicked");

            // Wait for the dashboard or another page to load (check URL or a specific element)
            wait.until(ExpectedConditions.urlContains("Dashboardhome")); // Adjust according to your application's success URL
            System.out.println("Login Successful");

            // Click on the icon after login if required
            WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='v-responsive v-img']//img[@class='v-img__img v-img__img--contain']")));
            icon.click();
            System.out.println("Icon clicked successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
