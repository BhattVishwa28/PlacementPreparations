import java.util.*;

public class PrimeNum{
	public static void main(String[] args){
		

		for(int i=150;i<=445;i++){
			if(i%7==0){
				if(i/3!=0){
					if(i%2!=0){
						System.out.println(i);
					}
				}
			}

		}
	}
}