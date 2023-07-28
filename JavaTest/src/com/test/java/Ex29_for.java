package com.test.java;

import java.util.Scanner;

public class Ex29_for {

	public static void main(String[] args) {
		
		
		//제어문 > 조건문
		//제어문 > 반복문
		
		
		/*
		
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
			- 생산성 향상 + 유지보수성 향상
			
			for문
			
			      - 문장을 3개 넣을 수 있음, 반복을 하기위한 여러가지 상태를 제어하는 문장들이 온다.
			for (초기식; 조건식; 증감식;) {
				문장;
			}
			
		
				
		*/

	
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		m15();
		
	}//main
	
	private static void m15() {
		
		//난수 만들기, Random
		//- 임의의 수
		
		//1. Math 클래스 > 대중화 방법(다른 언어)
		//2. Random 클래스 > 자바 방법
		
		System.out.println(3.14);
		System.out.println(Math.PI);
		
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0. 
		
		//0.0 ~ 0.99999999999999999의 사이 값을 돌려줌
		
		for(int i=0; i<10; i++) {
			 
			//System.out.println(Math.random());
			
			//0.0 > 0
			//0.1 > 1
			//0.15 > 1
			//0.2xx > 2
			//0.3xx > 3
			
			//0~9사이의 난수
			//System.out.println((int)(Math.random()*10));
			
			//1~10사이의 난수
			//System.out.println((int)(Math.random()*10)+1);
			
			//4~7사이의 난수 구하고싶다
			//시작 숫자를 0으로 바꾸기.(-4) 0~3사이의 난수를 구하기 +4
			//0.4를 넘지않은 숫자들이 나옴
			System.out.println((int)(Math.random()*4) + 4);
			
		}
		
		
		
		
	}

	//void면 리턴문이 필요없음, return 옆에 값을 넣으면 에러가 남// 
	public static void m14() {
		
		//빈 리턴문
		//- 값을 반화하는 목적이 아니라 메소드를 중단하는 역할 //실제로 값을 돌려주지 않음.
		return;
	}
	
	//This method must return a result of type int : 해당 메소드는 인티저 타입의 메소드를 돌려줘야함
	// > 모든 경우의 수 > 반드시 return문이 존재
	public static int m13() {
		
		int num = 10;
		
		//true가 될지 false가 될지 모름, 그래서 else 절을 만듦. 
		//조건문, 반복문이 됐던 경우의 수가 존재, 끝에 return문을 만들어야할 때가 있어서 return문이 잘 있는지 확인해야함
		if (num % 2 == 0) {
		
			return 10;
			
		} else {
			return 0;
		}
	}
	
	public static int m12() {
		
		return 10;
	}
	private static void m11() {
		
		// 요구사항] 사용자 숫자 입력 > 입력받은 숫자 누적 > 입력 횟수? > m6()
		// 추가사항] 홀수만 입력~ 짝수 입력하면 프로그램 중단
		//루프를 몇바퀴 돌려야할지 모르는 상황이면 무한루프 이용
		
		int sum = 0; //누적변수
		int num = 0; //입력
		
		Scanner scan = new Scanner(System.in);
		
		//회전수를 예측하기 힘들 때 > 무한루프 사용
		for(;;) {
			System.out.print("숫자: ");
			num = scan.nextInt();

			if(num % 2 == 0) {//짝수 입력
				//break;
				return;
			}
			
			sum += num;
		}
	
	
		System.out.println(sum);
	
	
	
	}

	private static void m10() {
		
		//학교 담임 선생님 > 학생 상담 > 1번 ~ 30번
		
		for (int i=1; i<=30; i++) {
			
//			if (i == 16) {
//				break; // 16번 전에 끝남
//			
//			}
			//or 연산
			if (i == 10 || i == 15) {
				continue; //10번학생 제외)
			}
			System.out.printf("%d번 학생 상담중..\n",i);
		}
		
	}

	private static void m9() {
		
		
		//break, continue > 독립적 사용 불가 > 다른 제어문과 함께 사용
		
		//break > 자신이 속한 제어문을 탈출(if문 예외, 인식 불가)
		//continue > 실행 > 제어문의 시작으로 이동(처음으로 돌아가세요.)
		
		for (int i=1; i<=10; i++) {
			
			if (i==5) {
			//break;//if문을 제외한 나머지를 탈출할 대상으로 인식한다. 자신을 for문 안에 있다고 생각하고 for문을 탈출
			continue; 
		}
			System.out.println(i);
		}
		
		
		
	}

	private static void m8() {
		
		// 무한 루프, Infinite Loop
		//1. 사용자 실수 > 수정
		//2. 사용자 의도 > 어떻게?
		
		int num = Integer.MIN_VALUE;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
		
		//무한 루프(X) > 21억바퀴
//		for (int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		//무한 루프
//		for (int i=0; true; i++) {
//			System.out.println(i);
//		}
		
		//true라고 안적어도 됨 동일하게 취급해줌
//		for (int i=0; ; i++) {
//			System.out.println(i);
//		}
		
		//초기식,증감식 생략 가능 (;;) -> 무한 루프
//		for (;;) {
//			System.out.println("반복문");
//		}
		
		
	}

	private static void m7() {
		
		// 요구사항] 구구단 출력
		
		/*
			
			5 x 1 = 5
			5 x 2 = 10
			5 x 3 = 15
			...
			5 x 9 = 45
		
		*/
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("5 x %d =%2d\n", i, 5*i); //우측정렬
		}
		
		System.out.println();
		
		//요구사항] 사용자가 원하는 단 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = scan.nextInt();
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d =%2d\n", dan, i, dan*i);
		}
		
	}

	private static void m6() {
		
		// 요구사항] 사용자로부터 숫자 10개를 입력받아 누적?
		
		Scanner scan = new Scanner(System.in);
		
		//10바퀴 돌려야함, 변수선언은 밖으로 빼기
		int sum = 0; //누적변수
		
		for(int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num; // 사용자 입력 숫자 > 누적
			
		}
		System.out.println(sum);
	}

	private static void m5() {
		
		// 요구사항]1 ~ 사용자가 원하는 숫자까지의 합? 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
		int sum = 0; // 누적 변수 초기화
		
		//몇회전: 컴파일 시점에는 알수없음, 런타임 때 알수있음 > 지연된다.
		for(int i=1; i<=num; i++) {
			sum += i; //sum에 누적시킴
		}
		System.out.printf("1 ~ %d= %d\n", num, sum);
		
		
		
	}

	private static void m4() {
		
		
		//요구사항] 1~10까지의 합 > 누적
		
		//누적하기
		//- 누적 변수(반드시 초기화), 0이라고 넣어야지 누적작업에 영향을 끼치지 않기 때문. 
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(i);
			
			sum += i; // sum = sum + i;
			// 1 = 0 + 1
			// 3 = (0 + 1) + 2
			// 6 = (0 + 1 + 2) + 3
			// 10 = (0 + 1 + 2+ 3) + 4
			//...
			// 45 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) + 9
			// 55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
		}
		
		System.out.println(sum);
		
	}

	private static void m3() {
		
		//반복문 > 루프 변수?
		//2. 루프 변수의 역할 > 회전수 or 값
		
		//요구사항] 숫자 1~10까지 출력
		
		System.out.println(1);
		System.out.println(2);  // - 이렇게 하나씩 찍기
		System.out.println();
		
		
		int num = 1;
		System.out.println(num);
		num++;
		System.out.println();
		
		num = 1;
		
		for (int i=0; i < 10; i++) {
			System.out.println(num + ":" + i);
			num++;
		}
		System.out.println();
		
		//가장 이상적인 솔루션
		//루프변수 > 회전수 or 값
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//수열
	}

	private static void m2() {
		
		//반복문 > 회전수?
		//1. 반복문의 시행 횟수를 내가 제어할 수 있는지?
		
		for (int i=1; i <=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=5; i <= 9; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=1; i <=9; i=i+2) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		for (int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();
		
	}

	private static void m1() {
		
		
		//요구사항] "안녕하세요" x 5회 출력
		
		//case1.
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		//case2.
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//case3.
		
		//1. int i=1   - i라는 변수를 만들어서 초기화/ for문에 초기에 1번만 실행해서 초기식
		//2. i<=5      - 조건이 만족하는 순간 실행블록을 실행
		//3. 블럭(문장) 실행
		//4. i++ 실행 2가 됨
		//5. i<=5
		//6. 블럭(문장) 실행
		//7. i++
		//8. i<=5
		//9. 블럭(문장) 실행
		
		//초기식 변수 하나를 만들어서 초기화 함,
		//초기식: 루프 변수(i)를 초기화하는 역할
		//조건식: 루프 지속 유무 조건 
		//증감식: 루프 변수에 변화를 주는 역할 > 언젠가 루프 탈출(false)
		for(int i=1; i <= 5; i++) {
			System.out.println("안녕하세요.");
		}
		
	}//m1
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}
}
