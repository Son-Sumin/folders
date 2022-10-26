package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();  // new 뒤에 Goods() 생성자는 실행이 된다
		
		camera.setName("nikon");   // 객체 안의 변수에 값을 세팅하는 setName
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.showInfo();
		
		int discountPrice = camera.calcDiscountPrice(0.5);   // 리턴값 = 0.5 매개변수
		System.out.println("Discount Price:" + discountPrice);
		
		//System.out.println(camera);   // getName으로 각 필드값 명시도 가능하지만 객체로 전필드 활용 가능
		
		
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println(Goods.countOfGoods); 
		
	}

}
