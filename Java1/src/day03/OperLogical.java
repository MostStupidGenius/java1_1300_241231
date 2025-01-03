package day03;

public class OperLogical {
	public static void main(String[] args) {
//		논리 연산자
//		boolean 값과 boolean 값을 연산하여
//		그 결과 boolean 값이 나오는
//		논리 연산을 의미한다.
//		&& and
//		두 논리값이 모두 참일 때 그 결과 참을 반환한다.
//		둘 중 하나라도 거짓이면 그 결과 거짓을 반환한다.
//		t t t
//		t f f
//		f f f
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false);// false
		
		System.out.println("========or=======");
//		|| or
//		shift + \ => |
//		or 연산자는 둘 중 하나라도 참이면
//		그 결과 참을 반환한다.
//		모두 거짓이어야 비로소 거짓을 반환한다.
//		t t t
//		t f t
//		f f f
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
//		^ (XOR)
//		둘의 값이 반대일 경우 결괏값이 참
//		t t f
//		t f t
//		f f f
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
//		! (NOT)
//		논리부정 연산자
//		논리값(boolean) 앞에 !를 붙임으로써
//		해당 논리값의 반대되는 값으로 반전시키는 연산자
//		단항 연산자 중 하나이다.
		System.out.println(!true); // false
		System.out.println(!false);// true
		
		
		
		
		
		
	}
}
