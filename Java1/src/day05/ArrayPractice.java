package day05;

public class ArrayPractice {

	public static void main(String[] args) {
//		배열
//		배열이란 같은 타입의 값을 여러개 넣을 수 있는
//		바구니같은 자료구조로,
//		그 길이, 크기, 개수는 고정이다 -> 고정길이
//		그래서 선언을 할 때, 길이를 정해서 넣거나
//		직접 값을 넣는 방식을 취해야 한다.

//		배열의 선언 - 1. 길이를 정해서 선언
//		정수형 배열 선언
		int[] arrInt = new int[10];
//		길이를 정해서 선언하는 배열은
//		값을 직접 넣지 않았기 때문에 초기값이 들어있지 않다.
//		때문에 자동으로 배열을 만들면서
//		자바에서 초기값을 설정해준다.
//		정수 0
//		실수 0.0
//		논리 false
//		문자 0번째 문자 '\0'
//		문자열 null
//		배열의 요소에 접근하는 방법
//		배열변수[인덱스]
		System.out.println(arrInt[9]);
//		배열의 길이를 가져오는 방법
//		.lenght
		System.out.println(arrInt.length);
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}

//		배열을 선언하는 방법 2. 직접 값을 넣는 방법

//		직접 값을 넣어 만드는 방법인데, 앞에 new int[]를
//		붙이지 않는 간소화된 방법이다.
//		때문에, 배열을 선언하면서만 사용할 수 있는 표현방법이다.
//		int[] arrInt2 = { 1, 5, 2, 4 };
		int[] arrInt2 = { 1, 5, 2, 4 };
		System.out.println("arrInt2[3]: " + arrInt2[3]);
//		arrInt2 = {3, 1, 2, 4};// 선언과 초기화를 따로 하면
//		오류가 발생한다.

//		위의 간소화된 방법과 반대의
//		정석적인 배열 선언 방법으로,
//		직접 값을 넣어 만드는 것 뿐만 아니라
//		배열 선언 후, 나중에 따로 배열을 만들어 넣는 것도
//		가능하다.
//		int[] arrInt3 = new int[]{ 1, 5, 2, 4 };
		int[] arrInt3 = new int[] { 1, 3, 2, 4 };
		System.out.println(arrInt3[2]);

//		arrInt3에 다른 배열을 선언하여 대입
		arrInt3 = new int[] { 1, 1, 1, 1 };
		System.out.println(arrInt3[2]);

		for (int i = 0; i < arrInt3.length; i++) {
			arrInt3[i] += i;
			System.out.println(arrInt3[i]);
		}

	}

}
