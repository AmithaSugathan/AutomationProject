package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.com");
	}
	
	public void locatorMechanismObsqura()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement clearFix=driver.findElement(By.className("clearfix"));
		WebElement linkText=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkText=driver.findElement(By.partialLinkText("Checkbox"));//Partial LinkText for Dynamic *Text*
		WebElement name=driver.findElement(By.name("viewport"));
		WebElement tagName=driver.findElement(By.tagName("title"));//title bcz we are locating tagname. here title is the tagname
		WebElement cssSelector1=driver.findElement(By.cssSelector("button#button-one"));//Tagname#ID
		WebElement cssSelector2=driver.findElement(By.cssSelector("button.clearfix"));//Tagname.ClassName
		WebElement cssSelector3=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
		WebElement xPath1=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		
	}
	
	public void locatorMechanismAmazon()
	{
		//FindElement by ID
		WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement updatelocation=driver.findElement(By.id("glow-ingress-line1"));
		WebElement accountList=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement cart=driver.findElement(By.id("nav-tools"));
		WebElement searchSubmit=driver.findElement(By.id("nav-search-submit-button"));
		
		//FindElement by CLASS
		WebElement nextPagination=driver.findElement(By.className("s-pagination-item s-pagination-next s-pagination-button s-pagination-separator"));
		WebElement previousRounded=driver.findElement(By.className("a-icon a-icon-previous-rounded"));
		WebElement homeAppliances=driver.findElement(By.className("a-icon a-icon-next-rounded"));
		WebElement hamburgMenu=driver.findElement(By.className("hm-icon nav-sprite"));
		WebElement titleText=driver.findElement(By.className("titleText--22WAy"));
		
		//FindElement by LinkText:From Laks (Don't know Unique)
		WebElement linkText1= driver.findElement(By.linkText("Fashion"));
		WebElement linkText2= driver.findElement(By.linkText("Mobiles"));
		WebElement linkText3= driver.findElement(By.linkText("Today's Deals"));
		WebElement linkText4= driver.findElement(By.linkText("New Releases"));
		WebElement linkText5= driver.findElement(By.linkText("Home & Kitchen"));

		//FindElement by partial Link Text:From Laks (Don't know Unique)
		WebElement partialLink1=driver.findElement(By.partialLinkText("Best Sellers in Home & Kitchen"));//Unique
		WebElement partialLinkText1= driver.findElement(By.partialLinkText("Add"));
		WebElement partialLinkText2= driver.findElement(By.partialLinkText("Add Gift"));
		WebElement partialLinkText3= driver.findElement(By.partialLinkText("Account"));
		WebElement partialLinkText4= driver.findElement(By.partialLinkText("Echo"));
				
		//FindElement by Name:From Laks (Don't know Unique)
		WebElement name= driver.findElement(By.name("crid"));
		WebElement name1= driver.findElement(By.name("description"));
		WebElement name2= driver.findElement(By.name("encrypted-slate-token"));
		
		//FindElement by Tagname:From Laks (Don't know Unique)
		WebElement tagName= driver.findElement(By.tagName("input"));
		WebElement tagName1= driver.findElement(By.tagName("div"));
		WebElement tagName2= driver.findElement(By.tagName("header"));
		WebElement tagName3= driver.findElement(By.tagName("span"));
		WebElement tagName4= driver.findElement(By.tagName("p"));
		
		//FindElement by cssSelector Tagname&ID
		WebElement cssSelector1=driver.findElement(By.cssSelector("input#id"));//Tagname#id "input" is the tagname of HTML tag "id" is ID in the tag
		WebElement cssSelector11= driver.findElement(By.cssSelector(" input#twotabsearchtextbox")); 
		WebElement cssSelector12= driver.findElement(By.cssSelector(" input#isscrid")); 
		WebElement cssSelector13= driver.findElement(By.cssSelector(" input#issprefix"));
		
		//FindElement by cssSelector Tagname&IClassName
		WebElement cssSelector2= driver.findElement(By.cssSelector(" input.nav-progressive-attribute"));//Tagname.ClassName		
		WebElement cssSelector21= driver.findElement(By.cssSelector(" input.nav-input nav-progressive-attribute"));
		WebElement cssSelector22= driver.findElement(By.cssSelector(" input.nav-left"));
		WebElement cssSelector23= driver.findElement(By.cssSelector(" input.nav-logo-link nav-progressive-attribute"));

	}
	
	

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser();
		//locators.navigationCommands();
		locators.locatorMechanismObsqura();
		//locators.driverQuit();

	}

}
