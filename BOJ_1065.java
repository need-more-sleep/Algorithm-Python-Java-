package algo_day4;

import java.util.Scanner;

public class BOJ_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		if (n < 100) {
			System.out.println(n);
		} else {

			int a = 99;

			for (int i = 100; i <= n; i++) {

				if (hansoo(i) == 1) {
					a = a + 1;
				}

			}

			if (n == 1000) {
				a--;
			}

			System.out.println(a);

		}

	}

	public static int hansoo(int num) {

		int a1 = num % 10;
		int a2 = num / 10 % 10;
		int a3 = num / 100 % 10;

		if (a1 - a2 == a2 - a3) {
			return 1;
		}

		return 0;

	}

}