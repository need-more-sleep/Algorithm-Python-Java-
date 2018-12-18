package algo_day3;

import java.util.Scanner;

public class BOJ_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	         
	        int number = n;
	        int count = 0;
	         
	        do {
	            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
	            count++;
	        } while (n != number);
	         
	        System.out.println(count);

	}

}
