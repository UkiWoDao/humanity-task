package util;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void forTitleChange(WebDriver d, int time) {
		WebDriverWait wait = new WebDriverWait(d, time);
		
		// wait for url change
		try {
			wait.until(ExpectedConditions.titleContains("Assignstaff"));
		} catch (TimeoutException e) {
			//
		}
	}
}
