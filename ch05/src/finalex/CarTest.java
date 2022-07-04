package finalex;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=====자율 주행하는 자동차=====");
		Car mc = new AICar();
		mc.run();
		
		System.out.println("=====사람이 운전하는 자동차=====");
		Car hs = new MannualCar();
		hs.run();

	}

}
