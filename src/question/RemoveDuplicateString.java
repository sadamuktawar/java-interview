package question;

import java.util.HashSet;

public class RemoveDuplicateString {
public static void main(String[] args) {
	String inputstring="JavaInterview";
char ch[]=	inputstring.toCharArray();
HashSet hashset=new HashSet();
StringBuffer removeDuplicate=new StringBuffer();
for (char character : ch) {
	if(hashset.add(character)){
		removeDuplicate.append(character);
		
	}
}
System.out.println("removeDuplicate :"+removeDuplicate);
}
}

