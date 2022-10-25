package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	// 필드는 private으로 하는 것이 좋다
	// 메소드를 통해 데이터에 접근하도록 해야함. Goods와 GoodsApp-> set, get 활용
	// 위 사항은 규격임

	// 메소드는 public이 많다
	// this 객체 내부에서 접근하는 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}



	// @Override
	// source > generate to string
	// GoodsApp에 println(객체)하면 객체의 tostring 츨력
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
}
