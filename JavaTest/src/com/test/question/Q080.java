package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		//글자를 하나씩 추출 끝에서부터 substring
		
		String txt1 = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("문장입력: ");
		txt1 = scan.nextLine();
		
		System.out.print("역순 결과: \" ");
		for(int i=txt1.length()-1; i>=0 ; i--) {
			System.out.println(txt1.charAt(i));
		}
		System.out.println("\"");
	}
}
