package day06;

public class AccessModifier {
	public static void main(String[] args) {
//		public
//		접근 제어자 중 하나로 어떤 클래스에 속해 있든
//		외부에서 자유롭게 접근이 가능함을 의미한다.
//		접근: 값을 사용하거나 변경할 수 있는 것을 의미한다.
//		그외 접근 제어자
//		default: 같은 패키지 안의 클래스에서 접근이 가능하다.
//			접근 제어자를 생략하면 기본값으로 들어간다.
//		protected: default + a(자바 심화에서 진행)
//		private: 같은 클래스 내에서만 접근이 가능하다.

//		메서드/함수
//		부품처럼 가져다가 반복적으로 쓰기 위해
//		만들어두는 기능 블록이다.

//		만든 기능 사용해보기
//		함수 호출
//		printName(); // 이탤릭체(기울임)는 해당 메서드가
//		static으로 선언되었음을 의미한다.
		
//		특정 이름을 전달해보자
//		printName("홍길동");
		
//		특정 이름과 반복 횟수를 전달해보자.
//		printName("홍길동", 3);
		
//		add 함수에 정수 두 개를 전달하여 내용출력
//		add(3, 8);
		
//		sum 함수에 정수 두 개를 전달하여
//		그 합을 반환받아 출력해보자.
		int result = sum(10, 20);
		System.out.println(result);
		
		
		
		
	}
//	함수 만들어보기
//	public	static void 함수명(매개변수들){코드}
//	접근제어자	 static: 독립적으로 함수 실행을 해주는 것

//	void 함수명(매개변수들){코드}
//	void: 함수의 연산 결과 되돌려줄 값의 타입
//	함수명(): 해당 기능을 사용하기 위해 기능에 이름을 부여한 것
//	함수를 사용할 때에는 항상 뒤에 소괄호()가 붙어야 한다.
//	매개변수(parameter):
//	함수를 사용하는 쪽에서 전달한 값을
//	함수 내부에서 사용하기 위해 임시로 그 값을 저장하는 저장공간
	public static void printName() {
		System.out.println("이준상1");
		System.out.println("이준상2");
		System.out.println("이준상3");
		System.out.println("이준상4");
	}

//	함수도 변수와 마찬가지로 같은 이름으로 선언할 수 없다.
//	하지만, 변수와 다르게 무조건 선언이 안 되는 건 아니다.
//	조건1. 같은 이름이면 선언이 안 된다.
//	조건2. 매개변수의 개수와 그 타입과 순서가 동일하다. -> 시그니처
	public static void printName(String name) {
//		overloading
//		같은 이름의 함수이더라도 시그니처가 다르면 서로 다른 함수로 취급한다.
//		이때, 같은 이름으로 선언되었기 때문에 어떤 값을 전달해서
//		어떤 함수를 사용할지를 결정할 수 있다.
		System.out.println(name);
	}
	
//	name 문자열과 함께 amount 정수 값도 같이 전달받아
	public static void printName(String name, int amount) {
//		name에 담긴 문자열을 amount 번 반복하여 출력한다.
		for (int i = 0; i < amount; i++) {
			System.out.println(name);
		}
	}
	
//	숫자 두 개를 전달받아서 합을 출력하는 함수
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
//		int result = num1 + num2;
	}
	
	public static int sum(int num1, int num2) {
//		System.out.println(num1 + num2);
		int result = num1 + num2;
		return result;
	}
	
	
	
	
}










