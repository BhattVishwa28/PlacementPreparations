import java.util.*;

public class Binary{
	public static void main(String[] args){
		int n = 101;
		int a = 110;
		double b,an,fi;
		double m,ans=0,fin=0;
		double power;

		for(int i=0;i<n+2;i++){
			
			m = n%10;
			n = n/10;
			// System.out.println("m="+m);
			// System.out.println("n="+n);
			power = Math.pow(2,i);
			ans = m*power;
			// System.out.println("ans="+ans);
			fin = ans+fin;
			
		}
		for(int j=0;j<a+2;j++){
			
			b = a%10;
			a = a/10;
			// System.out.println("m="+m);
			// System.out.println("n="+n);
			power = Math.pow(2,j);
			an = b*power;
			// System.out.println("ans="+ans);
			fi = an+fi;
			
		}
		System.out.println(fin "." +fi);			

	}
}