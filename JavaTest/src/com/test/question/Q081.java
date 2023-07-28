package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		
		//파일이름에서 확장자 떼고 이름 떼고 했던거
		//subString으로 하는거랑 @를 구분자로 해서 split으로 해도 됨

	String email = "";
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("이메일: ");
	email = scan.nextLine();
		
	int index = email.indexOf("@");
	
	System.out.println("아이디: " + email.substring(0,index));
	System.out.println("도메인: " + email.substring(index + 1));
		
	}

}
