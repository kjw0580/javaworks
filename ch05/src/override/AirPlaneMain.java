package override;

public class AirPlaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
	
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}

}
