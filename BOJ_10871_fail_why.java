package algo_day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10871_fail_why {

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar_1 = new ArrayList<Integer>();

		int N = sc.nextInt();
		int X = sc.nextInt();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {

			ar.add(Integer.parseInt(st.nextToken()));

		}

		for (int i = 0; i < ar.size(); i++) {

			int dump = ar.get(i);

			if (dump < X) {
				int dump_1 = ar.get(i);

				ar_1.add(dump_1);
			}

		}

		Iterator itr = ar_1.iterator();

		
		while (itr.hasNext()) {

			System.out.print(itr.next()+" ");

		}
		System.out.println();

	}
}
