package com.test.question;

import java.util.Scanner;

public class Q048 {

	public static void main(String[] args) {
		
		//요구사항] 최대 9자리 정수를 입력받아 홀수 숫자합과 짝수 숫자합을 구하시오 //숫자 입력: 273645281
		// 조건: int 양수만 입력
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자 입력: ");
//		int num = scan.nextInt();
		
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		int num = 273645281; //27364528.1
		
		for (;;) {
			
			//System.out.println(num % 10);
			
			if(num % 10 % 2 == 0) {
				evenSum += num % 10;
				
			} else {
				oddSum += num % 10;
			}
			
			sum += num % 10;
			num = num / 10;
			
			if(num==0) {
				break;
			}
		
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
	}
}
