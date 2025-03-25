package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestGooglePage {
	WebDriver driver;
	@BeforeTest
    public void setUp() {
        // Set up the Chrome driver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
	
	@Test
	public void testImageSearch() throws InterruptedException {		
		
		// Step 1: Launch the browser and navigate to google.com
		driver.get("https://www.google.com.au/");
		
		// Step 2: Find the search bar and type "Canberra"
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // Timeout of 10 seconds
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("Canberra");
        
        // Step 3: Submit the search
        searchBox.submit();		
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
//		Thread.sleep(5000);driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();        
        
		//Thread.sleep(10000);
		
		// Step 4: Find the "Images" tab and click it		
		WebElement imagesTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Images')]")));
        imagesTab.click();
	}
	
	@AfterTest
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }

}
