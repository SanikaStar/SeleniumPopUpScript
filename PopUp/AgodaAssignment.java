package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgodaAssignment {
   public static void main(String[] args) throws InterruptedException {
	   ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.agoda.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[data-selenium='checkInBox']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label=\'Fri Nov 07 2025 \']")).click();
	Thread.sleep(2000);

	for(;;)
	{
		try {
			driver.findElement(By.xpath("//div[@aria-label='Sat Mar 07 2026 ']")).click();
			break;
			
		}catch(Exception e)
		{
			driver.findElement(By.cssSelector("[data-selenium='calendar-next-month-button']")).click();
		}
		Thread.sleep(2000);
	}
	driver.close();
	
}
}
