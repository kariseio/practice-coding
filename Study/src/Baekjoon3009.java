import java.util.*;
import java.io.*;

public class Baekjoon3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		int resX = (x[1] == x[0]) ? x[2] : x[0];
		int resY = (y[1] == y[0]) ? y[2] : y[0];
		
		System.out.println(resX + " " + resY);
	}
}
