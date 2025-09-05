package ch01_string;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] charArr = input.toCharArray();
		char[] output = new char[charArr.length];
		
		for( int i=0; i<charArr.length; i++ ) {
			char alphabet = charArr[i];
			if( charArr[i] < 97 ) {
				alphabet += 32;
			} else {
				alphabet -= 32;
			}
			
			output[i] = alphabet;
		}
		
		System.out.println( String.valueOf(output) );
	}

}
