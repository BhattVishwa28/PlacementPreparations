import java.util.*;

public class Largest3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = 4;
		int b = 5;
		int c = 1;

		int ans = a>(b>c?b:c)? a: ((a>b)?a:b);

		System.out.println("Largest:"+ans);
	}
}

