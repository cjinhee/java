package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		//요구사항] 숫자 5개를 입력받아 배열에 담은 뒤 역순으로 출력
		
		int num = 0;
		
		int[] nums = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<nums.length; i++) {
			
			System.out.println("숫자: "); 
			num = scan.nextInt();
			nums[i] = num;
		}
		for (int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
				
			
		}
	}
}
