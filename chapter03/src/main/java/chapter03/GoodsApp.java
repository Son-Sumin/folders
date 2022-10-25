package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");   // 객체 안의 변수에 값을 세팅하는 setName
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println(camera);   // getName으로 각 필드값 명시도 가능하지만 객체로 전필드 활용 가능
	}

}
