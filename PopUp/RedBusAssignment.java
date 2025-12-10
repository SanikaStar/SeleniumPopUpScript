//package PopUp;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class RedBusAssignment {
//	public static void main(String[] args) throws InterruptedException {
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.redbus.in/");
//		Thread.sleep(2000);
//		WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
//		Thread.sleep(2000);
//		from.sendKeys("Pune");
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ENTER);
//		WebElement to = driver.findElement(By.xpath("//div[text()='To']"));
//		Thread.sleep(2000);
//		to.sendKeys("kolhapur");
//		Thread.sleep(2000);
//		to.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//div[text()='Date of Journey']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[aria-label=\'Monday, November 10, 2025, selected\']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[aria-label=\'Search buses\']")).click();
//	}
//
//}
package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.co/en");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Onward Date']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw")).click();
        
    }
}
