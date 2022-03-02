package selenium.webdriver.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasics {

	public static void main(String[] args) {
		
		System.out.println(" Adding a new line to test git");
		System.out.println(" this is the new output");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("email")).sendKeys("rosy.laly@gmail.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("rosy.laly");
		driver.findElement(By.id("passwd")).sendKeys("1234");
		String exp_title="Login - My Store";
		String act_title=driver.getTitle();
		if (exp_title.equals(act_title)) {
			System.out.println("Test Pass");
		}
		else
			System.out.println("Tetst failed");
		
//		driver.close();

	}

}
