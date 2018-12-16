package algo_day2;

import java.util.Scanner;

public class BOJ_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int count = num;

		while (count >= 1) {

			
			
			for (int i = 0; i < num-count; i++) {
				System.out.print(" ");
			}
			
			
			
			for(int i=0;i<count;i++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			count=count-1;
		}


	}

}
