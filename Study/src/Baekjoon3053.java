import java.util.*;
import java.io.*;

public class Baekjoon3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		final double PI = 3.14159265359;
		
		int taxi = r * r * 2;
		double euclid = Math.round(r * r * PI * 1000000)/1000000.0;
		
		System.out.println(euclid);
		System.out.println(taxi);
	}
}