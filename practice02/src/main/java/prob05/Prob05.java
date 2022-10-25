package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(100) + 1;

			System.out.println("수를 결정하였습니다. 맞추어 보세요: " + correctNumber + "\n1-100");
			System.out.print("1>>");

			// int answer = scanner.nextInt();

			while (true) {
				int answer = scanner.nextInt();
				for (int i = 1; i <= 100; i++) {
					System.out.print(i + 1 + ">>");
					for (int j = 1; j <= 100;) {
						if (answer == correctNumber) {
							break;
						} else if (answer > correctNumber) {
							System.out.print("더 낮게\n" + j + '-' + answer);
						} else {
							System.out.print("더 높게\n" + answer + "-" + j);
						}

						// 새 게임 여부 확인하기
						System.out.print("다시 하겠습니까(y/n)>>");
						// String answer = scanner.next();
						if ("y".equals(answer) == false) {
							break;
						}
					}
				}
			}
		}
	}
	// scanner.close();
}
