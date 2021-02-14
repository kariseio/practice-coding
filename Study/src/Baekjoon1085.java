import java.util.*;
import java.io.*;

public class Baekjoon1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[] {x, y, w-x, h-y};	
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
	}
}
