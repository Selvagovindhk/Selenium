package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("DEF");
		WebElement day = driver.findElement(By.id("day"));
		Select options = new Select(day);
		options.selectByIndex(18);
		WebElement month = driver.findElement(By.id("month"));
		Select monthOptions = new Select(month);
		monthOptions.selectByContainsVisibleText("Jun");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yearOptions = new Select(year);
		yearOptions.selectByValue("1990");
		driver.findElement(By.xpath("//input[@value=2]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(30000);
		driver.close();

	}

}
