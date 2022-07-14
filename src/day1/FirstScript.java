package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawna\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
			
		driver.get("http://www.selenium.dev/");
		//driver.
		
		
		//System.out.println("Hello World");
	}
	
}
	