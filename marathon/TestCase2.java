package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Results = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		String Searchname = driver.findElement(By.xpath("(//span[contains(text(),'Bags')])[1]")).getText();
		System.out.println("The total number of results : " + Results + " " + Searchname);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String Bagname = driver.findElement(By.xpath("(//a[@target='_blank']/h2/span)[1]")).getText();
		System.out.println("Bag name : " + Bagname);
		String Discountedprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Discounted price : " + Discountedprice);
		String title = driver.getTitle();
		System.out.println("Title of the Page : " + title);
		driver.close();

	}

}
