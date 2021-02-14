import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon9020 {

	public static void main(String[] args) throws IOException {
		boolean[] prime = new boolean[10000];
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i = 2; i < prime.length; i++) {
			if(prime[i] == false) {
				primeList.add(i);
				for(int index = i, j = 1; index < prime.length; index = i * (++j)) {
					prime[index] = true;
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testCase = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int min = Integer.MAX_VALUE;
			for(int j = 0; primeList.get(j) <= n / 2; j++) {
				if(primeList.contains(n - primeList.get(j))) {
					min = Math.min(min, Math.max(primeList.get(j), n - primeList.get(j)));
				}
			}
			System.out.println((n - min) + " " + min);
		}
	}
}
