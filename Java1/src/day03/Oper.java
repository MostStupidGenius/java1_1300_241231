package day03;

public class Oper {

	public static void main(String[] args) {
//		연산자
//		연산자의 종류
//		- 최우선 연산자
//			소괄호() 안에 쓰인 식이 먼저 연산된다는 의미로
//			단항/다항 여부와 무관하게 
//			소괄호()로 감싸인 식부터 먼저 연산된다
		int num = (1 + 3) * 3;
		System.out.println(num);
		
//		산술 연산자
//		덧셈, 뺄셈, 곱셈, 나눗셈 등
//		사칙 연산을 하는 연산자를 통틀어 이르는 말
//		덧셈+, 뺄셈-, 곱셈*, 나눗셈/
		int num1 = 5;
		int num2 = 3;
		System.out.println(num1 + num2); // 8
		System.out.println(num1 - num2); // 2
		System.out.println(num1 * num2); // 15
		
//		정수끼리 나눗셈을 하면 그 결과 정수만 나온다.
//		즉, 딱 떨어지지 않는 결과는 소숫점 아래를 버리고
//		정수부만 반환한다.
//		-> 정수끼리의 나눗셈은 몫 연산이다.
		System.out.println(num1 / num2); // 1
		
//		정수와 실수를 연산했을 때
		int numInt = 5;
		double numDouble = 2.0;
		
//		덧셈 7.0
		System.out.println(numInt + numDouble);
//		뺄셈 3.0
		System.out.println(numInt - numDouble);
//		곱셈 10.0
		System.out.println(numInt * numDouble);
//		나눗셈 2.5
		System.out.println(numInt / numDouble);
		
		System.out.println("============관계 연산자===========");
//		관계 연산자(비교 연산자)
//		연산의 결과로 참 혹은 거짓을 반환하는 연산자다.
//		이때 비교의 대상이 되는 자료형은 숫자형이다.
//		같니 다르니
//		== 같니?
		System.out.println(3 == 3.0); // true
		
//		!= 다르니?
		System.out.println(3 != 5); // true
		
//		크니/작니, 포함/불포함
//		> 크니?
		System.out.println(5 > 1); // t
		
//		< 작니?
		System.out.println(5 < 5); // f
		
//		>= 크거나 같니?
		System.out.println(5 >= 5); // t
		
//		<= 작거나 같니?
		System.out.println(5 <= 6); // t
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
