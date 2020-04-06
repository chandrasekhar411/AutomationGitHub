package testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTC1 {
  @Test
  	public void TC01() throws InterruptedException {
		// TODO Auto-generated method stub
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Samsung");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();

		
  }
  
  @Test
	public void TC02() throws InterruptedException {
		// TODO Auto-generated method stub 
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("OLAIndia");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();

		
}
  
  @Test
	public void TC03() throws InterruptedException {
		// TODO Auto-generated method stub
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();

		
}
  
  
  
}
