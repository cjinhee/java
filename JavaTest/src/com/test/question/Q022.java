package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		
		//요구사항] 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력
		
	
		
		Calendar anni = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("남자 이름: ");
		String mname = scan.nextLine();
		
		System.out.print("여자 이름: ");
		String wname = scan.nextLine();
		
		System.out.print("만난날(년): ");
		int year = scan.nextInt();
		
		System.out.print("만난날(월): ");
		int month = scan.nextInt();
		
		System.out.print("만난날(일): ");
		int date = scan.nextInt();
		
		System.out.println();
		
		anni.set(year, month - 1, date);
		
		System.out.printf("'%s'과(와) '%s'의 기념일", mname, wname);
		System.out.println();
		
		
		anni.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", anni);
		
		anni.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", anni);
		
		anni.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", anni);
		
		anni.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", anni);
		
		anni.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", anni);
		
		
		
	}
}
