package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cart = new String[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘은 과일 3가지를 구입할것이다 무엇을살까?");
		for(int i = 0; i < 3; i++) {
		System.out.println("1.포도 | 2.복숭아 | 3.바나나");
		System.out.println("선택> ");
		int sn = Integer.parseInt(sc.nextLine());
		
		Fruit fruit = null;
		if(sn == 1) {
			fruit = new Grape();
		}else if(sn == 2) {
			fruit = new Peach();
		}else if(sn == 3) {
			fruit = new Banana();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		cart[i] = fruit.name;
		fruit.showInfo();
		fruit.totalInfo();
		}
		System.out.printf("\n\n 오늘 구매한 과일 : %s, %s, %s", cart[0], cart[1], cart[2]);
		sc.close();
	}

}
