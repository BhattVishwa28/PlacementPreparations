import java.util.*;
import java.io.*;

public class Pattern1{
	
	static void print_square(int k, int l){
        int a, b;
 
       
        for (a = 1; a <= k; a++) {
            for (b = 1; b <= l; b++) {
                
                if (a == 1 || a == k || b == 1 || b == l)
 
                    System.out.print("*");
                else
 
                    System.out.print(" ");
            }
 
            System.out.println();
        }
    }
 
    public static void main(String args[])
    { 
        print_square(5,5);
    }
	
}

