package polymorphism;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Parent pr = new Parent();
		
		pr.method1();
		
		child.method1();
		child.method2();
		child.method3();
	}

}
