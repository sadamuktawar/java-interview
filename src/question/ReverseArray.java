package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
public static void main(String[] args) {
	int []array= {10,20,30,40,50};
	System.out.println("Before reversing array :");
	for (int i : array) {
		
		System.out.println(i);
	}
List list=	new ArrayList();
list.add(array[0]);
list.add(array[1]);
list.add(array[2]);
list.add(array[3]);
list.add(array[4]);
Collections.reverse(list);
System.out.println("After reversing string ");
for (Object object : list) {
System.out.println(object);	
}
}
}
