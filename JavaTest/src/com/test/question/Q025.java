package com.test.question;

import java.util.Scanner;

public class Q025 {

	public static void main(String[] args) {
		
		//요구사항] 숫자 2개를 입력 받아 큰수와 작은수를 출력
		
		int max = 0;
		int min = 0;
		int gap = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
	
		gap = max - min;
		
		if (max != min) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", max, min, gap);
		} else {
			System.out.printf("두 숫자는 동일합니다.");
		}
	}
	
}
