import java.util.*;
import java.io.*;

public class OddEvenBitwise{
	public static void main(String[] args){
		int n=5;

		if((n^1) == (n+1)){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}
