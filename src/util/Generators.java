package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generators {
	
	public static List<String> domain;
		
	public static String getRandomDomain() {
		
		domain = new ArrayList<String>();
		
		// add sample domains
		domain.add("gmail.com");
		domain.add("yahoo.com");
		domain.add("hotmail.com");
		domain.add("aol.com");
		
		// create Random instance
		Random rnd = new Random();
		
		// get random int
		int index = rnd.nextInt(domain.size());
		
		// return single item by random index
		return domain.get(index);
	}
	
	public static String getRandomLocal(int maxChar) {
		
		// all english keyboard non-special characters
		String VALIDCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		// create instance of string builder
		StringBuilder stb = new StringBuilder();
		
		// create instance for random numbers
		Random rnd = new Random();
		
		// iterate over ENGCHARS and create a random string
		while(stb.length() < maxChar) {
			int i = (int) (rnd.nextFloat() * VALIDCHARS.length());
			stb.append(VALIDCHARS.charAt(i));
		}
		
		// to string
		String s = stb.toString();
		
		return s;
	}
		
	public static String getRandomEmail(int i) {
		
		// append random string to a random valid email suffix form
		String s = getRandomLocal(i) + "@" + getRandomDomain();
		return s;
	}
}
