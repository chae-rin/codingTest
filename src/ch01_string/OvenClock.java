package ch01_string;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] now = sc.nextLine().split(" ");	// 현재시각
		int cookTime = sc.nextInt(); 				// 요리하는데 필요한 시간
		
		int nowHour = Integer.parseInt(now[0]);
		int nowMinute = Integer.parseInt(now[1]);
		
		int cookEndTime = (nowHour * 60) + nowMinute + cookTime;
		
		int cookEndHour = (cookEndTime/60)%24;
		int cookEndMinute = cookEndTime%60;
		
		System.out.println( cookEndHour + " " + cookEndMinute );
	}

}



