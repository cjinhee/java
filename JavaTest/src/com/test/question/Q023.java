package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
		//요구사항] 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력
		
	
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("아빠 생일(년): ");
		int fbYear = scan.nextInt();
		
		System.out.print("아빠 생일(월): ");
		int fbMonth = scan.nextInt();
		
		System.out.print("아빠 생일(일): ");
		int fbDate = scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		int dbYear = scan.nextInt();
		
		System.out.print("딸 생일(월): ");
		int dbMonth = scan.nextInt();
		
		System.out.print("딸 생일(일): ");
		int dbData = scan.nextInt();
		
		System.out.println();
		//생일 날짜 생성
		Calendar fatherBirth = Calendar.getInstance();
		fatherBirth.set(fbYear, fbMonth - 1, fbDate);
		
		Calendar daughterBirth = Calendar.getInstance();
		daughterBirth.set(dbYear, dbMonth - 1, dbData);
		
		//생일 날짜 틱 생성
		long fathertick = fatherBirth.getTimeInMillis();
		long daughtertick = daughterBirth.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", (daughtertick - fathertick )/ 1000/60/60/24);
		
	}
}
