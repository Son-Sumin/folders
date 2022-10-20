package chapter01;

public class Ex15IfStatement {

	public static void main(String[] args) {
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		char big = ' ';
		
		if(a3 > a1 & a3 > a2) {
			big = (char)a3;
		} else {
			System.out.println("최대값은 " + a3 + "이 아닙니다.");
		}
		
		System.out.println("최대값은 " + a3 + "입니다.");
		
		//최대값은 50입니다.
	}

}
