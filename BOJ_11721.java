package algo_day2;

import java.util.Scanner;

public class BOJ_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int count=1;
		
		int leng = a.length();
		
		for(int i=0;i<leng;i++) {
			
			System.out.print(a.substring(i, count));
			
			if(count %10 == 0) {
				System.out.println();
			}
			
			count=count+1;
			
		}

	}

}

