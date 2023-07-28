package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		
		//요구사항] 문자 1개를 입력받아 아래와 같이 출력
		
		//변수 선언
		String input = "";
		String result = "";
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("문자: ");
		input = scan.nextLine();
		
		if (input.equals("f") || input.equals("F")){
			result = "Father";
		} else if (input.equals("m") || input.equals("M")) {
			result = "Mother";
		} else if (input.equals("s") || input.equals("S")) {
			result = "Sister";
		} else if (input.equals("b") || input.equals("B")) {
			result = "Brother";
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		System.out.println(result);
		
		
		
	}
}
