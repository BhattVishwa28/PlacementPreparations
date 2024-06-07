import java.util.*;

public class Palindrome{
	public static void main(String[] args){
		int n = 121,sum = 0;
		int temp = 121;

		while(n>0){
			int a = n%10;
			sum = (sum*10)+a;
			n = n/10;
			// System.out.println(sum);
			
		}
		
		System.out.println(sum);
		if(temp == sum){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
	}
}