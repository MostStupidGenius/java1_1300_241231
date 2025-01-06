package day04;

import java.util.Scanner;

public class SwitchPractice {
	public static void main(String[] args) {
//		스위치문
//		case에 넣는 값은 상수여야 한다.
		/*
		 * switch(변수){ case 값1: 변수의 값이 값1일 경우 실행할 코드 case 값2: 값1일 때도 실행 값2일 경우 실행 }
		 */
		int num = 10;
		int dummy = 30;
//		상수 만드는 법
//		변수를 만드는 것과 동일하지만, 앞에 final을 붙여준다.
//		그리고 상수는 선언과 동시에 반드시 값을 대입해야 한다.
		final int sangNum = 20;
		switch (num) { // 
//			case dummy: // case에 변수를 넣으면 오류 발생
//				System.out.println("30입니다.");
		case sangNum: // case에 상수만 넣어야 한다.
			System.out.println("20이네요");
			break; // 위에서 아래로 흐르는 흐름을 끊고
		// 반복문이나 switch문의 밖으로 빠져나간다.
		case 10: // 직접 값을 넣을 수 있다.
			System.out.println("상수 10");
//				break;// break가 없으면 아래로 흘러내려
//				아래의 코드도 실행한다.
		default:
			System.out.println("어떤 경우도 아니네요");
		}

//		예시 ======================
//		상수는 모두 대문자로 적으며,
//		다른 단어가 나오면 이전 단어와 다음 단어 사이에
//		언더바_를 넣는다.
		final int GOLD = 1, SILVER = 2, BRONZE = 3, FREE = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Gold\n2. Silver\n" + "3. Bronze\n4. Free");
		System.out.print("숫자 입력: ");
		int grade = sc.nextInt();
//		스위치문으로 grade에 따라 혜택 내용 출력
		switch (grade) {
		// 골드
		// 실버의 혜택을 모두 가지며
		// 30곡 평생소장
		case GOLD:
			if (grade == GOLD) {
				System.out.println("골드 혜택");
			}
			System.out.println("30곡 평생 소장");
		case SILVER:
			// 실버
			// 브론즈의 혜택을 모두 가지며
			// 30곡 다운로드
			if(grade == SILVER) {
				System.out.println("실버 혜택");
			}
			System.out.println("30곡 다운로드");
		case BRONZE:
			// 브론즈
			// 30초 미리듣기 없음
			// 30곡 듣기(재생)
			if(grade == BRONZE) {
				System.out.println("브론즈 혜택");
			}
			System.out.println("30곡 듣기");
			break;
		// 무료 이용자
		// 30초 미리듣기
		default:
			System.out.println("무료 혜택");
			System.out.println("30초 미리듣기");
		}

	}

}
