package com.test.question;

public class Q042 {

	public static void main(String[] args) {
		
	
		//요구사항 ] 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오 / calendar클래스 사용 금지
	
		int year = 2023;
		int month = 7;
		int date = 25;
		
		int sum = 0; // 누적 변수 (총 며칠째)
		String day = ""; //요일
		
		//패턴을 잡아서 덩어리로 해결
		
		//1. 1년 1월 1일 ~ 2022년 12월 31일
		
		for (int i=1; i<year; i++) {
			
			sum += 365;
			
			if (isLeafYear(i)) {
				sum++;
			}
			
		}
		
		//2. 2023년 1월 1일 ~ 2023년 6월 30일
		for (int i=1; i<month; i++) {
			
			sum += getMaxDate(year,month); {
				//해당월의 최대 날짜, 메소드를 뺄때 월만 뺴면 안됨 연도도 같이 뺌
			}
			
			//3. 2023년 7월 1일 ~ 2023년 7월 25일
			
			sum += date;
		
		
			//4.검증 및 요일 구하기
			day = getDay(sum);
			
		}
		System.out.printf("2023년 7월 25일은 %,d일째 되는 날이고 %s입니다.\n", sum , day);
		
		
		
		
	}//main
		
		private static String getDay(int sum) {
		
			if (sum % 7 == 1) {
				return "월";
			} else if (sum % 7 ==2) {
				return "화";
			} else if (sum % 7 ==3) {
				return "수";
			} else if (sum % 7 ==4) {
				return "목";
			} else if (sum % 7 ==5) {
				return "금";
			} else if (sum % 7 ==6) {
				return "토";
			} else if (sum % 7 ==7) {
				return "일";
			}
			
		return null;
	}

		//메소드 이름 패턴
		//1. set XXX
		//2. get XXX
		//3. is XXX boolean 값을 가져옴
		
		
		
		
		
		//m1();
	
	
	 
		private static int getMaxDate(int year, int month) {
		
			switch (month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					return 31;
				case 4: case 6: case 9: case 11:
					return 30;
				case 2:
					return isLeafYear(year) ? 29 : 28;
			}
			
			
			
			
		return 0;
	}

		
		
		
		
		
		
		//윤년 검사
		private static boolean isLeafYear(int year) {
		
			if(year % 4 == 0) {
				
				if(year % 100 == 0) {
					
					if(year % 400 == 0) {
						return true;
					}else {
						return false;
					}
					
				} else {
					return true;
				}
				
			} else {
				return false;
			}			
	}


}
