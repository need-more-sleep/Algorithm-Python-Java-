package algo_day3;

import java.util.Scanner;

public class BOJ_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		double[] arr = new double[N];
		
		double max=0;
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextDouble();
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		
		
		double sum=0;
		
		for(int i=0;i<N;i++) {
			arr[i]=(arr[i]/max)*100;
			
			//System.out.println(arr[i]);
			
			sum=sum+arr[i];
		}
		
		System.out.println(sum/N);

	}

}
