package day07.review.loop.programmers;

public class Solution120809 {

	public static void main(String[] args) {
//		테스트 케이스1
//		solution 함수에 테스트 케이스를 전달하여
//		그 결과를 result에 담는다.
		int[] result = solution(new int[] {1, 2, 3, 4, 5});
		
//		결과의 요소를 임시변수 i에 담아
		for (int i : result) {
//			공백문자 하나를 뒤에 붙여 한 줄로 출력한다.
			System.out.print(i + " ");
		}
//		다음 문제와 구분하기 위한 줄바꿈
		System.out.println();
		
//		테스트 케이스2
		result = solution(new int[] {1, 2, 100, -99, 1, 2, 3});
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//	정수 배열 numbers가 매개변수로 주어집니다.
//	numbers의 각 원소에 두배한 원소를 가진 배열을
//	return하도록 solution 함수를 완성해주세요.
    public static int[] solution(int[] numbers) {
//    	반환하려는 answer의 배열 길이는 numbers의 길이와 동일
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
//        	전달받은 answer의 i번째 방의 값에 2배를 하여 대입한다.
        	answer[i] = numbers[i] * 2;
		}
        return answer;
    }
}






