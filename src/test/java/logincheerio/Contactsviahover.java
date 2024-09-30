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

public class Contactsviahover {

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
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 Actions act =new Actions(driver);
		 WebElement wb = driver.findElement(By.xpath("//div[@class='logo-container']"));
		 act.moveToElement(wb).build().perform();
	     Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//div[@class='d-flex']//p[text()='Contacts']")).click();
         driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//div[@class='d-flex']//p[text()='Contacts']/../../../..//div[@class='submenu_container']//p[text()='All Contacts']")).click();
         driver.findElement(By.xpath("//div//button[@id='dropdown-basic']")).click();
		 driver.findElement(By.xpath("//div//*[contains(text(),'Add a contact')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("standard-basic")).sendKeys("Auto2");
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Priya");
		 driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8197067535");
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("annupriya@cheerio.in");

		 driver.findElement(By.xpath("//div//span[text()='Save Contact']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='search_input']")).sendKeys("8197067535");
		 driver.close();
		 
		//div[contains(@class,'w-100 options_container')]//*[contains(text(),'All Contacts')]
		//WebElement wb1=driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//*[contains(text(),'Contacts')]"));
//			System.out.println("passed");
			// WebElement wb1=driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//div[@class='d-flex']//p[text()='Contacts']"));
			// act.moveToElement(wb).build().perform();
		// driver.findElement(By.xpath("//button[text()='Add Contacts']")).click();
	}

}
