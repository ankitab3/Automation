package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDisableElementUsingJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DS_USER/Desktop/disablePractice.html");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//Navigate to the application
		
		
		jse.executeScript("document.getElementById('abc').value='ADMIN';");
		Thread.sleep(5000);
		jse.executeScript("document.getElementById('abc').value='';");
		
	}

}
