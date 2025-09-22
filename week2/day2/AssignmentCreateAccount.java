package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateAccount {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SelvaTest1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryDropdown = new Select(industry);
		industryDropdown.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdown = new Select(ownership);
		ownershipDropdown.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceDropdown = new Select(source);
		sourceDropdown.selectByValue("LEAD_EMPLOYEE");
		WebElement mc = driver.findElement(By.id("marketingCampaignId"));
		Select mcDropdown = new Select(mc);
		mcDropdown.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.id("sectionHeaderTitle_accounts"));
		Thread.sleep(10000);
		driver.close();
	}

}
