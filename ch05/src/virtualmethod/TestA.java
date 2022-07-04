package virtualmethod;

public class TestA {

	//필드
	int num;
	
	//메서드
	void aaa() {
	 System.out.println("aaa(" + num + ") 출력");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
	}

}