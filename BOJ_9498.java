package algo_day3;

import java.util.Scanner;

public class BOJ_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println(sol(a));
		

	}
	
	public static String sol (int score) {
		
		String grade;
		
		if(score >=90) {
			grade="A";
			return grade;
		}
		else if(score>=80) {
			grade="B";
			return grade;
		}
		else if(score>=70) {
			grade="C";
			return grade;
		}
		else if(score>=60) {
			grade="D";
			return grade;
		}
		else {
			grade="F";
			return grade;
		}
		
	}

}
