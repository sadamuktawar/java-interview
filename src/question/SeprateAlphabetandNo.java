package question;

public class SeprateAlphabetandNo {
	public static void main(String[] args) {
		
		String input="sada15muktwar12";
		String alphabet="";
		String Numeric ="";
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			if(Character.isDigit(ch)) {
				Numeric=Numeric+ch;
				
			}else {
				alphabet=alphabet+ch;
			}
				
		}
		 System.out.println(Numeric);
		 System.out.println(alphabet);
	
	}
	

}
