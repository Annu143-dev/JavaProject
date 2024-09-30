package logincheerio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CampaignviaUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
      // Open url
		
		driver.get("https://app.cheerio.in/login");
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//Login to cheerio page	
		driver.findElement(By.id("FacebookId")).sendKeys("9779003936");
		driver.findElement(By.id("UserPassword")).sendKeys("679l4Rqwm7xK!");
		
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		  Actions act =new Actions(driver);
		 WebElement wb = driver.findElement(By.xpath("//div[@class='logo-container']"));
		 act.moveToElement(wb).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//div[@class='d-flex']//p[text()='Campaigns']")).click();
		 
		 driver.findElement(By.xpath("//div//*[contains(text(),'New Campaign')]")).click();
		 driver.findElement(By.xpath("//input[@class='w-100 btncustom form-control']")).sendKeys("8179991359");
		 driver.findElement(By.xpath("//div[@class='d-flex justify-content']//div")).click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.id("standard-basic")).sendKeys("Cheerio24");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("//div[@class='CheerioBtn']//span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("standard-basic")).sendKeys("Cheerio");
	
		 // Wait for the file upload dialog to appear 
		 
		 Robot robot = new Robot(); 
		 robot.delay(2000);
		 StringSelection fileSelection = new StringSelection("C:\\Users\\91700\\OneDrive\\Desktop\\Book3.csv"); 
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null); 
		 
		 robot.keyPress(KeyEvent.VK_CONTROL); 
		 robot.keyPress(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		 Thread.sleep(1000); // Wait for file to be selected 
		 robot.keyPress(KeyEvent.VK_ENTER); 
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='p-0 m-0']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='﻿Name']/../..//input[@id='combo-box-demo']")).sendKeys("Name");
		driver.findElement(By.xpath("//div[@role='presentation']//*[text()='Name']")).click();
		 
		driver.findElement(By.xpath("//*[text()='Email']/../..//input[@id='combo-box-demo']")).sendKeys("Email");
		driver.findElement(By.xpath("//div[@role='presentation']//*[text()='Email']")).click();
		
		driver.findElement(By.xpath("//*[text()='Country Code']/../..//input[@id='combo-box-demo']")).sendKeys("Country Code");
		driver.findElement(By.xpath("//div[@role='presentation']//*[text()='Country Code']")).click();
		
		driver.findElement(By.xpath("//*[text()='Phone']/../..//input[@id='combo-box-demo']")).sendKeys("Phone");
		driver.findElement(By.xpath("//div[@role='presentation']//*[text()='Phone']")).click();
		 
		//Click on Next button
		 driver.findElement(By.xpath("//span[@class='p-0 m-0']")).click();
		 
	//	Click on Done Button
		 driver.findElement(By.xpath("//span[@class='p-0 m-0']")).click();
		 
		 Thread.sleep(2000);
	}

}
