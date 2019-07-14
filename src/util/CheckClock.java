package util;

import org.openqa.selenium.WebDriver;

import pageData.AppPage;

public class CheckClock {
	
	public static void isVisible(WebDriver d) {
		try {
			AppPage.getClockOut(d);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
