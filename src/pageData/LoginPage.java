package pageData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	/* login page xpaths */
	public static String USERNAME = "//*[@id=\"email\"]";
	public static String PASSWORD = "//*[@id=\"password\"]";
	public static String SUBMITBUTTON = "/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button";
	
	/* log data */
	public static String username = "UrosVucenovic";
	public static String password = "bodiam12";
	
	/* login page web elements*/
	public static WebElement getUsername(WebDriver d) {
		WebElement e = d.findElement(By.xpath(USERNAME));
		return e;
	}
	
	public static WebElement getPassword(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PASSWORD));
		return e;
	}
	
	public static WebElement getSubmit(WebDriver d) {
		WebElement e = d.findElement(By.xpath(SUBMITBUTTON));
		return e;
	}
	
	/* login page interaction */
	public static void clickUsername(WebDriver d) {
		getUsername(d).click();
	}
	
	public static void inputUsername(WebDriver d, String s) {
		getUsername(d).sendKeys(s);
	}
	
	public static void clickPassword(WebDriver d) {
		getPassword(d).click();
	}
	
	public static void inputPassword(WebDriver d, String s) {
		getPassword(d).sendKeys(s);
	}
	
	public static void clickLogIn(WebDriver d) {
		getSubmit(d).click();
	}
}
