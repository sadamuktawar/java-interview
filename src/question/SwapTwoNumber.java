package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("Before Swaping No");

		System.out.println(num1);
		System.out.println(num2);

		List list = new ArrayList();
		list.add(num1);
		list.add(num2);
		Collections.swap(list, 0, 1);
		num1 = (Integer) list.get(0);
		num2 = (Integer) list.get(1);
		System.out.println("After Swaping No");
		System.out.println(num1);
		System.out.println(num2);
	}

}