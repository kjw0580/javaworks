package override;

public class SuperSonicAirPlane extends AirPlane{

	public static final int NORMAL = 0;
	public static final int SUPERSONIC = 1;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			//System.out.println("일반 비행합니다.");
			super.fly();
		}
	}
}
