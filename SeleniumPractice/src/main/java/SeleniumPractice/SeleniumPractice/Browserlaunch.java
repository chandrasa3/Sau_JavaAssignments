package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserlaunch 
{
	public void handlebrowser() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.cssSelector("button[data-testid=cookie-policy-manage-dialog-accept-button]"));
		button.click();
		WebElement button2=driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
		button2.click();
		Thread.sleep(5000);
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("saujanya");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("mulugu");
		Thread.sleep(5000);
		WebElement emailaddress=driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"));
		emailaddress.sendKeys("mulugu3@gmail.com");
		WebElement reenteremailaddress=driver.findElement(By.name("reg_email_confirmation__"));
		reenteremailaddress.sendKeys("mulugu3@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
		password.sendKeys("mulugu@123");
		WebElement drop1=driver.findElement(By.id("day"));
		Select s=new Select(drop1);
		s.selectByIndex(7);
		WebElement drop2=driver.findElement(By.id("month"));
		Select s1=new Select(drop2);
		s1.selectByVisibleText("Aug");
		WebElement drop3=driver.findElement(By.id("year"));
		Select s2=new Select(drop3);
		s2.selectByValue("1981");
		WebElement radio=driver.findElement(By.name("sex"));
		radio.click();
		Thread.sleep(5000);
		WebElement button3=driver.findElement(By.cssSelector("button[name='websubmit']"));
		button3.click();
		Thread.sleep(5000);	
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		Browserlaunch b=new Browserlaunch();
		b.handlebrowser();
	} 
	}
