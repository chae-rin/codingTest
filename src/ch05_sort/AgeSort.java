package ch05_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 온라인 저지 회원의 수
		sc.nextLine();

		Member[] members = new Member[N];
		for(int i=0; i<N; i++) {
			members[i] = new Member(sc.nextInt(), sc.next(), i);
		}
		
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				
				// 나이순으로 정렬
				if(o1.age != o2.age) {
					return o1.age - o2.age;
				}
				
				// 나이가 같으면 가입한 순으로 정렬
				return o1.idx - o2.idx;
			}
		});
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].age + " " + members[i].name);
		}
	}
}

class Member{
	int age;
	String name;
	int idx;
	
	Member(int age, String name, int idx){
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
}
