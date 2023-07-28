package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
		
		m1();
		m2();
	}
		private static void m2() {
			
		
		//요구사항] 출력
		
		int bigin = 0;
		int end = 0;
		int sum = 0;
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		bigin = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		
		for (int i = bigin; i <= end; i++) {
			
			sum += i;
			txt += i;
			
			if (i < end) {
				txt += "+" ;
			}
		}
		
		System.out.println(txt + "=" + sum);
	}
	
	
	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		int b = 0 ,e = 0;
		int sum = 0; //누적변수
		
		System.out.print("시작 숫자: ");
		b = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		e = scan.nextInt();
		
		for (int j = b; j <= e; j++) {
			
			sum += j;
			
			System.out.printf("%d + ", j );
		}
		System.out.println("\b\b=" + sum);
		
	}
}
