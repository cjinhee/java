package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		// 요구사항 ] 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력
		//루프를 돌면서 파일명 받기 확장자까지 같이 입력
		// 각 확장자 별로 총 몇개 있는지 count , 누적변수 만들어야함 (미리)
		//입력받은 데이터에 끝나는 부분이 뭔지 알아내서 누적변수에 넣기
		
		String file = "";
		int sumMp3 = 0;
		int sumJpg = 0;
		int sumJava = 0;
		int sumHwp = 0;
		int sumDoc = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("파일명: ");
			file = scan.nextLine();
			
			int index = file.lastIndexOf(".");
			
			if(file.substring(index).equals(".mp3")) {
				sumMp3++;
			}else if(file.substring(index).equals(".jpg")) {
				sumJpg++;
			}else if(file.substring(index).equals(".java")) {
				sumJava++;
			}else if(file.substring(index).equals(".hwp")) {
				sumHwp++;
			}else if(file.substring(index).endsWith(".doc")) {
				sumDoc++;
			}
		}
		
		System.out.printf("mp3: %d개\n", sumMp3);
		System.out.printf("jpg: %d개\n", sumJpg);
		System.out.printf("java: %d개\n", sumJava);
		System.out.printf("hwp: %d개\n", sumHwp);
		System.out.printf("doc: %d개\n", sumDoc);
		
	}
}
