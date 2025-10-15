package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssignment {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Conditions of Use & Sale"));
		act.scrollToElement(element).perform();
		String text = driver.findElement(By.linkText("Conditions of Use & Sale")).getText();
		System.out.println("The text is "+text);
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/Amazon.jpeg");
		FileUtils.copyFile(sourceFile, destination);
		driver.close();

	}

}
