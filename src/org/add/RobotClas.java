package org.add;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClas {

	
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
//		Robot:C
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_SHIFT);
		
//		Actions:Mouse ,  keyboard
		Actions a = new Actions(driver);
		WebElement gm = driver.findElement(By.xpath("//a[text()='Gmail']"));
		a.contextClick(gm).perform();
		
		for (int i = 0; i <3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
//		a.keyDown("Ram").perform();
//		a.keyUp("Ram").perform();
//		Keys:Enum
//		a.doubleClick().perform();
//		a.sendKeys("Ram",Keys.ENTER).perform();
	}
}
