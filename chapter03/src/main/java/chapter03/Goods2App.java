package chapter03;

import mypackage.Goods2;  // ctrl + shift + o ; package 외부 호출

public class Goods2App {
// 접근 지시자 test
	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		// public은 접근 제한이 없다. (내부, 외부, 자식 다 가능)
		g.name = "camera";
		
		// protected는 같은 패키지에서 접근이 가능하다.
		// 더 중요한 것은 자식에서도 접근이 가능하다.
		// g.price = 1000;

	}

}
