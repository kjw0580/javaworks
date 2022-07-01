package override;

public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadShop hshop = new HeadShop();
		hshop.sellDoenjangJJige();
		hshop.sellKimchiJJige();
		hshop.sellBibimBap();
		
		Shop1 shop1 = new Shop1();
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();

		Shop2 shop2 = new Shop2();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellBibimBap();
	}

}
