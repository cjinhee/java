package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {
	
	public static void main(String[] args) {
		
		
		
		/*
		
		
			배열, Array
			- 자료 구조
			- 자료형 > 참조형
			- 집합 > 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형 
			- 같은 자료형 / 같은 성격 > 집합 
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7()
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
		//q64();
		//q65();
		//q67();
		q68();
		
	}//main
	
private static void q68() {
		
		//배열의 요소를 삭제하시오.
		
		//배열 요소 삭제 > Left Shift 발생
		
		int[] nums = { 5, 6, 1, 3, 2, 8, 7, 10, 4, 9 };
		
		int index = 2;
		
		System.out.println(Arrays.toString(nums));
		
		for (int i=index; i<nums.length-1; i++) {
			
			//왼쪽방 = 오른쪽방
			nums[i] = nums[i+1];
			
		}
		
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void q67() {
		
		//배열에 요소를 삽입하시오.
		
		//배열 삽입 > Right Shift 구현(발생)
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[] { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };
		
		System.out.print("삽입 위치: ");
		int index = scan.nextInt();
		
		System.out.print("값: ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//Right Shift
		for (int i=nums.length-2; i>=index; i--) {
			//오른쪽방 = 왼쪽방
			nums[i+1] = nums[i];
			System.out.println(Arrays.toString(nums));
		}
		
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
		
		
	}

	private static void q65() {
		
		//중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		int[] lotto = new int[6];
		
		for (int j=0; j<5; j++) {
		
			for (int i=0; i<lotto.length; i++) {
				
				int n = (int)(Math.random() * 45) + 1;
				
				if (isDuplicate(lotto, n)) {
					i--;
				} else {
					lotto[i] = n;
				}
				
			}// for i
			
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
		
		}// for j
		
		
		
	}

	private static boolean isDuplicate(int[] lotto, int n) {
		
		for (int i=0; i<lotto.length; i++) {
			
			if (lotto[i] == n) {
				
				return true;
			}
			
		}
		
		return false;
	}

	private static void q64() {
		
		//1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		
		int max = 0;
		int min = 21;
		
		int[] nums = new int[20];
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;	
		}
		
		System.out.println(Arrays.toString(nums));
		
		//각각의 값을 max|min과 비교해서 처리
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i] > max) {
				max = nums[i];
			}
			
			if (nums[i] < min) {
				min = nums[i];
			}
			
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
		
	}

	private static void m13() {
		
		int[] nums = {5, 3, 1, 4, 2};
		
		Arrays.sort(nums);//Quicksort implementations. > 퀵정렬, 안정성이 높음
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m12() {
		
		//정렬
		// - 요소간의 크기 비교 > 재배치
		
		//1. 오름차순
		// a. 숫자: 작은 수 > 큰 수
		// b. 문자열: 문자코드값 순으로
		// c. 날짜시간: 미래 > 과거
		
		//정렬 구현
		//1. 개발자 구현
		//2. JDK or Library
		
		//버블 정렬
		//오름차순정렬
		int[] nums = {5, 3, 1, 4, 2};
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for (int i=0; i<nums.length-1; i++) {//0,1,2,3 > cycle
			
			for(int j=0; j<nums.length-1-i; j++) { //비교 후 스왑하는 작업_cycle 내에 비교하는 횟수
				
				if (nums[j] > nums[j+1]) { //오름차순 _// 내림차순 하려면 < 이렇게 사용
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			
		}//for
		
		System.out.println(Arrays.toString(nums));
		
  } //m12
		
		
		


	private static void m11() {
		
		
		// 배열 초기화 리스트
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));
		
		//초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		System.out.println(Arrays.toString(nums));
		
		//초기화 리스트
		int[] nums2 = new int[] {100, 200, 300};
		System.out.println(Arrays.toString(nums2));

		int[] nums3 = {100, 200, 300};
		System.out.println(Arrays.toString(nums3));
		
		String[] names1 = new String[3];
		
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";
		
		String[] names2 = {"홍길동", "아무개", "하하하"};
		
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));

		
	}//m11

	private static void m10() {
		
		
//		int a; //null 값이 없으니깐
//		
//		System.out.println(a);
		
		//배열 자동 초기화
		//- 배열(참조형)은 생성 직후에 자동으로 초기화가 된다.
		
		//초기화 규칙
		//1. 정수배열 > 0
		//2. 실수배열 > 0.0
		//3. 문자배열 > \0(null)
		//4. 논리배열 > false
		//5. 참조형배열 > null
		
		int[] nums = new int[3];//int x 3
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums));
		
		double[] nums2 = new double[3];
		System.out.println(Arrays.toString(nums2));
		
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1));
		
		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));
		
		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
	}//m10

	private static void m9() {
		
		//유틸리티 클래스
		//- int > Integer
		//- double > Double
		
		//Arrays 클래스
		//- 배열 유틸리티 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열의 상태가 궁금? > 출력!
		printArray(nums);
		
		//덤프(dump): 객체의 상태를 하나의 문자열로 풀어내는 행동
		System.out.println(nums); //[I@7d6f77cc > 해시코드
		
		System.out.println(Arrays.toString(nums)); //리턴값 : 문자열, 배열을 문자열로 변환
		
		//깊은 복사 메소드
		
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 1000;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
		
		
	}//m9
	//출력하고싶은 변수를 매개변수로 출력
	
	public static void printArray(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
	}
	

	private static void m8() {

		//배열 복사
		//1. 얕은 복사, Shallow Copy
		// - 주소값 복사
		// - Side Effect발생
		
		//2. 깊은 복사, Deep Copy
		// - 요소 복사
		// -Side Effect 없음
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for(int i=0; i<nums.length; i++) {
			
			//배열을 배열에 복사하는 것이 아님 
			//int = int _ int 변수를 int 변수에 카피, 값형끼리의 복사는 Data가 복사 됨
			copy[i] = nums[i]; 
		}
		
		nums[0] = 1000;
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
	}

	private static void m7() {
		
		//배열 복사
		
		
		//값형에서만 발생(값형끼리 복사할 때, 원본과 복사본이 서로 영향을 주지 않음) > Side Effect가 발생하지 않는다.
		int a = 10;
		int b;
		
		b = a;
		
		//원본 수정 > 복사본에게 영향을 미치는지 확인?
		
		a = 20;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println();
		
		//***개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
		
		int n = 10; //참조변수를 만들었음 , 주소값을 복사
		
		//new라고 같이 나오는 애들은 heap에 잡힌다
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy;
		
		//int[] = int[]
		//*** 배열 변수끼리의 복사는 주소값 복사다
		copy = nums;
		
		//원본 수정
		//***nums와 copy는 같은 주소값을 가지고, 같은 배열을 가리킨다. > 둘 중 하나를 조작하면 나머지 배열도 영향을 받는다. > Side Effect가 발생한다. > 조심!!
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
		
		
	}//m7

	private static void m6() {
		
		//배열의 길이는 런타임 때 정할 수도 있다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int count = scan.nextInt();
		
		
		int[] kors = new int[count];
		
		System.out.println(kors.length);
		
		
	}//m6

	private static void m5() {
		
		//*** 메모리의 공간은 한번 할당되면, 절대(100%)로 공간을 더 늘리거나 줄일 수 없다.
		
		int n;//4byte
		
		//*** 배열은 처음부터 사용하는 최대 길이를 미리 예측 ! > 나중에 수정 불가능!
		
		int[] nums = new int[3]; //4byte x 3 = 12byte
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//갑자기 방이 하나 더 필요함!
		//nums[3] = 400;//100%불가능
		
	}//m5

	private static void m4() {
		
		//각 자료형
		
		//정수 배열(byte,short,int,long)
		long[] list1 = new long[5];
		list1[0] = 0;
		System.out.println(list1[0]);
		
		//실수 배열
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//Calendar c1;
		
		//Calendar c1 = Calendar.getInstance();
		
		//캘린더 x 5개 생성한 것이 아님, 캘린더 저장변수를 5개 생성한 것임
		Calendar[] list6 = new Calendar[5]; 
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]);
		
		
	}//m4

	private static void m3() {
		
		int[] nums = new int[3];
		
		//길이(방의 개수): 3
		//인덱스(방 번호): 0 ~ 2, 0 ~ 길이-1
		//방 1개(데이터): 요소(Element)
		//방번호를 잘못적는 실수 
		
												//방번호를 없는것을 쓴 것임
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
		//nums[3] = 400;
		
		//입력
		//배열의 방을 원하는 순서대로 접근 > 탐색 > for문으 많이 사용
		for (int i=0; i<nums.length; i++) {
			
			nums[i] = i;
		}
		 
		
		//출력
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
	}//m3

	private static void m2() {
		
		// 요구사항] 학생 3명(변수 3개 만들기) > 국어 점수 > 총점, 평균(실수)
		// 추가사항] 학생 수 증가 > 300명
		
		//배열 선언하기(생성하기)
		// - 자료형[] 배열명 = new 자료형[길이];
		
		int[] kors = new int[300]; //변수를 한번에 세개 잡음
		
		//배열의 방 갯수 == 배열의 길이 
		System.out.println(kors.length);
		
		//int = int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		//int total = kors[0] + kors[1] + kors[2];
		int total = 0;
		
		            //kors.length로 쓰면 됨
		for (int i=0; i<300; i++) {
			total += kors[i];
		}
		            //(double)total / kors.length로 바꿔쓰면 됨
		double avg = total / 300.0;
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);		
		
		
		
		
	}//m2

	private static void m1() {
		
		// 요구사항] 학생 3명(변수 3개 만들기) > 국어 점수 > 총점, 평균(실수)
		// 추가사항] 학생 수 증가 > 300명
		int kor1;
		int kor2;
		int kor3;
		//+297개 더 만들어야함 
		
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297번 초기값 입력 필요
		
		int total = kor1 + kor2 + kor3; //297번 더하는걸 입력해야함
		
		double avg = total / 3.0; // 캐스팅 연산자 쓰는거보다 실수 상수를 사용
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
		
	}//m1

}
