package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		
		//메소드 인자 리스트
		//- 파라미터(Parameter)
		//- 인자(Arguments)
		//- 매개변수
		
		//요구사항] '홍길동'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '아무개'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '하하하'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] 우리 강의실의 모든 사람마다 각각 인사를 하는 메소드를 구현하시오. 메소드 x 25개
		//추가사항] 대한민국 모든 사람마다 인사하는 메소드를 구현. 메소드 x 5174만
		
		hello();
		hello2();
		hello3();
		
		//The method helloEveryOne(String) is not applicable for the arguments ()
		//helloEveryOne();
		helloEveryOne("홍길동");
		helloEveryOne("아무개");
		helloEveryOne("하하하");
		
		checkAge(15);
		checkAge(25);
		
		//          실인자
		checkScore("홍길동", 100, 90, 80); //매개 순서 맞춰서 값을 넣기
		checkScore("아무개", 50, 60, 70);
		//checkScore("하하", 50, 60); > 컴파일에러가 뜸, 반드시 지켜야함
	    //checkScore("하하", 50, 60, 70, 80); >컴파일에러 뜸.	
		
	}//main
	
	public static void hello() {
		System.out.println("홍길동님 안녕하세요."); 
		
	}
	
	public static void hello2() {
		System.out.println("아무개님 안녕하세요."); 
		
	}
	
	public static void hello3() {
		System.out.println("하하하님 안녕하세요."); 
		
	}
	
	public static void helloEveryOne(String name) {
		
		//변수생성, 메소드 선언부 안에 있는 소괄호 안에 있는 곳엔 선언만 할 수 있고 값을 지정할 수 없음.
		// 문자열에 인자가 있으니까 부를 때 ()안에 넣어야함 , 호출하는것에 매개 역할을 함 /인자리스트 / 메소드의 활용도를 높인것이다
		//String name = "이름";
		
		System.out.println(name + "님 안녕하세요.");
			
	}
	
	//                           가인자
	public static void checkAge(int age) {
	
		String result = age >= 19 ? "성인" : "미성년자";
		
		System.out.printf("%d살은 %s입니다.\n", age, result);
	}
	
	
	public static void checkScore(String name, int kor, int eng, int math) {
		
		//총점 > 250점 이상 합격
		int total = 0;
		
		total = kor + eng + math; 
		
		String result = total >= 250 ? "합격" : "불합격";
		
		System.out.printf("%s 학생: %d점 = %s\n", name, total, result);
		
		
		
		
	}
}
