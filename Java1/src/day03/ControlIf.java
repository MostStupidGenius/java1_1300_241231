package day03;

import java.util.Scanner;

public class ControlIf {

	public static void main(String[] args) {
//		조건문
//		if문
//		if(조건식) {조건식이 참일경우 실행할 코드들}
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 입력: ");
		int inputNum = sc.nextInt();
		
//		입력받은 정수의 값이 10보다 크다면
//		if(inputNum > 10) {
//	//		"10보다 큽니다" 출력
//			System.out.println("10보다 큽니다.");
//		}
		
//		if~else문
//		조건식이 만족하지 않았을 경우에도
//		코드를 실행하고 싶을 수 있다.
//		이때, else문을 사용하여
//		조건식이 거짓일 경우에 실행할 코드를
//		작성할 수 있다.
//		-> if문의 코드블록을 실행하거나
//		else문의 코드블록을 실행하거나
//		둘 중 하나는 반드시 실행된다.
		
//		입력받은 값이 0보다 크다면
//		if(inputNum > 0) {
////			"양수입니다" 출력
//			System.out.println("양수입니다.");
//		} else { // 조건식을 만족하지 않는다면
////			"0이거나 음수입니다" 출력
//			System.out.println("0이거나 음수입니다.");
//		}
		
//		삼항연산자를 if~else문으로 풀어쓰기
		System.out.print("정수 입력2: ");
		int num2 = sc.nextInt();
//		int bigOne = inputNum > num2 ? inputNum : num2;
		
		int bigOne = 0;
//		if문으로 구현해보기
		if(inputNum > num2) {
			bigOne = inputNum;
		} else {
			bigOne = num2;
		}
		System.out.println("더 큰 값은 " + bigOne + "입니다.");
		
		System.out.println("=========if~else if~else=========");
		
//		여러 조건식을 검사하고 싶을 때,
//		if~else를 중첩해서 적을 수 있다.
//		첫번째 조건식을 검사했을 때
//		참이라면 해당 코드 블록을 실행하고 if문이 종료된다.
		if(inputNum > num2) {
			System.out.println("inputNum이 크다.");
//		만약 첫번째 조건식이 거짓일 때
//		두번째 조건식을 검사한다.
		} else if(inputNum == num2) {
//			첫번째 조건식이 거짓이면서
//			두번째 조건식이 참이면
//			해당 코드 블록이 실행된다.
			System.out.println("두 값은 같다.");
//		위에서 검사한 모든 조건식이 거짓이면
//		else문의 코드 블록이 실행된다.
		}else {
			System.out.println("num2가 크다.");
		}
		
//		다른 표현:
//			가장 먼저 참이 되는 조건식의 코드 블록을 실행한다.
		
//		마지막의 else문은 선택적으로 사용하면 된다.
		
		
		
		
		
	}

}
