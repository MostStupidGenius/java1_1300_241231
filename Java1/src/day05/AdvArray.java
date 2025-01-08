package day05;

public class AdvArray {

	public static void main(String[] args) {
//		향상된 for문
//		배열의 요소를 임시 변수에 담아
//		반복문의 코드를 각 요소마다 반복한다.
//		인덱스 접근x
		int[] arrInts = new int[10];
		for (int i = 0; i < arrInts.length; i++) {
			arrInts[i] = i * i;
			System.out.println(arrInts[i]);
		}
		
//		빠른 for문(향상된 for문)
//		각각의 배열 요소를 int e에 담아서
//		반복문의 코드를 실행한다.
		for (int e : arrInts) {
			System.out.println(e + 5);
		}
		
//		index for문은 앞뒤 인덱스의 값이나
//		해당 순번 정보가 필요할 때 사용하며,
//		빠른 for문은 각 요소 서로간에 어떠한 상호작용이나
//		순번 정보가 필요없이
//		단순히 해당 코드를 모든 요소에 반복할 때 사용한다.
		
		
		
		
		
		
		
		
	}

}
