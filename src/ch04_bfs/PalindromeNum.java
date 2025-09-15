package ch04_bfs;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		// 테스트 데이터 갯수 
		
		for(int i=0; i<N; i++) {
			int T = sc.nextInt();	// 테스트 데이터
			
			boolean find = false;
			for( int j=2; j<=64; j++ ) {
				// 1. 테스트 데이터 진법변환하기
				int[] digit = baseConversion(T, j);
				
				// 2. 회문인수인지 판단하기
				if( palindromeNum(digit) ) {
					find = true;
					break;
				}
			}
			
			System.out.println( find ? "1" : "0" );
		}
	}
	
	// 진법 변환 함수
	public static int[] baseConversion(int t, int base){
		int len = 0, copyT = t;
		while( copyT > 0 ) {
			copyT /= base;
			len++;
		}
		
		int[] arr = new int[len];
		int i = 0;
		while( t > 0 ) {
			arr[i++] = t % base;
			t /= base;
		}
		
		return arr;
	}
	
	// 회문인수 판단 함수
	public static boolean palindromeNum(int[] digit){
		for(int i=0; i<digit.length/2; i++) {
			if(digit[i] != digit[digit.length-i-1]) {
				return false;
			}
		}
		
		return true;
	}
}
