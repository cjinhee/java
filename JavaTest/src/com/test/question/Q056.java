package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		String txt1 = "";
		String txt2 = "";
		String txt3 = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		for (int i=1; i<=n1; i++) {
			
			if(n1 % i == 0) {
				txt1 += i + ",";
			}
			
		}
		for (int i=1; i<=n2; i++) {
			
			if(n2 % i == 0) {
				txt2 += i + ",";
			}
		}
		
		for (int i=1; i<=((n1<n2) ? n1 : n2); i++) {
			
			if(n1 % i == 0 && n2 % i == 0) {
				txt3 += i + ",";
			}
		}
		System.out.printf("%d의 약수: %s\n", n1, txt1);
		System.out.printf("%d의 약수: %s\n", n2, txt2);
		System.out.printf("%d와 %d의 공약수: %s\n", n1,n2,txt3);
	}
}
