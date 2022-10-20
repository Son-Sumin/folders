package chapter01;

public class EX01Variable {

	public static void main(String[] args) {
		int i = 1000;
		String s = "Hello World";  // = new String("Hello World") string은 자주 사용하기에 java에서 제공하는 서비스
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경(algorithm, logic)");
		i = 2000;
		s = "Hello Again";
		
		System.out.println(i);
		System.out.println(s);
		
		// 상수; 관례상 상수는 캐피탈
		final double PI = 3.14;
		System.out.println(PI);
		
		// final이 붙은 변수(상수)는 다시 값을 대입하면 오류
		// pi = 5.68;
		
	}

}


// java는 선언할 때가 아니라 사용할 때 에러 발생함
/* 배열[]은 처음에 정해진 크기가 변하지 않는 정적 성질을 가짐
 * 
 * 객체; 메모리 덩어리
 * int i 에서 i 는 변수
 * String s = new String() 에서 s는 객체, 즉 reference의 주소가 들어감
 * 객체는 참조를 해야함, 그 안에 정보가 많기에
 * 객체 안에 개개의 변수가 있음
 * 
 * java가 자동으로 기존쿼리(수정내용 전 버전)를 Garbage Collect이 작동함
 * 
 * 상수(Constant); 변하지 않는 고정된 값
 */
