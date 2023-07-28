package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		
		//요구사항] 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현
		
		int userNum = 0;
		int comNum = 0;
		int i = 1;
		
		//난수생성
		
		comNum = (int)(Math.random()*10) +1;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		for(; i<=10; i++) {
			
			System.out.print("숫자: ");
			userNum = scan.nextInt();
			
			if (comNum == userNum) {
				System.out.println("맞았습니다.");
					break;
			} else {
			System.out.println("틀렸습니다.");
		}
			System.out.println();
	}
		System.out.println();
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",comNum);
		
		if (comNum == userNum) {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i);
		} else {
			System.out.println("모든 기회를 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}	
