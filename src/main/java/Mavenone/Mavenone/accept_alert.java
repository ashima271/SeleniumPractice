package Mavenone.Mavenone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class accept_alert {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("confirm")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.
		
		
		
		
	}

}
