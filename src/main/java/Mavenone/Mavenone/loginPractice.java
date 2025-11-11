package Mavenone.Mavenone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPractice {

		// TODO Auto-generated constructor stub
		
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.id("username")).sendKeys("studentA");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.id("submit")).click();
			
			//String expectedMsg  = "Congratulations student. You successfully logged in!";
			//String Actualmsg = driver.findElement(By.xpath("//p[@class = 'has-text-align-center']")).getText();
			
			// set invalid user name
			String expectedMsg = "Your password is invalid!";
			String Actualmsg = driver.findElement(By.xpath("//div[@id='error']")).getText();
			
			
			if(Actualmsg.equals(expectedMsg)) {
				System.out.println("Login successfull");
			}
				
				else {
					System.out.println("Invalid login creds");
			}
			
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			driver.quit();
					
		}
	}

