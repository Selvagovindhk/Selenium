package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("iframeResult");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	    String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(text);
	    driver.close();
	    
	    		
	    
	}

}
