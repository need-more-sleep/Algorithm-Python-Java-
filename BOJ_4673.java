package BOJ;

public class BOJ_4673 {

	static boolean[] box = new boolean[10001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//self_num(1);
		
		
		
		for (int i = 0; i <= 10000; i++) {
			
			int a=self_num(i);
			
			if(a <= 10000) {
				box[a]=true;
			}

		}

		
		
		for (int i = 0; i <= 10000; i++) {
			if (box[i] == false) {
				System.out.println(i);
			}
		}
		
		

	}

	public static int self_num(int num) {

		int a = num;

		//int n = 10000;

		while (num > 0) {
			
			a = a + num %10;

			num = num / 10;
			
			/*
			
			System.out.println(" a: "+a);
			System.out.println(" n: "+n);
			
			*/
		}

		// System.out.println(a);

		return a;

	}

}
