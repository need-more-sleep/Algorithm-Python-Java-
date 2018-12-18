package algo_day3;

import java.util.Scanner;

public class BOJ_4344_fail_why {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			
			int num=sc.nextInt();
			
			int[] ar = new int[num];
			
			double sum=0;
			
			for(int j=0;j<num;j++) {
				ar[j]=sc.nextInt();
				
				sum=sum+ar[j];
			}
			
			//System.out.println(Math.round(sum/num*1000d)/1000d);
			
			double avg=sum/num;
			int count=0;
			
			//System.out.println(" avg : "+avg);
			
			for(int j=0;j<num;j++) {
				
				if(ar[j]>avg ) {
					count++;
				}
				
			}
			
			double output = ((float)count/(float)num);
			
			System.out.printf("%.3f", 100.0*output);
			System.out.println("%");
			
			//sc.close();
		}
		
		//sc.close();

	}

}
