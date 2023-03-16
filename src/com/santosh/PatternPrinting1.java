package com.santosh;

import java.util.Scanner;

public class PatternPrinting1 {
	public static void main(String[] args) {
		System.out.println("====================Pattern Printing=====================");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int a=0,b=4;
			for(int j=1;j<=i;j++) {
				int t = j+a;
				System.out.print(t+" ");
			}
			System.out.println(" ");
		}
		System.out.println("====================Pattern Printing=====================");	
	}

}
