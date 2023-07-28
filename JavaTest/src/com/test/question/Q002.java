package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		/*
		요구사항]  숫자 2개를 입력받아 아래의 연산식을 출력
		
		조건
		- 출력 숫자에 천단위 표시
		- 결과값은 소수 이하 1자리까지 표기
		
		입력 
		첫번째 숫자 : 5
		두번째 숫자 : 3
		
		출력
		5 + 3 = 8
		5 - 3 = 2
		5 * 3 = 15
		5 / 3 = 1.7
		5 % 3 = 2
		
		*/
		//1.스캐너 생성하기
		Scanner scan = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		double result4 = 0;
		int result5= 0;
		
		//2. 안내메세지 출력
		System.out.print("첫번째 숫자 : ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자 : ");
		n2 = scan.nextInt();
				
		result1 = n1 + n2;
		result2 = n1 - n2;
		result3 = n1 * n2;
		result4 = (double)n1 / n2;
		result5 = n1 % n2;
		
		
		System.out.printf("%d + %d = %,d\n", n1, n2, result1);
		System.out.printf("%d - %d = %,d\n", n1, n2, result2);
		System.out.printf("%d * %d = %,d\n", n1, n2, result3);
		System.out.printf("%d / %d = %.1f\n", n1, n2, result4);
		System.out.printf("%d %% %d = %,d\n", n1, n2, result5); 
		
		
		
		
	}
}
