package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		
		//요구사항] 태어난 년도를 일력하면 나이를 출력
		
		//캘린더로 실행 
		
		//변수 선언
		int age = 0;
		int year = 0;
		
		//현재시각,스캐너 생성
		Calendar now = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도: ");
		year = scan.nextInt();
		
		//년도 + 1을 해야 우리나라 나이로 출력 가능
		age = now.get(Calendar.YEAR) - year + 1;
		System.out.printf("나이: %d세\n", age);
	}
}
