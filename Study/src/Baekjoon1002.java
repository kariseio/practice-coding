import java.util.*;
import java.io.*;

public class Baekjoon1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double distance = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1 - y2));
			if(distance == 0) {
				if(r1 == r2) {
					System.out.println("-1");
				} else {
					System.out.println("0");
				}
			} else if(Math.abs(r1 - r2) > distance) {
				System.out.println("0");
			} else if(Math.abs(r1 - r2) == distance) {
				System.out.println("1");
			} else if(r1 > distance || r2 > distance) {
				System.out.println("2");
			}
			else if(distance > r1 + r2) {
				System.out.println("0");
			} else if(distance == r1 + r2) {
				System.out.println("1");
			} else if(distance < r1 + r2) {
				System.out.println("2");
			}
		}
	}
}
