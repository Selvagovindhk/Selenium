package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentEditLead {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Selva");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Govindh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SK");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Edit lead Assignment");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@gmail.com");
		WebElement statedropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sd = new Select(statedropdown);
		sd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("New values updated");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the Resulting Page is : " +title);
		driver.close();
	}

}
