package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		
		//요구사항] 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오
		
		int count = 0;
		int num = 0;
		int odd = 0;
		int even = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 횟수: ");
		count = scan.nextInt();
		
		for (int i=0; i <count; i++) {
			
			System.out.print("숫자: ");
			num =scan.nextInt();
			
			if(num % 2 == 0) {
				even++;
				evenSum += num;
			} else {
				odd++;
				oddSum += num;
			}
		
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n", odd, oddSum);
	}
}
