package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		
		
		//substring이나 charAt이용
		//요구사항] 숫자를 입력받아 각 자릿수의 수의 합을 구하기
		
		String txt = "";
		String result = "";
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		txt = scan.nextLine();
		
		for(int i=0; i < txt.length();i++) {
			
			sum += txt.charAt(i) - 48; //0의 코드값이 48
			result += txt.charAt(i);
			
			if(i< txt.length() -1) {
				result += " + ";
			}
		}
		
		System.out.printf("결과: %s = %d\n", result, sum);
		
	}
}
