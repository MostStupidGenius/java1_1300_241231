package day06;

public class Calc {
	
//	함수 실습
//	return을 사용하여 결과를 반환한다.
//	두 정수를 전달받아 더하는 함수
	public static int add(int num1, int num2) {
//		선언부
//		로직을 수행하는 데 있어서 매개변수 외 필요한
//		변수를 선언하는 영역
		int result = 0;
		
//		로직
//		실제로 함수의 코드가 본격적으로 실행되는 부분
		result = num1 + num2;
		
//		반환부
		return result;
	}
//	빼는 함수
	public static int sub(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}
//	곱하는 함수
	public static int multi(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		return result;
	}
//	나누는 함수
	public static int divide(int num1, int num2) {
		int result = 0;
		result = num1 / num2;
		return result;
	}
	
	public static void main(String[] args) {
//		실습 ~30분까지
//		사용하여 결과 확인
		System.out.println(add(3, 5) == 8); // true
		System.out.println(sub(8, 3) == 5); // true
		System.out.println(multi(2, 5) == 10); // true
		System.out.println(divide(10, 3) == 3); // true
	}

}
