package Customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VipCustomer customerKing = new VipCustomer();
		
		customerKing.setcustomerName("세종대왕");
		customerKing.setagentID(1451);
		
		//상품구매
		int price = 10000;
		customerKing.calcPrice(price);
		
		//고객 정보 출력
		System.out.println(customerKing.showCustomerInfo());
	}

}
