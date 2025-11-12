package Mavenone.Mavenone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		//vertical scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
		driver.findElement(By.xpath("//*[text()='Radio Button']")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		

	}
	
	
}
