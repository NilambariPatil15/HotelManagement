package hotel.management.system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
	WebDriver chromeDriver = null;
	String URL = "https://www.google.com";
    public void main(String arg[]) {
    	SeleniumClass se = new SeleniumClass();
    	se.openBrowser();
    	se.getPage();
    }
	private void getPage() {
		
		
	}
	private void openBrowser() {
		
		chromeDriver = new ChromeDriver();
		
	}
}
