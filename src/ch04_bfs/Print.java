package ch04_bfs;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();				// 목판의 크기
		char[][] board = new char[N][N];	// 목판
		
		// 목판 초기화 (빈 공간 '.')
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = '.';
			}
		}
		
		char[] move = sc.next().toCharArray();
		
		int x = 0, y = 0;	// 시작위치
		for(int i=0; i<move.length; i++) {
			int nx = x, ny = y;
			switch(move[i]) {
				case 'U' :
					nx = x-1;
					break;
				case 'D' : 
					nx = x+1;
					break;
				case 'L' : 
					ny = y-1;
					break;
				case 'R' : 
					ny = y+1;
					break;
			}
			
			// 이동이 불가능한 경우 무시
			if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
			
			// 선그리기
			if (move[i] == 'U' || move[i] == 'D') {
				board[x][y] = updateChar(board[x][y], '|');			// 출발위치
				board[nx][ny] = updateChar(board[nx][ny], '|');		// 도착위치
			} else {
				board[x][y] = updateChar(board[x][y], '-');			// 출발위치
				board[nx][ny] = updateChar(board[nx][ny], '-');		// 도착위치
			}
			
			// 위치 이동
			x = nx;
			y = ny;
		}
		
		// 출력
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	private static char updateChar(char original, char newChar) {
		if (original == '.') return newChar;
		if (original == newChar) return newChar;
		return '+'; // 교차점
	}

}
