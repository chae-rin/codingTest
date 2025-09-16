package ch04_bfs;

import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		// 테스트 데이터 갯수 
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();	// 호텔의 층 수
			int W = sc.nextInt();	// 각 층의 방 수
			int N = sc.nextInt();	// 몇번째 손님인지
	
			int cnt = 0;
			for(int w=1; w<=W; w++) {
				for(int h=1; h<=H; h++) {
					cnt++;
					
					if(N==cnt) {
						System.out.printf("%d%02d\n", h, w);
						break;
					}
				}
			}
		}
	}
	
}
