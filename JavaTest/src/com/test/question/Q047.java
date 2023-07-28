package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {
		
		//요구사항] 자판기 프로그램을 구현하시오
		
		drawLine();
		
		
	}

	private static void drawLine() {
		
		int input = 0;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println( "    자판기  ");
		System.out.println("==================");
		System.out.println("1. 콜라 : 700원");
		System.out.println("2. 사이다 : 600원");
		System.out.println("3. 비타500 : 500원");
		System.out.println("------------------");
		System.out.print("금액 투입(원) : ");
		input = scan.nextInt();
		
		System.out.println("------------------");
		System.out.print("음료 선택(번호) : ");
		choice = scan.nextInt();
	
		

	}
}
