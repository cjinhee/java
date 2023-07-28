package com.test.question;

import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		
		//요구사항] 이름을 오름차순으로 정렬
		
		String name = "";
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("학생 수: ");
		String[] list = new String[scan.nextInt()];
		scan.nextInt();
		
		for (int i=0; i<list.length; i++) {
			
			System.out.print("학생명: ");
			name = scan.nextLine();
			list[i] = name;
		}
		System.out.println();
		
		sort(list);
		
		System.out.printf("입력한 학생은 총 %d명입니다.", list.length);
		
		for (int i=0; i<list.length; i++) {
			System.out.printf("%d. %s\n", i+1, list[i]);
		}
		
	}//main

	private static void sort(String[] list) {

		String temp = "";
		
		for(int i=0; i<list.length-1; i++) {
			for (int j=0; j<list.length-1-i; j++) {
				
				if(list[j].compareTo(list[j+1]) > 0 ) {
			
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		
		}
	}
}
