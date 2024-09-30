package logincheerio;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		
         //System.out.println("test");
		// Launch browse (chrome)
		//	ChromeDriver driver= new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
	//Maximizes the browser window
		driver.manage().window().maximize();
	
      // Open url
		driver.get("https://app.cheerio.in/login");
		Thread.sleep(2000);
		
	//	Validate the title of the page "Cheerio Web"
		String page_title =driver.getTitle();
		if(page_title.equals("Cheerio Web"))
		{
		System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	//Login to cheerio page	
		driver.findElement(By.id("FacebookId")).sendKeys("9779003936");
		driver.findElement(By.id("UserPassword")).sendKeys("679l4Rqwm7xK!");
		driver.findElement(By.className("btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//	Close Browser
		driver.close();
		
		
		
	}

}
