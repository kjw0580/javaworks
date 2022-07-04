package Customer;

public class Customer {

	//필드
	private int customerID; //고객 아이디
	private String customerName; //고객이름
	protected String customerGrade; //고객 등급
	protected int bonusPoint; //보너스 포인트
	protected double bonusRatio; //보너스 적립율
	
	//생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//getter, setter 메서드
	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int getcustomerID() {
		return customerID;
	}
	
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	//보너스 적립 계싼
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//고객 정보 출력
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인튼는" + bonusPoint + "점 입니다.";
	}
}
