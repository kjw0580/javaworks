package taketrans;

public class Vehicle {

	String vehicleName;
	int money;
	int passengerCount;
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//운송하다 메서드
	public void carry(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 수입은 : %,d원이고, 승객수는 %d명입니다. %n", vehicleName, money, passengerCount);
	}
}
