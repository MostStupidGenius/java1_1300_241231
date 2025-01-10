package day08;

import java.util.Scanner;

public class Kiosk {
//	키오스크
//	사용자로부터 숫자값을 입력받아
//	메뉴를 선택하거나
//	결제를 진행하는
//	프로그램을 작성하라.
//	기능?
//	메뉴출력 기능
//	결제 진행(입력받은 금액, 결제해야 할 금액) -> 거스름돈? 주문거절?

//	메뉴들이 담긴 메뉴 배열
	Menu[] menus;
//	메뉴에 들어갈 정보를 Menu 클래스에서 정의해야 한다.

	public Kiosk(Menu[] menus) {
		this.menus = menus;
	}

//	메뉴 출력 기능
	public void printMenu() {
		for (Menu menu : this.menus) {
			System.out.printf("%-4s\t: %5d원\n", menu.name, menu.price);
		}
	}
	
//	주문 받기 시작
	public void order() {
		Scanner sc = new Scanner(System.in);
//		주문은 무한히 받을 것이므로 while문으로 작성
		while(true) {
//			입력을 위한 안내
			for (int i = 0; i < this.menus.length; i++) {
				Menu menu = this.menus[i];
				System.out.printf(
						"%d. %-4s\t: %d\n",
						i+1,
						menu.name, 
						menu.price);
				
//				이전 주문의 count 변화를 0으로 초기화
				menu.count = 0;
			}
			System.out.print("메뉴 번호 입력: ");
			int inputNum = sc.nextInt();
			Menu menu = null;
			if(inputNum > 0 && inputNum <= menus.length) {
//				선택한 메뉴는 입력한 숫자-1의 인덱스에 있을 것이다.
				menu = menus[inputNum-1];
				
				System.out.printf("몇 개 담으시겠습니까?: ");
				inputNum = sc.nextInt();
				
//				담으려는 물품의 개수가 0보다 큰 경우에만 추가하고
//				0보다 작거나 같은 경우에는 0을 추가한다.
				menu.count += inputNum > 0 ? inputNum : 0;
			} else {
//				입력한 번호가 잘못된 경우 다시 입력하기 위해
//				다음 반복으로 이동
				System.out.println("다시 입력해주세요");
				continue;
			}
			
//			물품을 골랐고 개수를 정했다면
//			총 금액을 확인해야 한다.
//			금액 안내
			int total = menu.getTotal();
			System.out.printf("총 금액: %d\n", total);
			System.out.print("금액 입력: ");
			inputNum = sc.nextInt();
			
			if(total > inputNum) {
				System.out.println("금액이 부족합니다. 다시 메뉴를 주문해주세요.");
				continue;
			} else {
				System.out.printf("잔돈: %d\n", inputNum - total);
			}
		}
//		sc.close();
	}

	public static void main(String[] args) {
		Menu[] menus = new Menu[] {
				new Menu("햄버거", 2000),
				new Menu("감자튀김", 1500),
				new Menu("콜라", 1000)
//				null, // 더 넣고 싶은 메뉴가 있다면 추가
		};
		Kiosk k = new Kiosk(menus);
		k.printMenu();
		k.order();
		
	}

}
