package Customer;

public class VipCustomer extends Customer{

	//필드
	private int agentID; //상담원 ID
	private double saleRatio; //구매 할인율
	
	//생성자
	public VipCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	//생성자
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		saleRatio = 0.1;
	}
	
	public void setagentID(int agentID) {
		this.agentID = agentID;
	}
	
	public int getagentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		//가격 = 가격 - (가격 x 할인율) / 적립
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	//고객 정보 재정의
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n담당 상담원 아이디는 " + agentID + "입니다";
	}
	
	
}
