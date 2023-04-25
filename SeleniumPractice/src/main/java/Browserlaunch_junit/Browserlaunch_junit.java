package Browserlaunch_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//import Browserlaunch_XPath.Browserlaunch_XPath;

public class Browserlaunch_junit

 {
	ChromeDriver driver;
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("--disable-notifications");
	
	@Before
	public void launch() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
	Thread.sleep(5000);
	
	WebElement button=driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));
	button.click();
	Thread.sleep(5000);
	}
	
	@Test
	public void signup() throws InterruptedException
	{
	WebElement button2=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	button2.click();
	Thread.sleep(5000);
	WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	Firstname.sendKeys("saujanya");
	Thread.sleep(5000);
	WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	surname.sendKeys("mulugu");
	Thread.sleep(5000);
	WebElement emailaddress=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	emailaddress.sendKeys("mulugu3@gmail.com");
	Thread.sleep(5000);
	WebElement reenteremailaddress=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
	reenteremailaddress.sendKeys("mulugu3@gmail.com");
	Thread.sleep(5000);
	WebElement password=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	password.sendKeys("mulugu@123");
	WebElement drop1=driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(drop1);
	s.selectByIndex(7);
	WebElement drop2=driver.findElement(By.xpath("//select[@id='month']"));
	Select s1=new Select(drop2);
	s1.selectByVisibleText("Aug");
	WebElement drop3=driver.findElement(By.xpath("//select[@id='year']"));
	Select s2=new Select(drop3);
	s2.selectByValue("1981");
	WebElement radio=driver.findElement(By.xpath("//input[@name='sex']"));
	radio.click();
	Thread.sleep(5000);
	WebElement button3=driver.findElement(By.xpath("//button[@name='websubmit']"));
	button3.click();
	Thread.sleep(5000);		
	}
	
 @After
 public void Close() throws InterruptedException
 {
	driver.close();
	 
 }
}



	
	
