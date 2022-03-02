package selenium.webdriver.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*[@id="email"]
		
		// Adding an xpath comment
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	
		
		
		driver.findElement(By.xpath("//*[@id='email']"));
		
//		driver.close();
		
		//*[@id="email"]
		
	}

}
