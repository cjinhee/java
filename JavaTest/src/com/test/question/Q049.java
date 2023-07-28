package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {
		
		//행의 개수를 입력 받을 수 있도록/ 앞에 공백을 찍음 - 공백도 for문을 돌려서 찍고 별도 for문 돌려서 찍음
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int line = scan.nextInt();
		
		
		for (int i=line; i>0; i--) { 
			for (int j=0; j<=line-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
