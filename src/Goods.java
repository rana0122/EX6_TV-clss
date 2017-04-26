
public class Goods {
	 String name;
	 int price;
	 int countStock;
	 int countSold;
	public static int countOfGoods;
	final int b=20;//final은 값대입이 여기서 끝이란 소리이다.
	
	 
	 public Goods(){
		 Goods.countOfGoods = Goods.countOfGoods+1;
		 countOfGoods= countOfGoods+1;
	 }

}
