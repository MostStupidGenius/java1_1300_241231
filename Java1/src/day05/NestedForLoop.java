package day05;

public class NestedForLoop {
	public static void main(String[] args) {
//		이중 for문(중첩for문)
//		for문 안에 for문이 있는 구조를 의미한다.
//		일상예시: 시계
//		시, 분, 초
//		60초 = 1분
//		60분 = 1시간
//		24시간 = 1일
//		외부 for문 60분을 나타낸다.
		System.out.println("외부for문 시작");
		for (int i = 0; i < 10; i++) {
			System.out.println("내부for문 시작");
			System.out.printf("\n%2d분 시작\n", i);
//			내부 for문 60초를 나타낸다.
			for (int j = 0; j < 60; j++) {
				System.out.printf("%2d분 %2d초\n", i, j);
			}

		}

	}

}
