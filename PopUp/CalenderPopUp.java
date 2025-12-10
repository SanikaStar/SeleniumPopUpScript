package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("07/11/2025")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("img2Nex")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("img2Nex")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("fst_4_05/02/2026")).click();
//		Thread.sleep(2000);
		
		
		for(;;)
		{
			try {
				driver.findElement(By.id("fst_1_01/06/2026")).click();
				break;
			}catch(Exception e)
			{
				driver.findElement(By.id("img2Nex")).click();
			}
			Thread.sleep(2000);
		}
				
	}

}
