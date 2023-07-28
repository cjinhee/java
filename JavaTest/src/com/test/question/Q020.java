package com.test.question;

import java.util.Calendar;

public class Q020 {

	public static void main(String[] args) {
		
		//오늘 태어난 아이의 백일과 첫돌을 출력
		
		Calendar c1 = Calendar.getInstance();
		
		c1.add(Calendar.DATE, 100);
		
		System.out.printf("백일: %tF\n ", c1);
		
		
		c1 = Calendar.getInstance();
		
		c1.add(Calendar.YEAR, 1);
		
		System.out.printf("첫돌: %tF\n ", c1);
		
		
		
	}
}
