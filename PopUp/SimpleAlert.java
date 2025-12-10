package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import TestCase.BaseClass;

public class SimpleAlert extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

} 
