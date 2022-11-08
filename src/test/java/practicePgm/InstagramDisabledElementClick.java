package practicePgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramDisabledElementClick {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement userNameTextField=driver.findElement(By.name(""));
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
	}

}
