package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver; //WebDriver is an interface
	
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	public void driverQuit()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		
Base base=new Base();
base.initializeBrowser();
//base.driverQuit();
	}

}
