package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		
		//요구사항] 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언
		
		position("홍길동");
		position("홍길동","유재석");
		position("홍길동","유재석","박명수");
		position("홍길동","유재석","박명수","정형돈");
	
		
		
		
	}
	
	public static void position(String name1) {
		
		System.out.println("사원: " + name1);
		System.out.println();
		

	}	
	
	public static void position(String name1, String name2) {
		
		System.out.println("사원: " + name1);
		System.out.println("대리: " + name2);
		System.out.println();
		

	}	
	
	public static void position(String name1, String name2, String name3) {
		
		System.out.println("사원: " + name1);
		System.out.println("대리: " + name2);
		System.out.println("과장: " + name3);
		System.out.println();
		

	}	
	public static void position(String name1, String name2, String name3, String name4) {
		
		System.out.println("사원: " + name1);
		System.out.println("대리: " + name2);
		System.out.println("과장: " + name3);
		System.out.println("부장: " + name4);
		System.out.println();
		

	}	
	
}

