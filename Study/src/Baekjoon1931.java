import java.util.*;
import java.io.*;

public class Baekjoon1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		int count = 1;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
        
		int start = arr[0][0];
        int end = arr[0][1];
		
		for(int i = 1; i < N; i++) {
			if(start <= arr[i][0] && end > arr[i][1]) {
				start = arr[i][0];
				end = arr[i][1];
			}
			else if(arr[i][0] >= end) {
				start = arr[i][0];
				end = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
