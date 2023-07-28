package com.test.java;

public class Ex30_for {

	public static void main(String[] args) {

		//m1();
		//m2();
		//m3();	
		//m4();
		m5();
		
		//다중 반복문 > 단일 반복문
		
	}// main
	private static void m5() {
	
		//루프변수를 통제해서 별을 내가 원하는 방식으로 나오게 함
		//별찍기(5x5)
		
		int n = 1;
		
		for (int i=0; i<5; i++) { //행 만들기
			for (int j=0; j<5; j++) { //열 만들기
				
				System.out.print("*");
//				System.out.printf("%3d", n);
//				n++;
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) { 
			for (int j=i; j<5; j++) {
				
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i=0; i<5; i++) { 
			for (int j=0; j<=i; j++) {
				
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	private static void m4() {
		
		// 루프 > 분기문 개입(break, continue)
		for (int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				//if(i == 5) {
				//if(j ==5 ) {	
				//i가 5일때 j는 5바퀴만 돌음 
				//if(i == 5 && j == 5) {
				if(i == 5 || j == 5) {
					break; // 자신이 포함된 루프를 탈출한다.(j루프 탈출)
				}
				
				System.out.printf("i: %d, j:%d\n", i, j);
			}
		}				
	}
	
	private static void m3() {
		// - 강의실(1강의실 ~ 6강의실)
		// - 학생들(30명)
		
		for (int i=1; i<=6; i++) {
			
			for (int j=1; j<=30; j++) {
				
				System.out.printf("%d강의실 %d학생 학생", i , j );
			}
		}
		
	}
	private static void m2() {
	
		//구구단(2단~9단)
		
		for (int j=2; j<=9; j++) {
			
			System.out.println("===============");
			System.out.printf("      %d단\n",j);
			System.out.println("===============");
			
			for (int i=1; i<=9; i++) {
				
				System.out.printf("%d x %d = %2d\n", j, i, j*i);
				
		}
	}
				
}
	public static void test() {
		
	}
	
	private static void m1() {

		// 모든 제어문끼리는 중첩이 가능하다.

		// 중첩된 반복문

		// 2중 for문

		// 루프 변수 > i

		// Ctrl + Shift + F (코드 포맷 맞춰주는 단축키)

		// 총100번 실행
//		for (int i = 0; i < 10; i++) {
//
//			for (int j = 0; j < 10; j++) {
//
//			System.out.println("실행문");//10회 실행
//				System.out.printf("i: %d, j: %d\n", i, j);
//
		//3중 for문 (시계와 패턴이 같음)
		for (int i = 0; i < 24 ; i++) { //대회전(시침)
			
			for (int j = 0; j < 60; j++) { //중회전(분침)
				
				for (int k = 0; k<60; k++) { //소회전(초침)
					
					//System.out.println("실행문");
					
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
		}

	}// m1
}
