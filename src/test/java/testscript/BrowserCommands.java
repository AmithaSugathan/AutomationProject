package testscript;

public class BrowserCommands extends Base{

	public void browserCommands()
	{
		String title=driver.getTitle(); //To get title
		String url=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();//hover pageSource while in Debug to see everything
	}
	public void navigationCommands()
	{
			driver.navigate().to("https://www.amazon.com/"); //Navigate from Google to Amazon
			driver.navigate().back(); //Navigate from Amazon to Google
			driver.navigate().forward(); //From Google again back to Amazon
		
	}
	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		browsercommands.driverQuit();

	}

}
