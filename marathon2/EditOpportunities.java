package marathon2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditOpportunities extends BaseClass{
	@Test(dependsOnMethods = "marathon2.CreateOpportunities.createopportunities")

	public void editopportunities() throws InterruptedException {
		
		//Edit Opportunity
				driver.findElement(By.linkText("Opportunities")).click();
				driver.findElement(By.linkText("Find Opportunities")).click();
				driver.findElement(By.xpath("(//input[@name='opportunityName'])[2]")).sendKeys("SelvaTest");
				driver.findElement(By.xpath("//button[text()='Find Opportunities']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.xpath("//textarea[@name='changeNote']")).sendKeys("Updated");
				driver.findElement(By.xpath("//input[@value='Update']")).click();

	}

}
