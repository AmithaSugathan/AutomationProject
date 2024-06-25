package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void InitializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	public void driverQuit()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		
Base base=new Base();
base.InitializeBrowser();
base.driverQuit();
	}

}
