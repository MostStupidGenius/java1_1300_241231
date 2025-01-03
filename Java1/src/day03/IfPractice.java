package day03;

import java.util.Scanner;

public class IfPractice {
	public static void main(String[] args) {
//		if문 실습
//		1. 사용자로부터 점수(0~100)를 입력받아
//		90이상 100점 이하 -> A
//		80이상 90미만 -> B
//		70이상 80미만은 -> C
//		70 미만은 -> F
//		입력한 값의 범위에 포함되는지에 따라
//		위에서 설정한 문자를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력(0~100): ");
		int score = sc.nextInt();
		
//		90이상 100점 이하 -> A
		if(score >= 90 && 100 >= score) {
			System.out.println("A");
//		80이상 90미만 -> B
		} else if (score >= 80/* && 90 > score */) {
			System.out.println("B");
//		70이상 80미만은 -> C
		} else if (score >= 70/* && 80 > score */) {
			System.out.println("C");
		} else if(score < 70){
//		70 미만은 -> F
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
