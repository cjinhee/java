package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		
		//요구사항] 숫자2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		
		int n1 = 0;
		int n2 = 0;
		String op = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("연산자: ");
		op = scan.nextLine();
		
		if (op.equals("+")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 + n2);
		} else if (op.equals("-")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 - n2);
		} else if (op.equals("*")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 * n2);
		} else if (op.equals("/")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 / n2);
		} else if (op.equals("%")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 % n2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
	}
}
