package chapter01;

public class Ex12BitwiseOperator {

	public static void main(String[] args) {
		int a = 0x0f;   //0x; 16진수로 표현하겠다, 16진수는 2진법 8자리로 표현
		int b = 0xf0;
		
//		System.out.println(a); // 15
//		System.out.println(b); // 240
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a>>3);
		System.out.println(a<<3);
		
		
/* 우선순위
 * -----증감 연산자-----
 * 1. 산술 연산자 *  / %  -> +-
 * 2. 비교 연산자 == != > < >= <=
 * -----비트 연산자-----
 * 3. 논리 연산자 ! && || ^
 */

	}

}