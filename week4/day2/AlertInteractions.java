package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Testing");
		promptAlert.dismiss();
		String typedText = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(typedText);
		driver.close();
	}

}
