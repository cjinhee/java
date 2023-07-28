package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {
		
		//public static void hello(String name) {}
		
		//void : 메소드 반환값(리턴값)
		//- 메소드가 실행 후 호출한 곳으로 돌려주는 값 
		
		System.out.println(getNum());
		
		String result = getName("홍길동");
		System.out.println(result);
	
		
	}//main
	
	public static String getName(String name) {
		
		return "고객명: " + name; 
		
	}
	

	//This method must return a result of type int , int값 한개를 돌려줘야한다. void가 아닌 다른 자료형을 적으면 값을 돌려줄 의무를 지켜야하기 때문에
	// int 와 return 은 짝꿍
	public static int getNum() {
		
		//return문
		//- 메소드 종료
		//- 값을 반환(되돌려줌) 즉 메소드가 끝남,, 피드백 받은것임 , 
		return 100;
		
		//This method must return a result of type int, 리턴문 아래에 코드를 작성하면 안됨
		//System.out.println("테스트");
	}
	
}
