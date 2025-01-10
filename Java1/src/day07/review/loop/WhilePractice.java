package day07.review.loop;

public class WhilePractice {

	public static void main(String[] args) {
//		while문 실습
//		int idx를 선언하여 0으로 세팅
		int idx = 0;
//		while문의 조건으로 idx가 100보다 작은 경우에만 반복 실행
		while(idx < 100) {
			if(idx < 100) break;
//			idx값을 1씩 증가시켜라
			idx++;
			
//			while문 내부에서 idx % 7 == 0의 조건이 만족하면
			if(idx % 7 == 0) {
//				줄바꿈 추가
				System.out.println();
//				다음 반복으로 이동 continue
				continue;
			}
//			그외의 경우 해당 idx 값을 print로 공백문자" "를 뒤에 붙여
//			출력하라 print(idx + " ");
			System.out.print(idx + " ");
		}
	}

}
