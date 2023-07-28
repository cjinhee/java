package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {
		
		//Swap
		//- 2개의 공간의 값을 서로 교환하는 작업
		
		int a = 10;
		int b = 20;
		
		swap(a, b); //Ctrl + 1 하면 자동으로 메소드 생성 /Ctrl + 1 rename해서 이름 변경
	
		String s1 = "홍길동"; 
		String s2 = "아무개";
		
		swap(s1, s2);
	
	}//main

	private static void swap(int a, int b) {
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		int temp; //빈컵
	
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %d, b: %d\n", a, b);
	}
	private static void swap(String a, String b) {
		
		System.out.printf("a: %s, b: %s\n", a, b);
		
		String temp; //빈컵
	
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %s, b: %s\n", a, b);
	}
}
