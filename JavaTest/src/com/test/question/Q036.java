package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {
		
		//요구사항] 시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력
		
		int start = 0;
		int finish = 0;
		int incre =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		finish = scan.nextInt();
		
		System.out.print("증감치: ");
		incre = scan.nextInt();
		
		for (int i = start; i <= finish; i+=incre) {
			System.out.println(i);
		}
			
	}
}
