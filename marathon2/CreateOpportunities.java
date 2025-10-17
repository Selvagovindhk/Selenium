package marathon2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateOpportunities extends BaseClass{
	@Test

	public void createopportunities() throws InterruptedException {
		
		//CreateOpportunity
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.linkText("Create Opportunity")).click();
		driver.findElement(By.xpath("//input[@id='createOpportunityForm_opportunityName']")).sendKeys("SelvaTest");
		driver.findElement(By.xpath("//span[text()='Initial Account']//following::img[1]")).click();
		Set<String> newWindow = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(newWindow);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(windows.get(0));
//		driver.findElement(By.xpath("//span[text()='Initial Lead']//following::img[1]")).click();
//		Set<String> newWindow1 = driver.getWindowHandles();
//		List<String> windows1 = new ArrayList<String>(newWindow1);
//		driver.switchTo().window(windows1.get(1));
//		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
//		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@id='createOpportunityForm_estimatedCloseDate']")).sendKeys("10/17/25");
		driver.findElement(By.xpath("//input[@value='Create Opportunity']")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewOpportunity_opportunityName_sp']")).getText();
		System.out.println("Opportunity Name is " +text);
		
	}

}
