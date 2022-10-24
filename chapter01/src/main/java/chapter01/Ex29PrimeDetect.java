package chapter01;

public class Ex29PrimeDetect {

	public static void main(String[] args) {
		// 2 ~ 1000까지 소수를 화면에 출력하세요.
		
		int num = 5;		
		boolean isPrime = true;
		
		if(isPrime) {
			for (int i = 2; i < num; i++) {
//				 num % i != 0;
			}
			num += 1;
			
			System.out.println(num);
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}

	}

}
