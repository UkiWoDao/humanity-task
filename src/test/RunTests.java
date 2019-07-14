package test;

import org.testng.annotations.Test;

import pageData.LoginPage;
import run.Run;
import util.Generators;
import util.Wait;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class RunTests {
	
	public WebDriver d;
	// title contains following string when employee is added
	public String OK = "Assignstaff";
	// title contains following string when not adding employee
	public String ERR = "Add";
	
  @BeforeSuite
  public void beforeSuite() {
	  // create webdriver instance
	  d = new ChromeDriver();
	  
	  // log in as a business owner
	  try {
		  Run.LogIn(d, LoginPage.username, LoginPage.password);
	} catch (Exception e) {
		Assert.fail("Log In failed");
	}
  }
  
  @Test
  public void testClock() {
	  Run.toggleClock(d);
  }
  
  /* EMAIL INPUT FIELD TESTS*/
  @Test
  public void validData(){
	  Run.addEmployee(d, "John", "Doe", "abcdefg@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(OK));
  }
  
  @Test
  public void emailNoDomain(){
	  Run.addEmployee(d, "John", "Doe", "doe");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailLocalSpecialChar(){
	  Run.addEmployee(d, "John", "Doe", "doe!@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(OK));
  }
  
  @Test
  public void emailDomainSpecialChar(){
	  Run.addEmployee(d, "John", "Doe", "doe@!yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailMaxLength(){
	  Run.addEmployee(d, "John", "Doe", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailMinLength(){
	  Run.addEmployee(d, "John", "Doe", "a@a.a");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }
  
  @Test
  public void emailNoLocal(){
	  Run.addEmployee(d, "John", "Doe", "@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailNoTopLevelDomain(){
	  Run.addEmployee(d, "John", "Doe", "doe@yahoo");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailSingleSpace(){
	  Run.addEmployee(d, "John", "Doe", " ");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailLocalSingleSpace(){
	  Run.addEmployee(d, "John", "Doe", " @yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailEmptyField(){
	  Run.addEmployee(d, "John", "Doe", "");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailDomainSpaceChar(){
	  Run.addEmployee(d, "John", "Doe", "abc12@yahoo .com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailNoQuoteDoubleDot(){
	  Run.addEmployee(d, "John", "Doe", "abc..12@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void emailLocalSpaceChar(){
	  Run.addEmployee(d, "John", "Doe", "abc 12@yahoo.com");
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }
  
  /* USER NAME INPUT FIELD TESTS */
  
  @Test
  public void firstNameEmpty(){
	  Run.addEmployee(d, "", "Doe", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }
  
  @Test
  public void firstNameSpecialChars(){
	  Run.addEmployee(d, "!!!!", "Doe", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void firstNameMinLength(){
	  Run.addEmployee(d, "a", "Doe", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void firstNameSingleSpace(){
	  Run.addEmployee(d, " ", "Doe", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }

  @Test
  public void fisrtNameMaxLength(){
	  Run.addEmployee(d, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Doe", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }
  
  /* LAST NAME INPUT FIELD TESTS*/
  
  @Test
  public void lastNameEmptyField(){
	  Run.addEmployee(d, "John", "", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }
   
  @Test
  public void lastNameSpecialChar(){
	  Run.addEmployee(d, "John", "!!!!", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  }  

  @Test
  public void lastNameMinLength(){
	  Run.addEmployee(d, "John", "d", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  } 

  @Test
  public void lastNameSingleSpace(){
	  Run.addEmployee(d, "John", " ", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  } 

  @Test
  public void lastNameMaxLength(){
	  Run.addEmployee(d, "John", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Generators.getRandomEmail(5));
	  Wait.forTitleChange(d, 3);
	  Assert.assertTrue(d.getTitle().contains(ERR));
  } 
  
  @AfterSuite
  public void afterSuite() {
	  // kill chrome process after test suite
	  d.quit();
  }

}
