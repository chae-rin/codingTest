package ch01_string;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "No";
		
		int receptTotalPrice = sc.nextInt(); 	// 영수증 총 금액
		int kind = sc.nextInt();				// 물건 종류
		
		sc.nextLine();
		
		int prodTotalPrice = 0;
		for( int i=0; i<kind; i++ ) {
			String prod = sc.nextLine();		// 물건 가격과 개수
			
			String[] prodArr = prod.split(" "); 	
			
			int prodPrice = Integer.parseInt( prodArr[0] );	// 물건 가격
			int prodCnt = Integer.parseInt( prodArr[1] );	// 물건개수
		
			prodTotalPrice += (prodPrice * prodCnt);
		}
		
		if(prodTotalPrice == receptTotalPrice) {
			result = "Yes";
		}
			
		System.out.println(result);
		
	}

}

