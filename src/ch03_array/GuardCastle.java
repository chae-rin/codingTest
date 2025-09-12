package ch03_array;

import java.util.Scanner;

public class GuardCastle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 세로
		int M = sc.nextInt();	// 가로

		char [][] map = new char[N][M];
		
		for(int i=0; i<N; i++) {
			String line = sc.next();
			map[i] = line.toCharArray();
		}
		
		// 행 체크
		int rowCount = 0;
		for (int i = 0; i < N; i++) {
			boolean hasGuard = false;
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'X') {
					hasGuard = true;
					break;
				}
			}
			if (!hasGuard) rowCount++;
		}
		
		// 열 체크
		int colCount = 0;
		for (int j = 0; j < M; j++) {
			boolean hasGuard = false;
			for (int i = 0; i < N; i++) {
				if (map[i][j] == 'X') {
					hasGuard = true;
					break;
				}
			}
			if (!hasGuard) colCount++;
		}
		
		System.out.println(Math.max(rowCount, colCount));
	}

}

