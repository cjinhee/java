package com.test.question;

public class Q010 {

	public static void main(String[] args) {
	
		//요구사항] 숫자 1개를 전달하면 4자리로 출력하는 메소드 선언
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main
	
	public static void digit(int num) {
		
		//변수선언
		String result = "";
		
		result = (num < 10) ? "000" + num : (num < 100) ? "00" + num : (num < 1000) ? "0" + num : "" + num;
		System.out.printf("%d → %s\n", num, result);
		
	}
	
}
