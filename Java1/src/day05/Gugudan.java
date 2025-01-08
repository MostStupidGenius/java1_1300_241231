package day05;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
//		구구단을 이중 for문으로 구현해보기
//		===2단=== -> 도전과제1
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		2 x 9 = 18
//		===3단=== -> 도전과제1
//		3 x 1 = 3
//		3 x 2 = 6
//		...
//		9 x 9 = 81
//		도전과제2: 결과값 2칸으로 정렬하기
		for (int i = 2; i <= 9; i++) {
			System.out.printf("===%d단===\n", i);
			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d x %d = %2d\n", i, j, i * j);
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
//		심화 연습
//		단 입력을 받아서 해당 단부터 9단까지
//		구구단이 출력되게 하라
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		for (int i = dan; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
				System.out.println("i = " + i + "\nj = " + j + "\n" );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
