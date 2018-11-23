package question;

import java.util.HashSet;

public class RemoveDuplicate1 {
public static void main(String[] args) {
	

	String inputstring="javaprogram";
	char[]ch=inputstring.toCharArray();
  HashSet hashset=  new HashSet();
  StringBuffer removechar=new StringBuffer();
  for (char Character : ch) {
	  
	if(hashset.add(Character)) {
		removechar.append(Character);
	}
}
  System.out.println(removechar+ " :Removerepeat");
}
}
