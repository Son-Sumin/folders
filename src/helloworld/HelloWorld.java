package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

	}

}

// java는 실행 시 반드시 클래스 최소 1개가 들어가야 한다.

// public static void main(String args[]) -> 암기

// 기본 프로그래밍; 변수, 데이터타입, 제어문(반복문, 조건문)

/* 식별자(Identifier); 변수명으로 다른 것들과 식별, 예약어(Keyword)가 아닌 것들을 활용
 * 클래스명은 대문자, 변수 및 함수명은 소문자로 시작하여 캐피탈 섞어서 쓰기
 * 
 * 변수는 데이터를 저장하는 공간이고, java는 저장되는 데이터 공간(변수)의 타입을 지정해줘야한다.
 * java에서 기본적으로 제공해주는 8(9)가지의 타입 존재 >
 * 정수(int4), 작은/큰 정수(short2/long8), 한글자(char1), 여러글자(byte), t/f(boolean), 부동소수(float), 큰소수(double),
 * 참조변수(학생정보를 갖고 있는 변수)
 * 
 * 'Class' class 생성 완료
 * 객체를 만들기 위해서 'new' 기입 new Class() 객체 생성 완료
 * 객체에 대한 변수 제공 s = new Class()
 * Class s = new Class()
 * Class의 저장공간(변수) s는 new Class()와 별개의 저장공간을 가짐
 * 
 * java는 주소를 referenc로 저장함 <- jvm이 실시
 * 이제 s에 reference 등이 들어갈 수 있음
 * 
 */ 

