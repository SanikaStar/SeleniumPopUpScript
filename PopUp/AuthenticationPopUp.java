package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Experience")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//section[text()='Popups']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("AuthLink")).click();
//		Thread.sleep(2000);
//		
//		Robot robot = new Robot();
//        robot.delay(1000);
//
//        robot.keyPress(KeyEvent.VK_A);
//        robot.keyRelease(KeyEvent.VK_A);
//        robot.keyPress(KeyEvent.VK_D);
//        robot.keyRelease(KeyEvent.VK_D);
//        robot.keyPress(KeyEvent.VK_M);
//        robot.keyRelease(KeyEvent.VK_M);
//        robot.keyPress(KeyEvent.VK_I);
//        robot.keyRelease(KeyEvent.VK_I);
//        robot.keyPress(KeyEvent.VK_N);
//        robot.keyRelease(KeyEvent.VK_N);
//
//        
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//
//       
//        robot.keyPress(KeyEvent.VK_A);
//        robot.keyRelease(KeyEvent.VK_A);
//        robot.keyPress(KeyEvent.VK_D);
//        robot.keyRelease(KeyEvent.VK_D);
//        robot.keyPress(KeyEvent.VK_M);
//        robot.keyRelease(KeyEvent.VK_M);
//        robot.keyPress(KeyEvent.VK_I);
//        robot.keyRelease(KeyEvent.VK_I);
//        robot.keyPress(KeyEvent.VK_N);
//        robot.keyRelease(KeyEvent.VK_N);
//
//     
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        
//        
        
        //another way of sending username and password
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
        
        
		
		
	}

}
