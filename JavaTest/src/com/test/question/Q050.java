package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		
		//49번문제 거꾸로한것
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int line = scan.nextInt();
		
		
		for (int i =1; i<=line; i++){
			for (int j=line-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
