package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////		for문을 이용한 구구단 출력
////		2단만 출력
//		int dan = 5;
////		System.out.print("양수 입력: ");
////		dan = sc.nextInt();
//		System.out.println("====" + dan + "단 출력====");
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " x " + i + " = " + (dan * i));
//		}
		
//		for문을 이용하여 0부터 10까지의 총합을 출력해보자
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
//		sum = sum + 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
		
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
