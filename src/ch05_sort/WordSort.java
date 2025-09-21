package ch05_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 단어의 개수
		
		String[] words = new String[N];
		for(int i=0; i<N; i++) {
			words[i] = sc.next();
		}
		
		Arrays.sort(words, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
					// 길이가 같으면 사전 순으로 정렬
					if(o1.length()==o2.length()) {
						return o1.compareTo(o2);
					}
				// 길이가 짧은 것 부터 정렬
				return o1.length() - o2.length();
			}
		});
		
		System.out.println(words[0]);
		for(int i=1; i<words.length; i++) {
			// 중복 제거
			if(!words[i].equals(words[i-1])) {
				System.out.println(words[i]);
			}
		}
	}

}
