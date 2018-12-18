package algo_day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		
		Collections.sort(ar);
		
		System.out.println(ar.get(1));

	}

}
