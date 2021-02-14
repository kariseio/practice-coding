import java.util.*;
import java.io.*;

public class Baekjoon10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(pibo(n));
		
	}

	static int pibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return pibo(n - 1) + pibo(n - 2);
	}
}
