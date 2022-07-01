package statement;

public class Drink {

	//필드
	protected String name; //상품명
	protected int price; //가격
	protected int count; //수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	//계산
	public int getTotalPrice() {
		//가격 x 수량
		return price*count;
	}
	
	
	//제목출력
	public static void printTitle() { //제목
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	//데이터 출력
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
}
