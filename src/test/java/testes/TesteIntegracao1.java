package testes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TesteIntegracao1 {
	
 //	private static DefautSelenium selenium;
	
	static WebDriver driver;
	  
    @BeforeClass
    public static void setup() {	
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    	driver = new ChromeDriver();
    	driver.navigate().to("http://127.0.0.1:8080/");
    }

	@Test
	public void test() {
		WebElement loginButton = driver.findElement(By.id("loginPrestador"));
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
	}

    @AfterClass
    public static void tearDown() {
    	driver.close();
    }

}
