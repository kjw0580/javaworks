package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sohee = new Student("박소희", 10000);
		Student dh = new Student("이대호", 20000);
		
		Bus bus100 = new Bus("bus100");
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		
		//타다
		sohee.take(bus100, 1200);
		dh.take(bus100, 1200);
		sohee.take(kakaoTaxi, 5000);
		
		
		
		//정보 출력
		sohee.showInfo();
		dh.showInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();
	}

}
