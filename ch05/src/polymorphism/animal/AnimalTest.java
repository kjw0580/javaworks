package polymorphism.animal;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Eagle extends Human{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest a = new AnimalTest();
		
		Animal atest = new Animal();
		Animal htest = new Human();
		Animal etest = new Eagle();
		Animal ttest = new Tiger();
		
		a.moveAnimal(htest);
		a.moveAnimal(etest);
		a.moveAnimal(ttest);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
