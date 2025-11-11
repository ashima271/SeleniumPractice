package Mavenone.Mavenone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heroku {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href = '/abtest']")).click();
		driver.findElement(By.xpath("//a[@href = 'http://elementalselenium.com/']")).click();
		
		String actulurl = "https://elementalselenium.com/";
		String Expectdurl = driver.getCurrentUrl();
		
		if(actulurl.equals(Expectdurl)) {
			System.out.println("URL good");
		}
		else {
			System.out.println("Expected: " + actulurl);
            System.out.println("Actual: " + Expectdurl);
        }

        driver.quit();
	}

}
