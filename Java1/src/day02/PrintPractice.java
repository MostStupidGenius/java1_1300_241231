package day02;

public class PrintPractice {
	public static void main(String[] args) {
//		출력문
//		프로그램이 실행되는 동안 변하는 값이나
//		확인하고자 하는 값을 콘솔창에 출력하는 기능을
//		수행하는 함수를 의미한다.
		
//		1. 한 줄을 출력
//		System.out.println()
//		아무것도 소괄호() 안에 넣지 않으면
//		콘솔창에 줄바꿈만 출력한다.
//		혹은 전달한 값을 마지막에 줄바꿈을 추가하여
//		콘솔창에 출력한다.
		System.out.println("마지막에 줄바꿈 있어요.1");
		System.out.println();
		System.out.println("마지막에 줄바꿈 있어요.2");
		
//		2. 줄바꿈 없이 한 줄 출력
//		System.out.print();
//		빈 소괄호()를 사용할 수 없으며,
//		전달한 값을 줄바꿈 없이 이어서 출력한다.
		System.out.print("첫문장");

		// 개행문자 \n
		// 문자열 출력에 있어서 줄바꿈을
		// 특수한 방식으로 나타낸 것이다.
		System.out.print("문장2\n");
		// 탭 문자 \t
		// 텍스트 입력에 있어서
//		눈에 보이지 않는 칸이 나눠져 있다.
//		이러한 칸에서 칸으로 이동하는 문자가 tab문자이며
//		tab을 명령어로써 나타내는 특수문자가 \t이다.
		System.out.print("문\t장3\n");
		
//		\ 백슬래시
//		문자열 내에서 특수한 목적으로 사용되는 특수기호다.
//		이를 escape문자라고 부른다.
//		이 이스케이프 문자를 사용하면, 작은따옴표, 큰따옴표
//		줄바꿈, 탭문자 등등 여러가지 특수한 기능이 있는 문자를
//		단순히 표현하기 위한 문자로 바꾸거나 
//		특수한 기능을 수행하게 할 수 있다.
		System.out.println("\""); // 문자 "를 표현한 코드
		
//		3. 포맷팅 방식으로 줄바꿈 없이 한 줄 출력
//		포맷팅 방식이란, 변수에 담긴 값을
//		문자열 안의 특정 위치에 값으로써
//		표현하고자 할 때 사용하는 방식을 이른다.
		System.out.printf(
				"제 이름은 %s이고 %d살입니다.", 
				"홍길동", 
				30);
		
//		printf에서 사용되는 %s, %d 등의 표현방법을
//		서식문자라고 부르며,
//		문자열은 %s
//			String의 앞글자 s
//		정수형은 %d
//			십진수(decimal)의 앞글자 d
//		실수형은 %f
//			float의 앞글자 f
//		문자형은 %c
//			character의 앞글자 c
//		printf의 사용방법은
//		printf()의 첫번째 값으로 문자열을 전달하면서
//		그 안에 서식문자(%d, %s 등)를 넣어서
//		해당 서식문자 위치에 넣을 값을
//		printf()의 두번째 값부터 순서대로 넣는다.
		
		System.out.println();
		
//		예시
		int num = 1;
		double numDouble = 3.3;
		char charVal = '빵';
		String strVal = "strings";
		
//		위 값들을 printf로 출력
		System.out.printf(""
//				%3d는 정수의 3번째 자릿수까지
//				자릿수가 채워지지 않더라도
//				동일한 너비로 내용이 표시되도록
//				정렬하는 것을 의미한다.
				+ "num is %3d"
				+ "\n"
//				%.2f는 소숫점 아래 자릿수를
//				2자리로 제한함을 의미한다.
				+ "numDouble is %.1f"
				+ "\n"
				+ "charVal is %c"
				+ "\n"
				+ "strVal is %s\n",
				num, numDouble, charVal, strVal
				);
		
//		출력문을 사용하는 이유
//		1. 프로그램 동작 중 발생하는 오류의 위치를 특정하기 위해
//			1-1. 어디까지 프로그램이 정상적으로 동작했는지
//				점검하기 위해
//		2. 특정 변수의 값을 확인하기 위해
//		3. 입력을 받아야 할 때, 어떤 값을 입력해야 하는지
//		사용자에게 안내할 때
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
