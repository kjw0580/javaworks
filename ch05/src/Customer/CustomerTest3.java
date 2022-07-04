package Customer;

public class CustomerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(10010, "이순신");
		//VipCustomer king = new VipCustomer(10020, "세종대왕", 1446);
		//부모 클래스로 객체 생성 - 자동 타입 변환(형변환)
		Customer king = new VipCustomer(10020, "세종대왕", 1446);
		
		int price = 10000;
		int leePrice = lee.calcPrice(price);
		int kingPrice = king.calcPrice(price);
		
		System.out.println(lee.showCustomerInfo());
		System.out.println(king.showCustomerInfo());
	}

}
