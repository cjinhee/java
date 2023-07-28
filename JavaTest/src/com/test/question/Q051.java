package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		//앞에 공백을 찍음
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int line = scan.nextInt();
		
		for (int i=1; i<=line; i++) {
			for (int j=line; j> i; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<= 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
