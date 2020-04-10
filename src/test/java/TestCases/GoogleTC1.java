package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GoogleTC1 {
  @Test
  	public void TC01() throws InterruptedException {
		// TODO Auto-generated method stub
	    ExtentReports reports = new ExtentReports("Path of directory to store the resultant HTML file", true);

		ExtentTest test = reports.startTest("TestName");
		
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Samsung");
		
		test.log(LogStatus.PASS, "Navigated to the specified URL: Samsung");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();
		
		
		
  }
  
  @Test
	public void TC02() throws InterruptedException {
		// TODO Auto-generated method stub 
	    ExtentReports reports = new ExtentReports("Path of directory to store the resultant HTML file", true);

		ExtentTest test = reports.startTest("TestName");
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("OLAIndia");
		test.log(LogStatus.PASS, "Navigated to the specified URL: OLAIndia");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();

		
}
  
  @Test
	public void TC03() throws InterruptedException {
		// TODO Auto-generated method stub
	    ExtentReports reports = new ExtentReports("Path of directory to store the resultant HTML file", true);

		ExtentTest test = reports.startTest("TestName");
		//testcase
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Facebook");
		test.log(LogStatus.PASS, "Navigated to the specified URL: Facebook");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();

		
}
  
  
  
}
