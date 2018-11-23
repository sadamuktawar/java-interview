package question;

public class ArrayMaxMinNoDemo {
public static void main(String[] args) {
	
int[]array= {10,20,30,40,50};
int max=array[0];
int min=array[0];
for(int i=0;i<array.length;i++){
	
	
	if(max<array[i]) {
		max=array[i];
	}else if(max>array[i]) {
		min=array[i];
	}
}
System.out.println("Maximum no in Array :"+max);

System.out.println("Min NO in Array :" +min);
}
}
