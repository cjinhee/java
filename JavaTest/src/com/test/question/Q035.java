package com.test.question;

import java.util.Scanner;

public class Q035 {

	public static void main(String[] args) {
	
		//요구사항] 사용자의 이름과 인사할 횟수를 입력 받아 출력
	
		String name = "";
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("횟수: ");
		n = scan.nextInt();
		
		for(int i = 0; i < n ; i++ ) {
			System.out.printf("%s님 안녕하세요~\n", name);
       }
	
	}
	
}
