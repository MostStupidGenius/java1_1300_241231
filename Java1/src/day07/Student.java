package day07;

public class Student {
	String name;// 이름
	int age; // 나이
	int grade; // 학년

//	기본 생성자
	public Student() {
		this("", 0); // 2번 생성자를 호출하여
//		기본값으로 객체 생성
	}

//	필요한 정보를 모두 입력받는 생성자
//	1번 생성자
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

//	이름과 나이만 입력받는 생성자
//	2번 생성자
	public Student(String name, int age) {
//		this() 현재 클래스의 다른 생성자를 호출하는 방법
//		1번 생성자를 호출하여 grade 값으로 1을 넣는다.
//		즉, 이름과 나이만 입력한 경우, grade에 기본값 1이
//		들어간다는 뜻이다.
		this(name, age, 1); // 1번 생성자 호출
	}

	public static void main(String[] args) {
//		Student 객체화
		Student kim = new Student("김철수", 15, 2);
		Student hong = new Student("홍길동", 17);
	}
}
