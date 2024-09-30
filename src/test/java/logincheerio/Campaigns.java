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

public class Campaigns {

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
		 driver.findElement(By.xpath("//input[@class='w-100 btncustom form-control']")).sendKeys("8179991356");
		 driver.findElement(By.xpath("//div//input[@id='combo-box-demo']")).sendKeys("Auto1");
		// driver.findElement(By.xpath("//div//h4[contains(text(),'Filter using attributes')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div//span[contains(text(),'Next')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//p[contains(text(),'Share an Offer')]/../../..//span[text()='Use Template']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()='Seller name']/../input")).sendKeys("Annu");
		 driver.findElement(By.xpath("//label[text()='Product name']/../input")).sendKeys("Cheerio");
		 driver.findElement(By.xpath("//label[text()='Offer name']/../input")).sendKeys("Tanishak");
		 driver.findElement(By.xpath("//label[text()='Offer name']/../input")).sendKeys("Diwali");
		 driver.findElement(By.xpath("//label[text()='Discount (in %)']/../input")).sendKeys("10");
		 driver.findElement(By.xpath("//label[text()='No. of days offer available']/../input")).sendKeys("8");
		 driver.findElement(By.xpath("//label[text()='Offer link']/../input")).sendKeys("https://www.google.com/");
		
		 // Code for scroll down
		 
		 
		 //code for to click the browse file
		 driver.findElement(By.xpath("//label[contains(text(),'Upload image')]/../../..//text[text()='Browse files']")).click();
		 // code for upload the first image
		 Robot robot = new Robot(); 
		 robot.delay(8000);
		 StringSelection fileSelection = new StringSelection("C:\\Users\\91700\\OneDrive\\Desktop\\images.jpeg"); 
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null); 
		 robot.keyPress(KeyEvent.VK_CONTROL); 
		 robot.keyPress(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		 Thread.sleep(1000); // Wait for file to be selected 
		 robot.keyPress(KeyEvent.VK_ENTER); 
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(3000);
		 
		//code for to click the browse file
		 driver.findElement(By.xpath("//label[contains(text(),'Upload logo image')]/../../..//p[text()='Browse files']")).click();
		 
		// code for upload the second image
				 Robot robot1 = new Robot(); 
				 robot1.delay(8000);
				 StringSelection fileSelection1 = new StringSelection("C:\\Users\\91700\\OneDrive\\Desktop\\image.jpeg"); 
				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection1, null); 
				 robot.keyPress(KeyEvent.VK_CONTROL); 
				 robot.keyPress(KeyEvent.VK_V); 
				 robot.keyRelease(KeyEvent.VK_V); 
				 robot.keyRelease(KeyEvent.VK_CONTROL); 
				 Thread.sleep(1000); // Wait for file to be selected 
				 robot.keyPress(KeyEvent.VK_ENTER); 
				 robot.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[@id='GeneratePreviewButton']")).click();
		 Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[@class='d-flex flex-row justify-content-between align-items-center w-100']/..//h2[contains(text(),'Email preview')]")).click();
		// driver.findElement(By.xpath("//div[@class='d-flex flex-row justify-content-between align-items-center w-100']/..//h2[contains(text(),'WhatsApp preview')]")).click();
		// driver.findElement(By.xpath("//div[@class='d-flex flex-row justify-content-between align-items-center w-100']/..//h2[contains(text(),'SMS preview')]")).click();
		
		 driver.findElement(By.xpath("//div[@id='ShareCampaignButton']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id='RunCampaignButton']")).click();
		 driver.findElement(By.xpath("//div[@class='CheerioBtn']//span[contains(text(),'Go to Analytics')]")).click();
		
		 
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
