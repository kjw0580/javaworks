package polymorphism.fruit;

public class Fruit {

	String name;
	String weight;
	int price;
	static int totalPrice;
	
	public Fruit() {}
	
	public void showInfo() {
		System.out.println("과일 이름 : " + name);
		System.out.println("과일 무게 : " + weight);
		System.out.println("과일 가격 : " + price);
	}
	
	public void totalInfo() {
		System.out.println("현재 총 구매금액 : " + totalPrice);
	}
	
}
