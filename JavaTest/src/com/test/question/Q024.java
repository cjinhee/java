package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
		
		//요구사항] 배달 음식을 같은 시간에 받기를 원한다. 각각 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수있는지.
		
		//변수 선언
		
		
		int hour = 0;
		int minute = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		hour = scan.nextInt();
	
		System.out.print("분: ");
		minute = scan.nextInt();
		
		//현재시각 객체 생성
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);
		
		now.add(Calendar.MINUTE, -10 );
		System.out.printf("짜장면: %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -8 );
		System.out.printf("치킨: %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
	
		now.add(Calendar.MINUTE, -7 );
		System.out.printf("피자: %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
	
	}
}
