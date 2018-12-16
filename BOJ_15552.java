package algo_day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_15552 {

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] plusArray = new int[t];

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			plusArray[i] = a + b;
		}

		for (int output : plusArray) {
			bw.write(String.valueOf(output));
			bw.newLine();
		}
		bw.flush();
	}

}
