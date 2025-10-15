package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {
	
	RemoteWebDriver driver;
		
	@BeforeMethod
	@Parameters({"url", "username", "password"})
	public void preCondition(String url, String username, String password) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(40000);
		driver.findElement(By.xpath("//input[@value='Verify']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(10000);
		Actions act =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		act.scrollToElement(element).perform();
		act.click(element);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforces");
		WebElement dropDown = driver.findElement(By.xpath("//button[@part='input-button']"));
		Select dropDownValue = new Select(dropDown);
		dropDownValue.selectByIndex(1);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).click();
		String text = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println(text);

	}
	@AfterMethod
	public void postCondition() {
		
		driver.close();

	}
	@Test
	public void projectspecificmethod() {
		
		System.out.println("Login Success");

	}

}
