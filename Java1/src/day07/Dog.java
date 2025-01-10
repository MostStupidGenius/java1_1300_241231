package day07;

public class Dog {
	String name;
	int age;
	Person owner;
	
//	생성자(Constructor)
//	객체를 생성할 때 필요한 정보를 전달하여
//	객체의 정보를 구성하는 걸 도와주는 특수한 메서드이다.
	
//	기본 생성자
//	다른 생성자가 없다면 따로 선언하지 않아도
//	기본생성자는 만들어진다.
//	하지만, 다른 생성자가 있는데, 기본 생성자를 만들지 않았다면
//	기본 생성자는 없어진다.
//	public Dog() {;}
	
//	생성자 만들기
//	필요한 정보 입력받기
//	1. name, age
//	2. owner는 나중에 입력받기
	public Dog(String name, int age) {
//		this는 이 클래스를 객체화한 객체를 가리키기 위한
//		대명사이자 주소값이 담긴 저장공간이다.
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Dog baduk = new Dog("바둑이", 15);
		System.out.println(baduk.name);
		
		
		
		
	}

}








