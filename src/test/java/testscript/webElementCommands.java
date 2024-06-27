package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElementCommands extends Base 
{
	public void verifySingleInputField() 
	{
		String inputToTextField="Apple";
		WebElement enterMessageTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageTextField.sendKeys(inputToTextField);//Enter value to Text Field
		
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		
		WebElement yourMessageValue=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessageValue.getText();//Get Textfield value from Website
		
		String actualTextValue=yourMessageText.substring(15);
		if(actualTextValue.equals(inputToTextField))
		{
			System.out.println("Input and Output are SAME");
		}
		else
		{
			System.out.println("Input and Output are DIFFERENT");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		webElementCommands webelementcommands=new webElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.verifySingleInputField();
		//webelementcommands.driverQuit();
	}

}
