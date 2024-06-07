import java.util.*;

public class Hello{
	public static void main(String[] args){
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String hello;
		int size = hello.Length;

		for(int i=0;i<=size;i++){
			System.out.println(hello.Substring(0,i));
			int numSpaces = (size-i) * 2;

			for (int j=0;j<numSpaces;j++){
				System.out.println("");
			}
			System.out.println(hello.Substring(0,i));
		}
	}
}



