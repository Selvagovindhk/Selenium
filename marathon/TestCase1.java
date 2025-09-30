package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException   {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[7]")).click();
		driver.findElement(By.xpath("(//span[@class='mx-2'])[10]")).click();
		driver.findElement(By.xpath("(//span[@data-pc-section='label'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|I:6']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String Seatinfo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat info : " + Seatinfo);
		Thread.sleep(5000);
		String GrandTotal = driver.findElement(By.xpath("//div[@class='all-grand']/div/h6/span")).getText();
		System.out.println("Grand Total : " + GrandTotal);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String title = driver.getTitle();	
		System.out.println("Current Page title is : " +title );
		driver.close();
	}

}
