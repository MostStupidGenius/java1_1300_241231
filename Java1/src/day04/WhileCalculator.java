package day04;

import java.util.Scanner;

public class WhileCalculator {

	public static void main(String[] args) {
//		고급 실습1
//		while문을 활용한 절차적인 계산기
//		입력을 받기 위한 스캐너
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		String oper = "", isContinue = "";
		
//		입력받는 값은 정수만 받는다.
		while(true) {
//			num1의 값이 0이면
			if(num1 == 0) {
	//			num1의 값을 입력받는다. 
				System.out.print("num1 입력: ");
				num1 = sc.nextInt();
			}
//			아니면 건너뛰기
			
//			System.out.println(num1);
//			연산자 입력 안내 후
			System.out.print("연산자 입력: ");
//			문자열로 연산자 입력받기
//			+, -, *, /
			oper = sc.next();
//			연산자가 비어있지 않다면 num2의 값을 입력받는다.
			if(oper != "") {
//				System.out.println(num1 + " " + oper);
				System.out.print("num2 입력: ");
				num2 = sc.nextInt();
			} else {
//				연산자가 비어있다면 반복문 탈출
				System.out.println("계산종료");
				break;
			}
//			연산자에 따라서 switch문으로 연산을 실행한다.
			switch(oper) {
//			연산결과를 num1에 담아 출력한다.
			case "+":
				num1 += num2; break;
			case "-":
				num1 -= num2; break;
			case "*":
				num1 *= num2; break;
			case "/":
				num1 /= num2; break;
			default:
				// 정상적이지 않은 연산자를 입력한 경우, continue
				continue;
			}
//			더 연산할지를 "Y"와 "N"으로 입력받는다.
			System.out.print("더 연산하시겠습니까?(Y/N): ");
//			입력한 문자열을 소문자로 바꾸는 함수 .toLowerCase()
			isContinue = sc.next().toLowerCase();
//			문자열의 동일 여부를 확인하기 위해서는
//			== 연산자가 아니라 .equals(비교할문자열)를 사용하여
//			값이 같은지를 비교해야 한다.
			if(isContinue.equals("n")) {
//				-> break 여부를 결정한다.
				System.out.println("연산을 종료합니다."); 
				break;
			}
//			연산을 더한다고 하면 내려가는 부분
			System.out.println("현재 연산 결과: " + num1);
		}
		System.out.println("연산 결과: " + num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
