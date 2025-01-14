package day02;

public class Transform {

	public static void main(String[] args) {
//		형변환
//		하나의 데이터 타입에서 다른 데이터 타입으로
//		타입을 변환하는 것을 형변환이라 한다.
		
//		이런 형변환에는 두 가지가 있다.
//		1. 자동형변환(암묵적, 암시적)
//		특별한 조치없이 데이터 타입이
//		변환되는 것을 의미한다.
//		2. 강제형변환(명시적 형변환)
//		특정한 데이터 타입으로 변환할 것을 명시적으로 적어
//		형변환하는 것을 의미한다.
		
//		1. 자동 형변환
//		자동 형변환은 크기가 작은 데이터 타입에서
//		크기가 큰 데이터 타입으로 자연스럽게 변환될 때
//		혹은 큰 자료형과 작은 자료형이 서로 연산될 때
//		작은 자료형이 큰 자료형으로 편입될 때
//		자동 형변환이 일어난다.
		int num = 10;
//		num에 담긴 정수 10이 실수 3.5와 연산되면서
//		그 결과로 하나의 타입을 정해야 하는데,
//		이때 더 큰 자료형인 실수(double)형으로
//		10이라는 값이 10.0이라는 실수로
//		자동 형변환된다.
//		이때 이러한 변화가 눈에 보이지 않게 
//		내부에서 일어나기 때문에
//		암묵적, 암시적 형변환이라고도 부른다.
//		double added = num + 3.5;
		
//		2. 명시적, 강제적 형변환
//		큰 자료형에서 작은 자료형으로 데이터를 저장할 때
//		데이터 손실의 가능성이 있기 때문에
//		컴퓨터 입장에서는 자동으로 형변환을 할 수가 없다.
//		그래서 확인도장을 찍기 위해
//		명시적 강제적 형변환을 해야 한다.
//		(변환할작은자료형)변환할큰자료형값
//		강제형변환시 사용하는 소괄호()는 
//		casting 연산자라고도 부른다.
		int transForm = (int) 3.141592;
		System.out.println(transForm);
		
//		int타입에서 byte타입으로 강제 형변환
		byte bt = (byte)127;
		System.out.println(bt); // 127
		
		bt = (byte) 128;
		System.out.println(bt); // -128
		
//		더 큰 자료형에서 작은 자료형으로 이동할 때
//		소숫점의 손실뿐만 아니라
//		표현할 수 없는 숫자를 작은 자료형에서 받을 경우
//		overflow 또는 underflow가 일어나서
//		원치 않은 다른 값이 들어갈 수도 있다.
//		: 데이터 손실의 다른 유형
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
