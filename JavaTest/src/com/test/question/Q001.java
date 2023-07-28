package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		
		//태어난 년도를 입력받아 나이를 출력하시오. / 우리나라 나이로 출력하시오
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//변수 선언
		int year = 0;
		int age = 0;
		 
		//안내메세지 입력
		System.out.print("태어난 년도: ");
		
		//출력
		year = scan.nextInt();
		
		age= 2023 - year + 1;
		
		System.out.printf("나이: %d세\n ",age);
        
		
		
		
	}
}

