package day03;

public class OperThree {

	public static void main(String[] args) {
//		삼항 연산자
//		기존의 단항, 이항 연산자들과 달리
//		항이 세 개나 있는 연산자로써
//		조건식의 결과에 따라 반환할 값을
//		다르게 설정할 수 있는 연산자다.
//		조건식 ? 참일때값 : 거짓일때값
		
//		조건식(condition)
//		연산 결과 참 혹은 거짓을 반환하는 식을 가리킨다.
		int num1 = 10;
		int num2 = 2;

		int bigOne = 
//			num1이 num2보다 크면
			num1 > num2 ?
			num1 : // num1을 반환하고
			// 아니라면
			num2; // num2를 반환해라
		System.out.println(bigOne);
		
		
		
		
		
		
		
		
		
		
		

	}

}
