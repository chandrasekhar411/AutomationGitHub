package testcase1;

import org.testng.annotations.Test;

public class testcase1 {
  
	  @Test
		public void TC01() throws InterruptedException {
			// TODO Auto-generated method stub
			//testcase
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver(); 
			driver.get("http://google.co.in/");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("autocarindia");
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
			driver.findElement(By.name("q")).sendKeys("autocarindia");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			driver.close();
	  }
	}
