package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		
		
		//문자 코드값 97(a)을 찍음_문자코드값을 적용//ㅍㅣ라미드와 비슷
		int line = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		line = scan.nextInt();
		
		for(int i=1; i<=line; i++) {
			
			for(int j=0; j<line-i; j++) {
				System.out.println(" ");
			}
			char c = 'a';
			for (int j=1; j<i*2/2; j++) {
				System.out.print(c);
				c++;
			}
			for(int j=0; j<i*2/2; j++) {
				c--;
				System.out.print(c);
			}
			System.out.println();
		}
	
	}
}
