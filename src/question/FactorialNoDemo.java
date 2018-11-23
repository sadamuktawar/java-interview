package question;

public class FactorialNoDemo {

	public static void main(String[] args) {
	int factNo=5; //5*4*3*2*1
	for(int i=(factNo-1);i>1;i--) {
		factNo=factNo*i; //5*4*3*2*1
		
	}
	System.out.println("Factorial NO :"+factNo);
	} 	
}
