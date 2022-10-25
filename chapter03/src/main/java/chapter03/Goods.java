package chapter03;

public class Goods {
	String name;
	int price;
	int countStock;
	int countSold;
	
	// @Override
	// source > generate to string
	// GoodsApp에 println(객체)하면 객체의 tostring 츨력
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
}
