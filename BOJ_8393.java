package algo_day2;

import java.util.Scanner;

public class BOJ_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=a;i++) {
			sum=sum+i;
			//System.out.println(sum);
		}
		
		System.out.println(sum);

	}

}
