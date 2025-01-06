package day04;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
//		실습1
//		스캐너를 이용해서 값을 입력받는데,
		Scanner sc = new Scanner(System.in);
		int inputNum = 1;
//		while문 안에서 
//		while(inputNum > 0) { // 조건식을 while문에서 검사
		while(true) { // 일단 반복문 진입
//			sc.nextInt()로 값을 입력받아 inputNum에 담고
			System.out.println("정수 입력: ");
			inputNum = sc.nextInt();
//			그 값을 확인하여 inputNum이 양수가 아니면
			if(inputNum <= 0) {
				// while문 탈출
				System.out.println("양수가 아니라 탈출");
				break;
			}else {
				// 양수면 출력한다.
				System.out.println("양수: " + inputNum);
			}
		}
		
		
		
		
//		while문을 탈출한다.
//		실습2
//		위 코드를 활용해서 입력받은 모든 양수를 더하여
		inputNum = 1;
		int sum = 0;
		while(true) {
			System.out.print("정수 입력: ");
			inputNum = sc.nextInt();
			if(inputNum <= 0) {
//			양수가 아닌 값이 입력되었을 때
				break; // 탈출
			}
//			양수면 sum에 inputNum 추가
			sum += inputNum;
		}
//		모두 더한 결과값을 출력
		System.out.println("합계: " + sum);
	}

}
