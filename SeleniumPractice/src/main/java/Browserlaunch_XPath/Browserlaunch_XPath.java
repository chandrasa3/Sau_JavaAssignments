package Browserlaunch_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumPractice.SeleniumPractice.Browserlaunch;

public class Browserlaunch_XPath
{
	public void handlebrowser_XPath() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));
		button.click();
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
		emailaddress.sendKeys("akkipapa10411@gmail.com");
		Thread.sleep(5000);
		WebElement reenteremailaddress=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		reenteremailaddress.sendKeys("akkipapa10411@gmail.com");
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
	public static void main(String[] args) throws InterruptedException
	{
		Browserlaunch_XPath b=new Browserlaunch_XPath();
		b.handlebrowser_XPath();
	} 
	
	}

