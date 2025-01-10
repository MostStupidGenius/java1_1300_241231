package day08;

public class Menu {
	String name;
	int price;
	int count;
	
	public Menu(String menuName, int price) {
		this.name = menuName;
		this.price = price;
		this.count = 0;
	}

	public int getTotal() {
		return this.price * this.count;
	}
	
}
