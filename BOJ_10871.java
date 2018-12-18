package algo_day3;

import java.util.Scanner;

public class BOJ_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		int max = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			if(arr[i]<max) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
