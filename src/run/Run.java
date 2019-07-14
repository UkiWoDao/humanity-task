package run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageData.AppPage;
import pageData.HomePage;
import pageData.LoginPage;

public class Run {
	
	public static void LogIn(WebDriver d, String user, String pass) {
		
		// go to web page
		d.get(HomePage.URL);
			
		// maximize window
		d.manage().window().maximize();
		
		// click login
		HomePage.clickLoginLink(d);
		
		// click username input field
		LoginPage.clickUsername(d);
		
		// input username
		LoginPage.inputUsername(d, user);
		
		// click password input field
		LoginPage.clickPassword(d);
		
		// input password
		LoginPage.inputPassword(d, pass);
		
		// submit data
		LoginPage.clickLogIn(d);
	}
	
	public static void addEmployee(WebDriver d, String name, String lastName, String email) {
		
		// create 4s wait instance
		WebDriverWait wait = new WebDriverWait(d, 4);
		
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// click staff menu item
		AppPage.clickMenuStaff(d);
				
		// click add employee button alternative
		d.navigate().to(AppPage.URL);
		
		// wait for page to load
		wait.until(ExpectedConditions.urlToBe(AppPage.URL));
		
//		// click add employee button
//		AppPage.clickAddEmployee(d);
		
		// click first name input field
		AppPage.clickEmplFName(d);
		
		// input first name
		AppPage.inputEmplFName(d, name);
			
		// click last name input field
		AppPage.clickEmplLName(d);
				
		// input last name
		AppPage.inputEmplLName(d, lastName);
		
		// click email input field
		AppPage.clickEmplEmail(d);
		
		// input email
		AppPage.inputEmplEmail(d, email);
				
		// click save employees
		AppPage.clickSaveEmployees(d);
		
	}
	
	public static void toggleClock(WebDriver d) {
		
		// create 4s wait instance
		WebDriverWait wait = new WebDriverWait(d, 3);
		
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// wait for page to load
		wait.until(ExpectedConditions.urlToBe(AppPage.STARTURL));
		
		// go to clock module
		d.navigate().to(AppPage.CLOCKURL);
		
		// wait for page to load
		wait.until(ExpectedConditions.urlToBe(AppPage.CLOCKURL));
		
//		// click clock menu item
//		AppPage.clickMenuClock(d);

		AppPage.clickClockIn(d);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AppPage.CLOCK_OUT)));
		
		// click "Clock out"
		AppPage.clickClockOut(d);
	}
}
