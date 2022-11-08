package datePicker;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).click();
		
		String requiredDate="15";
		String requiredMonth="January";
		int requiredMonInNum=DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(requiredMonth).get(null);
		String requiredYear="2023";
		int requiredYearInNum=Integer.parseInt(requiredYear);
		
		
		String actualMonthYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actualMonthYear);
		
		String[] str=actualMonthYear.split(" ");
		//System.out.println(str);
		String actualMonth=str[0];
		int actualMonInNum=DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualMonth).get(null);
		String actualYear=str[1];
		
	}

}
