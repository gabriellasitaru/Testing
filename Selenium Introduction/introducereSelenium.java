package introducere;

import org.openqa.selenium.chrome.ChromeDriver;

public class introducereSelenium {

	public static void main(String[] args) {
		//Invoking Browser
		//chrome.driver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabri\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.codecademy.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
