package polymorphism;

public class Child extends Parent{

	@Override
	public void method1() {
		System.out.println("Child-Method1()");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Child-Method3()");
	}

}
