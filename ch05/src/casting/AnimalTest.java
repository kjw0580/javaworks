package casting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void food() {
		System.out.println("동물이 먹잇감을 발견합니다");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void book() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥합니다");
	}
}

public class AnimalTest {
	public static ArrayList<Animal> animalList = new ArrayList();
	
	public static void main(String[] args) {
		
		animalList.add(new Human());
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		
		for(Animal animal : animalList)
			animal.move();
		
		System.out.println("원래 형으로 다운 캐스팅");
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.book();
			}else if(animal instanceof Eagle) {
				Eagle Eagle = (Eagle)animal;
				Eagle.flying();
			}else if(animal instanceof Tiger) {
				Tiger Tiger = (Tiger)animal;
				Tiger.hunt();
			}else {
				System.out.println("지원하지 않는 형입니다.");
			}
		}
		
	}
}