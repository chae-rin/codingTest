package ch04_bfs;

import java.util.Scanner;

public class CandyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 보드 크기
		
		// 보드판 입력받기
		char[][] board = new char[N][N];
		for(int i=0; i<N; i++) {
			String line = sc.next();
			for(int j=0; j<N; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		
		// 1. 두칸 골라서 사탕 교환하기
		int ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				// 1-1. 오른쪽으로 한칸씩 사탕 교환
				if( (j+1) < N ) {
					swapCandy( board, i, j, i, j+1);
					ans = Math.max(ans, Math.max(findMaxColumn(board), findMaxRow(board)));
					swapCandy( board, i, j, i, j+1);
				}
				
				// 1-2. 아래쪽으로 한칸씩 사탕 교환
				if( (i+1) < N ) {
					swapCandy( board, i, j, i+1, j);
					ans = Math.max(ans, Math.max(findMaxColumn(board), findMaxRow(board)));
					swapCandy( board, i, j, i+1, j);
				}
			}
		}

		System.out.println(ans);
	}
	
	// 사탕 교환
	public static void swapCandy(char[][] board, int x1, int y1, int x2, int y2) {
		char temp = board[x1][y1];
		board[x1][y1] = board[x2][y2];
		board[x2][y2] = temp;
	}
	
	// 최대 연속 행의 갯수 구하기
	public static int findMaxRow(char[][] board) {
		int N = board.length;
		int maxRow = 0;
		for(int r=0; r<N; r++) {
			int len = 1;
			for(int c=1; c<N; c++) {
				if(board[r][c] == board[r][c-1] ) {
					len++;
				}else {
					maxRow = Math.max(maxRow, len);
					len = 1;
				}
			}
			maxRow = Math.max(maxRow, len);
		}
		
		return maxRow;
	}
	
	// 최대 연속 열의 갯수 구하기
	public static int findMaxColumn(char[][] board) {
		int N = board.length;
		int maxColumn = 0;
		for(int c=0; c<N; c++) {
			int len = 1;
			for(int r=1; r<N; r++) {
				if(board[r][c] == board[r-1][c] ) {
					len++;
				}else {
					maxColumn = Math.max(maxColumn, len);
					len = 1;
				}
			}
			maxColumn = Math.max(maxColumn, len);
		}
		
		return maxColumn;
	}
}
