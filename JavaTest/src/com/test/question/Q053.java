package com.test.question;

public class Q053 {

	public static void main(String[] args) {
		
		//구구단 출력 2x1=2 찍고 3x1=3 찍고 순서대로 찍은것임
		//해결 방법 : 2중 for문 2번사용 or 3중 for문 1번
		m1();
	}
		private static void m1() {	
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.printf("%2d x %2d = %2d\t", j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%2d x %2d = %2d\t", j,i,j*i);
			}
			System.out.println();
			}
	
		}
		
	}