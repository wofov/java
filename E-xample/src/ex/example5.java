package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 사용자가 직업 숫자를 직접 입력 받습니다. 
		 단 사용자가 문자를 입력할 경우 예외 처리가 진행되어야 합니다.
		 총 숫자 입력은 7번이며, 사용자가 입력한 숫자를 오른차순으로 정렬 합니다. 
		 숫자를 하나 입력하세요. 
		 
		 1-2
		 짝수와 홀수값을 별로도 배열 하세요. 
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> uu = new ArrayList<>();
		ArrayList<Integer> uu1 = new ArrayList<>();
		int user;
		int w=0;
		while(w<7) {
			try {
				System.out.println("숫자를 하나 입력하세요");
				Integer ck = Integer.valueOf(sc.next());//이런식으로도 예외처리 가능. >>이게 맞음.
				if(ck%2==0) {					
					uu.add(ck);
				}
				else {
					uu1.add(ck);
				}
			}catch(Exception s) {
				System.out.println("숫자만 입력하세요");
				w--;
			}
			w++;
		}
		Collections.sort(uu);
		Collections.sort(uu1);
		System.out.println(uu);
		System.out.println(uu1);
		sc.close();
	}
}
