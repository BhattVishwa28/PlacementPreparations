import java.util.*;

public class Index{
	public static void main(String [] args){
		
		
		Scanner sc = new Scanner(System.in);
		String haystack = "mayurpadia";
		String needle = "ma";
		

		
		
		if(haystack.contains(needle)){
			int i = haystack.indexOf(needle);
			System.out.println(i);
		}
		else{
			System.out.println("-1");
		}
		
	
	}
			
}