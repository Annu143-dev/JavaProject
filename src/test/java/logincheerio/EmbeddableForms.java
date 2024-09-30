package logincheerio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmbeddableForms {

	public static void main(String[] args) throws InterruptedException {
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
	     Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[contains(@class,'menu-item')]//div[@class='d-flex']//p[text()='Embeddable Forms']")).click();
       //Create button
		driver.findElement(By.xpath("//div[@class='CheerioBtn']")).click();
		Thread.sleep(2000);

		  
		driver.close();
		  
		  
		  
		  
		  
		  
		  
		//h4[contains(text(),'Form properties')]/..//p[contains(text(),'Font')]	  
		  
		  
	}

}
