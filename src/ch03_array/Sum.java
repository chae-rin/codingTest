package ch03_array;

import java.io.IOException;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int X = sc.nextInt();
		
		boolean[] exists = new boolean[1000001];
		for(int i=0; i<N; i++)
			exists[arr[i]] = true;
		
		int cnt = 0;
		for(int i=1; i<=(X-1)/2; i++) {
			if(i<=1000000 && X-i <= 1000000)
				cnt += (exists[i] && exists[X-i]) ? 1 : 0;
		}
		
		System.out.println(cnt);
	}
}

