import java.util.*;

public class Prime{
	public static void main(String[] args){
		int n = 17,ans=0;
		boolean a = true;
		boolean flag = true;

		for(int i=2;i<=n/2;i++){

			ans = n%i;
			if(ans == 0){
				flag = true;
			}
			else{
				flag = false;
			}
			
		}
		if(flag == true){
			System.out.println("Number is not prime");
		}
		else{
			System.out.println("Number is prime");
		}

		// if(a == true){
		// 	System.out.println("Number is  prime");
		// }
		// else if(a == false){
		// 		System.out.println("Number is not prime");
		// 	}
	}
}