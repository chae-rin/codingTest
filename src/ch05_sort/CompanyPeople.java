package ch05_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CompanyPeople {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 출입 기록수
		
		Company[] companyList = new Company[n];
		
		for( int i=0; i<n; i++ ) {
			companyList[i] = new Company(sc.next(), sc.next());
		}
		
		Arrays.sort(companyList, new Comparator<Company>() {

			@Override
			public int compare(Company o1, Company o2) {
				return o2.name.compareTo(o1.name);
			}
		});
		
		for(int i=0; i<companyList.length-1; i++) {
			if(companyList[i].status.equals("enter") && !companyList[i].name.equals(companyList[i+1].name))
				System.out.println( companyList[i].name );
		}
		
		if(companyList[companyList.length-1].status.equals("enter")) {
			System.out.println( companyList[companyList.length-1].name );
		}
	}
}

class Company{
	String name;
	String status;
	
	Company(String name, String status){
		this.name = name;
		this.status = status;
	}
}


