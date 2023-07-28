package com.test.question;

import java.util.Scanner;

public class Q045 {

	public static void main(String[] args) {
		
		//요구사항] 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력
		//조건] 최대 3자리까지만 입력
		
		int numM = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 숫자: ");
		numM = scan.nextInt();
		
		if (numM < 1000) {
			
			for(int i = 1; i <= numM; i++) {
				System.out.println(clap(i) + "");
			}
			
			System.out.println();
		} else {
			System.out.println("1000 이하만 가능.");
		}
		
		
	}//main
	
	private static String clap(int i) {
		
		String temp ="";
		int n = i;
		
		for (; n > 0 ;) {
			if ( n % 10 % 3 == 0 && n % 10 != 0) {
				temp += "짝";
			}
			
			n /= 10;
		}
		
		if (temp.equals("")) {
			return i + "";
		} else {
			return temp;
		}
	}
}
