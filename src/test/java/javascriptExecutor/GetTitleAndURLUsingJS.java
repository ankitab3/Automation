package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndURLUsingJS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//Navigate to the application
		jse.executeScript("window.location=arguments[0];","https://www.amazon.com/");
		
		//Get The Title
		System.out.println(jse.executeScript("return document.title"));
		
		//Get The URL
		System.out.println(jse.executeScript("return document.URL"));
	}

}
