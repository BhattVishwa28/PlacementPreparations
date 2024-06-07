import java.util.*;

public class P14{
	public static void main(String[] args){
		int n=5;

		if(n<0){
			System.out.println("Enter positive number");
		}
		if((n^1) == (n+1)){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}