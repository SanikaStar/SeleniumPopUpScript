package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestCase.BaseClass;

public class MultipleChildPages extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		String expected_url="https://x.com/nopCommerce";
		String expected_url2="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String expected_url3="https://www.youtube.com/user/nopCommerce";
		String expected_url4="https://www.facebook.com/nopCommerce";
		preCondition();
		String parentHandle=driver.getWindowHandle();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		List<WebElement> eccommerce_link = driver.findElements(By.xpath("//a[@target='_blank']"));
		for(WebElement web:eccommerce_link)
		{
			web.click();
			Thread.sleep(2000);
			
		}
	
	Thread.sleep(2000);
	Set<String> childHandles = driver.getWindowHandles();
	System.out.println(childHandles);
	for(String str:childHandles) {
		driver.switchTo().window(str);
		String actual_url=driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			Thread.sleep(2000);
			
		}
		
		else if(expected_url2.equals(actual_url))
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='email']")).click();
			Thread.sleep(2000);
			
		}else if(expected_url3.equals(actual_url))
		{
			Thread.sleep(5000);
			driver.findElement(By.name("search_query")).sendKeys("travel blog");
			Thread.sleep(1000);
		}else if(expected_url4.equals(actual_url))
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Create new account']")).click();
			Thread.sleep(1000);
		}
		
	}
	
     
	}

}
