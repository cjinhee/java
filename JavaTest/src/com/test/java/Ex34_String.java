package com.test.java;

import java.util.Scanner;

public class Ex34_String {

	private static Object m8;

	public static void main(String[] args) {
		
		
		//문자열, String
		//- JDK 제공하는 문자열 조작 기능
		//
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
	    //m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
	}//main

	private static void m13() {
		
		// 문자열 분리
		// String[] split(String delimiter)
		//- 구분자를 기준으로 쪼개는 메소드
	
		String name = ",홍길동,아무개,,유재석,강호동,박명수,"; //끝나는것만 안만들고 나머지는 다 만들어줌
		
		String[] temp = name.split(","); //구분자는 사라진다.
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(i + ":" + temp[i]);
		}
	
	
	
	
	}//m13

	private static void m12() {
		
		//문자열 치환(바꾸기)
		//- String replace(String old, String new)
		//- 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다. 안녕하세요. 홍길동입니다.";
		
		int index = txt.indexOf("홍길동");
		
		String temp1 = txt.substring(0, index); //"안녕하세요."
		String temp2 = txt.substring(index + 3); //"입니다."
		
		System.out.println(temp1 + "아무개" + temp2);
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		txt = "   하나   둘   셋   ";
		System.out.println(txt.trim());
		//***replace로 무언가를 삭제하고 싶으면.. 찾아서 ""로 교체하면 된다. 
		System.out.println(txt.replace(" ","")); //제거는 빈문자열로. 
		
		
	}//m12

	private static void m11() {

		//문자열 검색
		//- indexOf(), lastIndexOf()
		//- startsWith(), endsWith()
		
		//- boolean contains(String)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
						
		
	}//m11

	private static void m10() {
		
		
		//문자열 추출  charAt
		//- String substring(int beginIndex, int endIndx)
		//- String substring(int beginIndex) _리턴 값이 String. 여러글자를 한번에 추출
		//- beginIndex: 포함(inclusive)
		//- endIndex: 미포함(exclusive)
		
		//***자바에서는 범위를 나타낼 때 > 시작(포함) ~ 끝(미포함)
		//Math.random() > 0~1 사이 난수(0~0.9999999999999까지)
		String txt = "가나다라마바사아자차카타파하";
		
		//범위를 추출
		System.out.println(txt.substring(3, 7)); //3번째 위치에서 7번째 위치까지 잘라서 추출_4글자를 추출
		System.out.println(txt.charAt(5)); //'바'> 문자코드값 변환O _한글자만 가져옴
		System.out.println(txt.substring(5,6)); //"바" > 문자코드값 변환X _한글자와 여러글자 가져옴, 문자열이 취급하기 쉬움
		System.out.println(txt.substring(3)); //라마바사아자차카타파하_ endIndex가 없으면 시작하는 곳부터 끝까지 추출하라고 받아들임
		System.out.println();
		
		//주민등록번호
		String jumin = "970728-1012345";
		
		//성별?
		System.out.println(jumin.charAt(7)=='1' ? "남자" : "여자");
		System.out.println(jumin.substring(7,8).equals("1") ? "남자" : "여자"); //_ 숫자연산자는 equals라고 사용
		
		//몇년생?
		//'9'(57) + '7'(55) = 122 _문자열 숫자로 더해짐
		System.out.println(""+ jumin.charAt(0) + jumin.charAt(1)); //112 , '9' + '7' /""이거 사용하면 숫자가 나옴
		//두글자 이상 추출할 일 있으면 substring 사용
		System.out.println(jumin.substring(0,2));
		
		//몇월생?
		System.out.println(jumin.substring(2,4));
		
		//몇일생?
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		String path = "C:\\class\\java\\Javatest\\Ex33_Array.java";
		
		//1. 파일명 추출 > "Ex33_Array.java"
		int index = path.lastIndexOf("\\");
		
		String filename = path.substring(index + 1);
		System.out.println(filename);
		
		//2. 확장자 없는 파일명 추출 > "Ex33_Array"
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index); 
		System.out.println(filenameWithoutExtension);
		
		//3. 확장자 추출 > ".java"
		String extension = filename.substring(index);
		System.out.println(extension);
		
		
	}//m10

	private static void m9() {
		
		
		// 패턴 검색
		//- boolean startsWith(String)
		//- boolean endsWith(String)
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바")); //true_해당 문자열이 이 키워드로 시작하냐고 질문
		System.out.println(txt.startsWith("프로그래밍")); //false
		
		System.out.println(txt.endsWith("자바")); //false
		System.out.println(txt.endsWith("프로그래밍")); //true
		
		String name = "홍길동";  //아래 셋 다 같은 값 true
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length() -1);
		System.out.println();
		
		//파일 경로
		String path = "C:\\class\\java\\Javatest\\Ex33_Array.java";
		
		//해당 파일이 '자바 소스 파일'입니까? > 확장자 검사
		
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}
		
		
	}//m9

	private static void m8() {
		

		//대소문자 변경 메소드
		//- String toUpperCase() _대문자
		//- String toLowerCase() _소문자

		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		//대소문자 구분(case sensitive)
		//- 정확도 높음
		//- 검색율 낮음
		if(content.indexOf(word) > -1 ) {
			System.out.println("결과 O ");
		}else {
			System.out.println("결과 X");
		}
		System.out.println();
		
		//대소문자 구분X(Case insensitive)
		//- 정확도 낮음
		//- 검색율 높음
		if(content.toUpperCase().indexOf(word.toUpperCase()) > -1 ) {
			System.out.println("결과 O ");
		}else {
			System.out.println("결과 X");
		}
		
		
		
	}//m8

	private static void m7() {
		
		// 주민등록번호 > '-' 기입
		String jumin = "970728-2012345";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		if(jumin.indexOf("-") == 6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		
		//게시판 글쓰기 > 관리자 > 금지어!
		
		String word = "바보";
		String content = "안녕하세요. 반갑습니다~ 자바를 공부하고 있어요.";
		
		if(content.indexOf(word) > -1) { //금지어가 발견 -1
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행~");
		}
		
		//금지어 개수를 늘린다. 배열 사용
		String[] words = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		
		for (int i=0; i<words.length;i++) {
			if(content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			} 
		}
		
	}

	private static void m6() {
		
		//문자열 조작
		//1. int length()
		//2. char charAt(int)_추출하고자하는 문자의 위치값
		//3. String trim()_좌우에 있는 공백을 제거
		
		//문자열 검색
		//- int indexOf(char)
		//- int indexOf(String)
		//- int indexOf(char, int)
		//- int indexOf(String, int)
		
		//- int lastIndexOf(char)
		//- int lastIndexOf(String)
		//- int lastIndexOf(char, int)
		//- int lastIndexOf(String, int)
	
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1;// _index를 찾는것이라 0번째일수도 있고 마지막 위치일수도 있는데 못찾더라도 숫자를 돌려줘야하는데 존재하지 않는 위치값을 돌려주는 것으로 표현//0으로 초기화시키지 말것
		
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf('김');
		System.out.println(index);
		
		index = txt.indexOf("홍길동");
		System.out.println(index); // 첫번째 문자의 위치를 반환
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다. 홍길동"; //홍길동 키워드 여러개 만들었음 //시작위치로 지정하는 오버로딩시킴
//		index = txt.indexOf("홍길동");
//		System.out.println(index); //7 _ 첫번째 홍길동
//		
//		index = txt.indexOf("홍길동", 10); //22
//		System.out.println(index); //7 _ 몇번을 찾더라도 첫번째 홍길동만 찾음
//		
//		index = txt.indexOf("홍길동" , 25); //38
//		System.out.println(index); 
		
		index = -1;
		
		//for (int i=0; i<3; i++) {   //홍길동이 몇번있는지 알고 있을때 
			
		while (true) { //조건을 만족하는동안 계속 돌음 , 횟수 모르면 무한루프 사용
			index = txt.indexOf("홍길동", index);
					
			if (index == -1 ) { //홍길동을 못찾았니?
				break;
			}
			index = txt.indexOf("홍길동" , index); 
			System.out.println(index); 
			
			index += 3;
		}
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		//검색방향: 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("홍길동")); //7
		
		//검색방향: 오른쪽 > 왼쪽
		System.out.println(txt.lastIndexOf("홍길동")); //22
		System.out.println(txt.lastIndexOf("홍길동", 21)); //7 _검색할 시작 위치를 지정해주면 됨
		
	}//m6

	private static void m5() {
		
		// 공백제거
		//- String trim()
		//- 문자열내의 공백(Whitespace > 스페이스, 탭, 개행)문자를 제거하는 메소드
		//- 문자열의 시작과 끝에 존재하는 공백을 제거한다.(***)
		
		
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
		
		
		
		
	}//m5

	private static void m4() {
		
		// 주민등록번호: 970727-1000001
		//하이픈을 꼭 적어주세요
		
		String jumin = "970727-1000001";
	
		System.out.println(jumin.charAt(6));
		
		if (jumin.charAt(6) == '-'){
			System.out.println("올바른 주민번호");
			
			if (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
		
		
	}//m4

	private static void m3() {
	
		//유효성 검사
		
		Scanner scan = new Scanner(System.in);
		
		//요구사항] 회원가입 > 아이디 입력 > 영어 소문자만 입력
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		//아이디: hong > 'h','o','n','g'
		
		for (int i=0; i<id.length();i++) {
			
			char c = id.charAt(i);
			//System.out.println(c);
			
			//영소문자가 아니냐?
			if (c < 'a' || c > 'z') {
				System.out.println("잘못된 문자가 발견되었습니다.");
				break; //잘못된게 하나라도 발견되면 탈출
			}
		}
		System.out.println("종료");
	}//m3

	private static void m2() {
		
		// 문자열 추출
		//- char charAt(int index)
		//- 자바: Zero-based Index
		
		//            01234567
		String txt = "안녕하세요. 홍길동입니다.";
		
		//Returns the char value at thespecified index. An index ranges from 0 to length() - 1. 
		char c = txt.charAt(3);
		System.out.println(c);
		
		c = txt.charAt(7);
		System.out.println(c);
		
		c = txt.charAt(13);
		System.out.println(c);
		
//		c = txt.charAt(14);
//		System.out.println(c);  =>없는 인덱스를 데려오면 에러가 남
		
		//마지막 문자
		c = txt.charAt(txt.length()-1);
		System.out.println(c);
		
	}

	private static void m1() {
		
		//문자열(String),문자(char)
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 조작 기능 == 배열 조작 기능 유사
		
		//문자열 길이
		//- int length()
		//- 문자열의 글자수
		
		//홍길동입니다.
		char[] clist = {'홍', '길', '동', '입', '니', '다', '.'};
		System.out.println(clist.length);
		
		String str = "홍길동입니다.";
		System.out.println(str.length());
		
		System.out.println("홍길동".length());
		
		System.out.println("A1가$ ".length());
		
		//요구사항] 회원가입 > 이름 입력 > 이름을 2자~5자이내로 작성하시오.
		//       -유효성 검사 (길이에 대한 유효성 검사)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if(name.length() >= 2 & name.length() <=5 ) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름을 2자~5자 이내로 작성하시오.");
		}
		
		
	}//m1

}


