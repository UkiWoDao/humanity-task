package pageData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static String URL = "https://www.humanity.com/";
	public static String NAVLOGIN = ".nav-trial > a:nth-child(3)";
	
	public static WebElement getLoginLink(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(NAVLOGIN));
		return e;
	}
	
	public static void clickLoginLink(WebDriver d) {
		getLoginLink(d).click();
	}
}
