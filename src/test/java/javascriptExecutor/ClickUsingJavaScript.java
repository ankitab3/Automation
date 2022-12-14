package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickUsingJavaScript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement laptopsTablets=driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll till the element
		jse.executeScript("arguments[0].scrollIntoView(true);",laptopsTablets);
		//click on the element
		jse.executeScript("arguments[0].click();",laptopsTablets);
	}

}
