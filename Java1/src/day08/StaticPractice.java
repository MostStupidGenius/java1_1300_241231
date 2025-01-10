package day08;

public class StaticPractice {

//		static이란
//		프로그램을 실행하면 가장 먼저 메모리에 올리는 대상들로
//		프로그램 실행 중에 메모리 주소를 할당받는 일반적인 대상들과 다르게
//		프로그램이 종료되기 전까지 항시 메모리에 올라가 있다.
//		스태틱은 필요한 게 아니라면 남용하면 안 된다
//		-> 메모리를 계속 차지하기 때문
//		스태틱이 붙은 변수는 객체에 소속되는 변수가 아니라 
//		클래스에 소속된 변수로 사용되며
//		해당 클래스의 다른 객체에서도 접근할 수 있는
//		"공유되는"변수다. -> 공유 변수

//	객체에서 사용하는 인스턴스 변수
	String name;
	int age;
//	 객체들이 공유하는 클래스 변수(스태틱 변수)
	static int count = 0; // 객체화된 횟수를 기록할 변수

//	스태틱 블록
//	객체화와 무관하게 프로그램 실행시 최초 1회 실행되는
//	코드 블록이다.
//	주로 스태틱 변수를 초기화할 때 사용한다.
	static {
		System.out.println("스태틱 블록");
	}
	
	
//	 인스턴스 블록
//	 객체화를 할 때, 생성자보다 먼저 호출되어 실행되는 코드 블록
//	모든 생성자가 공통으로 실행해야 할 코드를 주로 작성한다.
	{
		count++;
		System.out.println("인스턴스 블록: " + count);
		
	}
	
	public StaticPractice() {
		System.out.println("생성자 호출");
	}
	
//	공유 변수 count를 반환해주는 메서드
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		StaticPractice sp1 = new StaticPractice();
		StaticPractice sp2 = new StaticPractice();
		StaticPractice sp3 = new StaticPractice();
		StaticPractice sp4 = new StaticPractice();
		StaticPractice sp5 = new StaticPractice();
		
//		클래스명.클래스변수명
//		static way로 접근하는 방법이다.
		System.out.println(StaticPractice.count);
//		객체명.클래스변수명
//		객체에서 클래스 변수로 접근하는 방법이다.
//		하지만 권장하는 방법은 아니다.
		System.out.println(sp1.count);
//		클래스에서 스태틱 메서드를 만들어서
//		스태틱 메서드로 클래스 변수의 값을 반환하는 방법이다.
//		스태틱 메서드는 클래스를 객체화하지 않고 클래스명으로
//		메서드를 사용해야 한다.
		System.out.println(StaticPractice.getCount());
		
		
		
		
		
		
		
	}

}
