package Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerLee = new Customer();
		
		customerLee.setcustomerName("이순신");
		
		//상품구매
		int Book = 10000;
		int computer = 1500000;
		customerLee.calcPrice(Book);
		customerLee.calcPrice(computer);
		//고객 정보 출력
		System.out.println(customerLee.showCustomerInfo());
	}

}
