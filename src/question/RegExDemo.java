package question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[^a-z]");
		Matcher m=p.matcher("sadamuktawarADA13");
		while(m.find()) {
		System.out.println(m.start()+"....."+m.end());
	}
		}

}
