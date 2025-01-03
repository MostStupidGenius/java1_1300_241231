package day02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
//		입력문
//		사용자로부터 입력을 받기 위해서는
//		Scanner라는 클래스를 사용해야 한다.
//		외부 클래스를 사용하려면 import로 불러와야 한다.
//		ctrl + shift + O
		Scanner sc = new Scanner(System.in);
		
//		sc를 이용해서 값을 입력받기
//		이때, 입력받을 값의 종류를 정해야 한다.
//		.next로 시작하는 대부분의 메서드는
//		공백문자 또는 줄바꿈(엔터)으로 
//		값이 서로 구분되어 입력된다.
		
//		1. 숫자형으로 입력을 받아보자.
//		int 타입으로 값을 입력받는 메서드
//		입력 안내를 위한 출력문 작성
		System.out.print("정수 입력: ");
		int inputNum = sc.nextInt();
//		inputNum = inputNum * 3;
		System.out.println(inputNum);
		
//		2. 다른타입으로 값 입력받기
//		2-1.담고자 하는 타입으로 변수를 먼저 선언한다.
//		2-2. 그 다음에 담을 값으로 sc.next를 입력하고
//		ctrl + space bar로 자동완성을 본다.
		float inputFloat = sc.nextFloat();
		System.out.println(inputFloat);
		
//		alt + shift + R을 이용해서 변수명 일괄변경
		
		sc.nextLine(); // 위에서 입력받은 Enter 상쇄
		
//		3. 문자열 그대로 입력받기
//		.nextLine()
//		줄바꿈(엔터)를 입력하기 전까지의
//		모든 내용을 하나의 문자열에 담아 전달한다.
		System.out.print("문자열 입력: ");
		String inputStr = sc.nextLine();
		System.out.println(inputStr);
		
		System.out.print("숫자 입력2: ");
		int inputNum2 = Integer.parseInt(sc.nextLine());
		inputNum2 = inputNum2 + 10;
		System.out.println(inputNum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
