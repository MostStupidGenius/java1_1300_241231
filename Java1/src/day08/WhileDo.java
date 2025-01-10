package day08;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
//		do~while문
//		일반 while문은 조건식을 먼저 검사하기 때문에
//		조건을 충족하지 않은 상태에서는 진입조차 할 수 없다.
//		하지만, 조건 없이 먼저 1회 실행 후, 반복을 들어갈 할 때도 있다.
//		이때 사용하는 것이 do~while문이다.
//		do{실행할 코드}while(조건식)
		Scanner sc = new Scanner(System.in);

//		입력받은 값이, 우리가 원하는 범위가 아니라면
//		다시 입력받도록 설정

//		입력받은 내용을 담을 변수
		String inputStr = "";
		int num = 0;

		
//		0부터 10 사이의 값을 입력하면 while문 탈출
		do {
			System.out.print("0부터 10사이의 값 입력");
			inputStr = sc.next();
//			입력받은 문자를 숫자형으로 변환
			num = Integer.parseInt(inputStr);
			
//			입력받은 숫자가 10보다 크거나 0 미만일 때
//			제대로 된 입력이 아니므로
//			while문 진입하여 새로 입력을 받는다.
		} while (num > 10 || num < 0);
		
		System.out.println(num);

	}

}








