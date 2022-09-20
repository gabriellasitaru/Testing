package introducere;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
			//Invoking Browser
			//chrome.driver.exe -> Chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabri\\Downloads\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			driver.get("https://myelectrica.ro/index.php?pagina=login");
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.name("myelectrica_utilizator")).sendKeys("mail@yahoo.com");
			driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("Blabla10%");
			driver.findElement(By.id("myelectrica_login_btn")).click();
			
			driver.close();
		}
}


