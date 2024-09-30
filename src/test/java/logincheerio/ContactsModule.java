package logincheerio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;

public class ContactsModule {
	 WebDriverWait driver;
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// Launch browse (chrome)
		
		//	ChromeDriver driver= new ChromeDriver();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
	      // Open url
			
			driver.get("https://app.cheerio.in/login");
			
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			//Login to cheerio page	
			driver.findElement(By.id("FacebookId")).sendKeys("9779003936");
			driver.findElement(By.id("UserPassword")).sendKeys("679l4Rqwm7xK!");
			driver.findElement(By.className("btn")).click();
			Thread.sleep(2000);
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			 
			 // Actions act =new Actions(driver);
			// WebElement wb = driver.findElement(By.xpath("//div[@class='logo-container']"));
			 //act.moveToElement(wb).build().perform();
			// System.out.println("passed");
			// WebElement wb1=driver.findElement(By.xpath("//div[contains(@class,'menu-item ')]//*[contains(text(),'Contacts')]"));
			// act.moveToElement(wb).build().perform();
			 
			 //driver.findElement(By.xpath("//div[contains(@class,'w-100 options_container')]//*[contains(text(),'All Contacts')]")).click();
			 driver.findElement(By.xpath("//div//span[contains(text(),'Add contacts')]")).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 driver.findElement(By.id("standard-basic")).sendKeys("Cheerio245");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 driver.findElement(By.xpath("//div[@class='CheerioBtn']//span")).click();
			 Thread.sleep(2000);
			 
		
			 // Wait for the file upload dialog to appear 
			 
			 Robot robot = new Robot(); 
			 robot.delay(2000);
			 StringSelection fileSelection = new StringSelection("C:\\Users\\91700\\OneDrive\\Desktop\\Book3.csv"); 
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null); 
			 
			 robot.keyPress(KeyEvent.VK_CONTROL); 
			 robot.keyPress(KeyEvent.VK_V); 
			 robot.keyRelease(KeyEvent.VK_V); 
			 robot.keyRelease(KeyEvent.VK_CONTROL); 
			 Thread.sleep(4000); // Wait for file to be selected 
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
			 
			 driver.findElement(By.xpath("//input[@class='search_input']")).sendKeys("Annu");
			 
				//Close Browser
				driver.close();
				
				// String csvFileName=System.getProperty("user.dir")+"\\data\\Book2.csv";
			 //FileWriter writer=new FileWriter(csvFileName);
			 //writer.append("Name,Email,Country,Phone \n");
			 //writer.append("");
			 
			 //CSVReader reader =new CSVReader(new FileReader("data\\Book3.csv"));
			 //WebElement uploadButton = driver.findElement(By.id("uploadButton")); 
			 //uploadButton.click(); 
	}

}
