package com.test.question;

public class Q016 {
	
	public static void main(String[] args) {
		
		//요구사항] 인자로 받은 숫자들의 합을 구하는 메소드를 선언
		
		
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
		
		
	}//main
	
	public static void sum(int n1) {
		
		int sum = 0;
		
		sum = n1;
		
		System.out.printf("%d = %d\n", n1, sum);
		
		
	}

	public static void sum(int n1, int n2) {
		
		int sum = 0;
		
		sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n", n1, n2, sum);
		
}
	public static void sum(int n1, int n2, int n3) {
		
		int sum = 0;
		
		sum = n1 + n2 + n3;
		
		System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, sum);
}
	
	public static void sum(int n1, int n2, int n3, int n4) {
		
		int sum = 0;
		
		sum = n1 + n2 + n3 + n4;
		
		System.out.printf("%d + %d + %d + %d = %d\n", n1, n2, n3, n4, sum);

	
}
	
	
	public static void sum(int n1, int n2, int n3, int n4, int n5) {
		
		int sum = 0;
		
		sum = n1 + n2 + n3 + n4 + n5;
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n", n1, n2, n3, n4, n5, sum);

	
	
	}	
	
	
	
	
	
}
