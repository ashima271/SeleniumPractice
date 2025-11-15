package Mavenone.Mavenone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {
	
	public static void main(String args[]) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://letcode.in/alert");
	
	driver.findElement(By.id("accept")).click();
	
	Alert alert = driver.switchTo().alert();

	// Print alert text
	System.out.println(alert.getText());

	// Accept the alert (click OK)
	alert.accept();
	
	
	
	
	
	
}
}