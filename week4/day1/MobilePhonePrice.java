package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePhonePrice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = elements.size();
		System.out.println("The Size of the mobile price list is "+size);
		List<Integer> newValue = new ArrayList<Integer> ();
		for (int i = 0; i < size; i++) {
			String text2 = elements.get(i).getText();
			if(!text2.isEmpty()) {
				String replaceAll = text2.replaceAll("[^0-9]", "");
				int int1 = Integer.parseInt(replaceAll);
				newValue.add(int1);
			}
			//System.out.println(text2);
			
		}
		Collections.sort(newValue);
		int webElement = newValue.get(0);
		//String text = webElement.getText();
		System.out.println("Mobile price are "+webElement);
		System.out.println("New Value" +newValue);
	}

	
}
