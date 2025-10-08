package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[contains(text(), 'OK')]")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> airWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(airWindows.get(0));
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
