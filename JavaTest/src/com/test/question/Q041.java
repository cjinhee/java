package com.test.question;

import java.util.Scanner;

public class Q041 {

	public static void main(String[] args) {
		
		//요구사항] 누적값이 1000을 넘어가는 순간 루프를 종료하시오
		//m1();
		m2();
	}
		private static void m2() {
	
			int sum = 0;
			for (int i=1; ; i++) {
				
				sum += i;
				
				System.out.printf("%d +", i);
				
				if(sum > 1000) {
					break;
				}
				
			}
			System.out.println("=" + sum);
			
		
	}
		private static void m1() {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= sum; i++) {
			if (sum > 1000) {
				System.out.printf("%d +",i);
				System.out.printf("=");
				
				break;
			}
		} System.out.printf("%d", sum);
	}

	
		
	}
		

