import java.util.*;
import java.io.*;

public class Baekjoon11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int index = arr.length - 1;
		
		while(k > 0) {
			if(k < arr[index])
				index--;
			else {
				k -= arr[index];
				count++;
			}
		}
		
		System.out.println(count);
	}
}
