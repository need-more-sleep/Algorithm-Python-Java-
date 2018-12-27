package algo_day5;

import java.util.Scanner;

public class BOJ_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			String a = sc.next();

			char[] b = a.toCharArray();

			int grade = 0;

			int score = 0;

			for (int j = 0; j < b.length; j++) {

				if (b[j] == 'O') {

					score++;

					grade = grade + score;

				}

				else {
					score = 0;

				}

			}

			System.out.println(grade);

		}

	}

}
