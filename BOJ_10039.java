package algo_day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10039 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));
		
		String s=null;
		
		int count=0;
		
		while ( (s=br.readLine()) != null) {
			
			try {
			
			int a = Integer.parseInt(s);
			
			if(a < 40 ) {
				count = count +40;
			}
			
			else {
				
				count = count + a;
			}
			
			}
			
			catch(Exception e) {
				break;
			}
			
		}
		
		System.out.println(count/5);

	}

}
