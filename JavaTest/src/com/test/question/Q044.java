package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		
		//요구사항] 숫자 n개를 입력받아 아래와 같이 출력하시오. 
		//조건] 누적값이 100을 넘어가는 순간 루프 종료, 짝수는 더하고 홀수는 빼시오
		
		int sum = 0;
		int num = 0;
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				sum += num;
				txt += " + " + num;
			} else {
				sum -= num;
				txt += " - " + num;
			}
		 if (sum >= 100) {
			break;
		}
		}
	System.out.printf(txt + " = " + sum);
	}
}