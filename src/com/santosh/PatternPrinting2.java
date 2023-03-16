package com.santosh;

import java.util.Scanner;

/**
 * @author Santosh Zirpe
 *  
 * Print Pattern as below:
 * 		*
 * 		* *
 * 		* * *
 * 		* * * *
 */

public class PatternPrinting2 {
	public static void main(String[] args) {
		System.out.println("====================Pattern Printing=====================");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("====================Pattern Printing=====================");	
	}

}
