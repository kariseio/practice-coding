import java.util.*;
import java.io.*;

public class Baekjoon10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int factorial = 1;
		
		if(N == 0) {
			System.out.println("1");
		} else {
			for(int i = 1; i <= N; i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		}
	}
}
