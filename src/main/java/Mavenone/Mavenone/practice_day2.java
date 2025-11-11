package Mavenone.Mavenone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_day2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
		driver.findElement(By.xpath("//*[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Ragon");
		driver.findElement(By.id("userEmail")).sendKeys("ragon@yopmail.com");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("submit")).click();		
		
		
		
	}

}
