package pageData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppPage {
	// dashboard url
	public static String STARTURL = "https://urosmedia.humanity.com/app/dashboard/";
	
	// add employee url
	public static String URL = "https://urosmedia.humanity.com/app/staff/add/";
	
	// clock menu url
	public static String CLOCKURL = "https://urosmedia.humanity.com/app/timeclock/";
	
	/* page elements xpaths/selectors */
	public static String CLOCK_MENU_ITEM = "//*[@id=\"sn_timeclock\"]";
	public static String CLOCK_IN = "#tc_tl_ci";
	public static String CLOCK_OUT = "#tc_tl_co";
	public static String STAFF_MENU_ITEM = "//*[@id=\"sn_staff\"]";
	public static String ADD_EMPL_MENU_BUTTON = "#act_primary";
	public static String EMPL_FIRST_NAME = "#_asf1";
	public static String EMPL_LAST_NAME = "#_asl1";
	public static String EMPL_EMAIL = "#_ase1";
	public static String EMPL_SAVE = "//*[@id=\"_as_save_multiple\"]";
	public static String ERRORSTATUS = "//*[@id=\"_status\"]";
	
	public static String ERRORTITLE = "Staff - Add - Humanity";
	
	/* page web elements */
	public static WebElement getMenuClock(WebDriver d) {
		WebElement e = d.findElement(By.xpath(CLOCK_MENU_ITEM));
		return e;
	}
	
	public static WebElement getClockIn(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(CLOCK_IN));
		return e;
	}
	
	public static WebElement getClockOut(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(CLOCK_OUT));
		return e;
	}
	
	public static WebElement getMenuStaff(WebDriver d) {
		WebElement e = d.findElement(By.xpath(STAFF_MENU_ITEM));
		return e;
	}
	
	public static WebElement getAddEmployee(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(ADD_EMPL_MENU_BUTTON));
		return e;
	}
	
	public static WebElement getEmployeeFName(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(EMPL_FIRST_NAME));
		return e;
	}
	
	public static WebElement getEmployeeLName(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(EMPL_LAST_NAME));
		return e;
	}
	
	public static WebElement getEmployeeMail(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(EMPL_EMAIL));
		return e;
	}
	
	public static WebElement getSaveEmployees(WebDriver d) {
		WebElement e = d.findElement(By.xpath(EMPL_SAVE));
		return e;
	}
	
	
	/* page interaction */
	public static void clickMenuClock(WebDriver d) {
		getMenuClock(d).click();
	}
	
	public static void clickClockIn(WebDriver d) {
		getClockIn(d).click();
	}
	
	public static void clickClockOut(WebDriver d) {
		getClockOut(d).click();
	}
	
	public static void clickMenuStaff(WebDriver d) {
		getMenuStaff(d).click();
	}
	
	public static void clickAddEmployee(WebDriver d) {
		getAddEmployee(d).click();
	}
	
	public static void clickEmplFName(WebDriver d) {
		getEmployeeFName(d).click();
	}
	
	public static void inputEmplFName(WebDriver d, String s) {
		getEmployeeFName(d).sendKeys(s);
	}
	
	public static void clickEmplLName(WebDriver d) {
		getEmployeeLName(d).click();
	}
	
	public static void inputEmplLName(WebDriver d, String s) {
		getEmployeeLName(d).sendKeys(s);
	}
	
	public static void clickEmplEmail(WebDriver d) {
		getEmployeeMail(d).click();
	}
	
	public static void inputEmplEmail(WebDriver d, String s) {
		getEmployeeMail(d).sendKeys(s);
	}
	
	public static void clickSaveEmployees(WebDriver d) {
		getSaveEmployees(d).click();
	}
}
