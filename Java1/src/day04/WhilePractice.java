package day04;

public class WhilePractice {

	public static void main(String[] args) {
//		반복문
//		while문
		/* while(조건식){
		 * 		조건식이 만족하는 동안(while)
		 *		무한히 반복할 코드 블록
		 * }
		 * while문은 조건식이 false가 될 때까지
		 * 혹은 break문을 통해서 while문을 탈출할 때까지
		 * 해당 코드 블록이 무한히 반복 실행된다.
		 * 때문에 몇 번 반복할지 아무도 모를 때 while문을
		 * 사용한다.
		 * 
		 */
//		반복 횟수를 기록할 변수
		int index = 0;
//		while문 시작
		while(index < 10) {
//			index의 값이 10보다 작은 동안
//			코드 블록 무한 반복
			
			index++; // index 값 증가
			if(index == 4) {
//				아래 코드를 실행하지 않고 다음 반복으로 이동
//				4를 출력하지 않고 건너뜀.
				continue;
			}
//			인덱스값 출력
			System.out.println("index: " + index);
			if(index == 6) {
				System.out.println("index가 6이 되어 종료");
//				break는 가장 가까운 switch문이나
//				반복문을 탈출한다.
				break;
			}
		}
	}

}
