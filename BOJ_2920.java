package algo_day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] as = {1,2,3,4,5,6,7,8};
		Integer[] ds = {8,7,6,5,4,3,2,1};
		
		Integer[] comp = new Integer[8];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<8;i++) {
			
			int a= sc.nextInt();
			
			comp[i]=a;
			
		}
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		
		Collections.addAll(ar, as);
		Collections.addAll(ar1, ds);
		Collections.addAll(ar2, comp);
		
		
		
		if(ar.equals(ar2)) {
			System.out.println("ascending");
		}
		
		else if(ar1.equals(ar2)) {
			System.out.println("descending");
		}
		
		else {
			System.out.println("mixed");
		}
		

	}

}
