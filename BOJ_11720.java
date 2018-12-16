package algo_day2;

import java.util.Scanner;

public class BOJ_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		String b=sc.next();
		
		
		int over=1;
		
		int sum=0;
		
		for(int i=0;i<a;i++) {
			
			sum=sum+Integer.parseInt(b.substring(i, over));
			over=over+1;
			
		}
		
		System.out.println(sum);

	}

}
