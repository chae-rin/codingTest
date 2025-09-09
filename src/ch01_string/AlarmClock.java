package ch01_string;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 등교시간
		String[] schoolTime = sc.nextLine().split(" ");	
		
		int hour = Integer.parseInt(schoolTime[0]);		
		int minutes = Integer.parseInt(schoolTime[1]);
		
		int time = (hour * 60) + minutes;
		
		int alramTime = time - 45;	// 45분 일찍 알람 설정하기

		if( alramTime < 0 ) 
			alramTime += 24 * 60;
		
		System.out.println( alramTime/60 + " " + alramTime%60 );
	}

}

