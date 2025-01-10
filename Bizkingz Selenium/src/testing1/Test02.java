package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test02 {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dizitive\\Desktop\\c\\chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the OrangeHRM login page
            driver.get("http://103.211.218.32:5020/#/login");

            // Wait for the username field to be present in the DOM (not necessarily visible)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // Increased timeout to 20 seconds
            WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-0")));  // Wait for the element to be present

            // Locate the username field and enter the username
            email.sendKeys("cityleadhyd@bizkingz.com");

            // Wait for the password field to be visible
            WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-2")));
            password.sendKeys("bkap@123");

            // Locate the login button and click it
            WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("button_id")));
            submit.click();

            // Optionally, wait for the next page to load or verify successful login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementAfterLogin")));  // Replace with actual element after login

            // Output message to indicate login success
            System.out.println("Login Successful");
            
            
            WebElement lead = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Lead']")));  lead.click();

        } catch (Exception e) {
            // Handle exceptions if any error occurs
            e.printStackTrace();
        } finally {
            // Close the browser after the test
            driver.quit();
        }
    }
}
