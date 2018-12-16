package algo_day2;

import java.util.Scanner;

public class BOJ_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 5 == 0) {

			System.out.println(num / 5);
			return;

		} 
		
		else {

			int quotient = num / 5;

			for (int i = quotient; i > 0; i--) {

				int temp = num - (i * 5);

				if (temp % 3 == 0) {

					System.out.println(i + (temp / 3));

					return;
				}
			}

		}

		if (num % 3 == 0) {

			System.out.println(num / 3);

		} else {

			System.out.println(-1);

		}

		return;

	}

}
