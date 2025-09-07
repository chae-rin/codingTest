package ch01_string;

import java.util.Scanner;

public class StudyWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		input = input.toUpperCase();
		int[] count = new int[26];
		for(int i=0; i<input.length(); i++) {
			count[input.charAt(i)-'A']++;
		}
		
		int maxCnt = 0;
		char maxAlphabet = '?';
		for(int i=0; i<count.length; i++) {
			
			if( count[i] > maxCnt ) {
				maxCnt = count[i];
				maxAlphabet = (char)(i + 'A');
			}else if( count[i] == maxCnt ) {
				maxAlphabet = '?';
			}
		}
		
		System.out.println( maxAlphabet );
		
	}

}
