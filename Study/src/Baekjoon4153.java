import java.util.*;
import java.io.*;

public class Baekjoon4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[3];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			if(arr[0] == 0) return;
			
			if(arr[2]*arr[2] == arr[0]*arr[0] + arr[1]*arr[1]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
