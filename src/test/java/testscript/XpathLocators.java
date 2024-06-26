package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocators extends Base
{
	public void xpathMethodAmazon()
	{
		WebElement xPathConatins=driver.findElement(By.xpath("//input[contains(@id,'unifiedLocation1ClickAddress')]"));
		WebElement xPathStarts=driver.findElement(By.xpath("//input[starts-with(@id,'unifiedLocation1ClickAddress')]"));
		WebElement xPathText=driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']"));
		WebElement xPathOr=driver.findElement(By.xpath("//span[text()='Update location' or @id='glow-ingress-line2']"));
		WebElement xPathAnd=driver.findElement(By.xpath("//span[text()='Update location' and @id='glow-ingress-line2']"));
		
		WebElement xPathFollow=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@id='button-two']"));
		WebElement xPathPreceed=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']"));
		WebElement xPathToFindParent=driver.findElement(By.xpath("//button[@id='button-one']/..")); //Parent 
		WebElement xPathChild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		WebElement xPathParent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']"));
	}
	public void xPathMethodObsqura()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//containers
		WebElement xPathConatins1=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement xPathConatins2=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		WebElement xPathConatins3=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		//starts-with
		WebElement xPathStarts1=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement xPathStarts2=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		WebElement xPathStarts3=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		//text
		WebElement xPathText1=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xPathText2=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement xPathText3=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		//OR
		WebElement xPathOr1=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement xPathOr2=driver.findElement(By.xpath("//button[text()='Get Total' or @id='button-two']"));
		//WebElement xPathOr3=driver.findElement(By.xpath("//div[text()=' Your Message :' or @id='message-one']"));
		//And
		WebElement xPathAnd1=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement xPathAnd2=driver.findElement(By.xpath("//button[text()='Get Total' and @id='button-two']"));
		//WebElement xPathAnd3=driver.findElement(By.xpath("//div[text()=' Your Message :' and @id='message-one']"));
		
		WebElement xPathFollow=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@id='button-two']"));
		WebElement xPathPreceed=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']"));
		//WebElement xPathToFindParent=driver.findElement(By.xpath("//button[@id='button-one']/.."));
		WebElement xPathChild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		WebElement xPathParent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']"));
		
		//following
		WebElement xPathFollow1=driver.findElement(By.xpath("//input[@id='value-b']//following::button[@id='button-two']"));
		WebElement xPathFollow2=driver.findElement(By.xpath("//input[@id='value-a']//following::button[@id='button-two']"));
		
		//preceeding
		WebElement xPathPreced1=driver.findElement(By.xpath("//input[@id='value-b']//preceding::button[@id='button-one']"));
		WebElement xPathPreced2=driver.findElement(By.xpath("//input[@id='value-a']//preceding::button[@id='button-one']"));
		WebElement xPathShowMessage=driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-md navbar-dark']//preceding::button[@type='button']"));
		
		//child
		WebElement xPathChild1=driver.findElement(By.xpath("//form[@method='POST']//child::div[@id='message-one']"));
		WebElement xPathChild2=driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-b']"));
		WebElement xPathChild3=driver.findElement(By.xpath("//form[@method='POST']//child::input[@id='value-b']"));
		
		//parent
		WebElement xPathParent1=driver.findElement(By.xpath("//button[@id='button-two']//parent::form[@method='POST']"));
		WebElement xPathParent2=driver.findElement(By.xpath("//input[@id='value-b']//parent::div[@class='form-group']"));
		
		//Ancestor
		WebElement xPathAncestor1=driver.findElement(By.xpath("//div[@class='card']//ancestor::button[@id='button-one']"));
		
		//Descendant
		WebElement xPathDescendant1=driver.findElement(By.xpath("//div[@class='form-group']//descendant::label[@for='inputEmail4']"));
		
		
		//Followingsibling
		WebElement xPathFollowingSibling1=driver.findElement(By.xpath("//label[text()='Enter value A']//following-sibling::input[@class='form-control']"));
		WebElement xPathFollowingSiblingValueBTextField=driver.findElement(By.xpath("//label[text()='Enter value B']//following-sibling::input[@id='value-b']"));
		WebElement xPathFollowingSiblingValueATextField=driver.findElement(By.xpath("//label[text()='Enter value A']//following-sibling::input[@id='value-a']"));
		
		
		//PrecedingSibling
		WebElement xPathPrecedingSibling1=driver.findElement(By.xpath("//input[@type='text']//preceding-sibling::label[@for='inputEmail4']"));
		WebElement xPathPrecedingSiblingGetTotal=driver.findElement(By.xpath("//div[@id='message-two']//preceding-sibling::button[@id='button-two']"));
		WebElement xPathPreceedingSiblingValueALabel=driver.findElement(By.xpath("//input[@id='value-a']//preceding-sibling::label[text()='Enter value A']"));
		
		
	}

	public static void main(String[] args)
	{
		XpathLocators xpathlocators= new XpathLocators();
		xpathlocators.initializeBrowser();
		xpathlocators.xPathMethodObsqura();
		//xpathlocators.xpathMethodAmazon();
		xpathlocators.driverQuit();
	}
}
		