package ch04_bfs;

import java.util.Scanner;

public class BaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 10진법 수
		int B = sc.nextInt();	// 변환할 진법
		
		sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		while( N > 0 ) {
			int remain = N % B;
			
			if( remain >= 10 ) {
				sb.append((char)(remain - 10 + 'A'));
			} else {
				sb.append(remain);
			}
			
			N /= B;
		}
		
		System.out.println( sb.reverse() );
	}

}
