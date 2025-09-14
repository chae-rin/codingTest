package ch04_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EurekaTheory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 삼각수의 합 담아놓기 (테스트 케이스는 1000까지)
		List<Integer> numbers = new ArrayList<>();
		for(int i=1; ; i++) {
			int T = i*(i+1)/2;
			if( T > 1000 ) break;
			numbers.add(T);
		}
		
		int N = sc.nextInt();	// 테스트케이스 개수
		for( int i=0; i<N; i++ ) {
			int K = sc.nextInt();
			
			boolean flag = false;
			for( int j=0; j<numbers.size(); j++ ) {
				for( int k=0; k<numbers.size(); k++ ) {
					for( int l=0; l<numbers.size(); l++ ) {
						int sum = numbers.get(j) + numbers.get(k) + numbers.get(l);
						
						// K가 3개의 삼각수의 합으로 표현될수 있다면 True
						if( sum == K ) {
							flag = true; 
							break;
						}
					}
					if(flag) break;
				}
				if(flag) break;
			}
			
			System.out.println( flag ? "1" : "0" );
		}
	}

}
