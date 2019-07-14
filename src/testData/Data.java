package testData;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	public static List<String> email;
	public static List<String> firstName;
	public static List<String> lastName;
	
	public static String emailTestData(int index){
		
		email = new ArrayList<>();
		
		// list with email testing strings
		email.add("doe");
		email.add("doe!@yahoo.com");
		email.add("doe@!yahoo.com");
		email.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@yahoo.com");
		email.add("a@a.a");
		email.add("@yahoo.com");
		email.add("doe@yahoo");
		email.add(" @yahoo.com");
		email.add("");
		email.add(" ");
		email.add("abc..12@yahoo.com");
		
		return email.get(index);
	}
	
	public static String firstNameTestData(int index){
		
		// list with firstName testing strings
		firstName.add("");
		firstName.add("!");
		firstName.add("a");
		firstName.add(" ");
		firstName.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		return firstName.get(index);
	}
	
	public static String lastNameTestData(int index){
		
		// list with lastName testing strings
		lastName.add("");
		lastName.add("!");
		lastName.add("a");
		lastName.add(" ");
		lastName.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		return lastName.get(index);
	}
}
