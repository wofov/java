import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

		/*
		응용문제
		해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공 됩니다
		그 중 레벨 데이터 값에 3미만의 값만 확인하여 
		배열 데이터를 재가동 합니다.
		
		"홍길동","이순신","강감찬","세종대왕","유관순","김유신"
		4,3,1,1,2,2
		
		["강감찬","세종대왕","유관순","김유신"]
		 */
		String member[]= {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[] = {4,3,1,1,2,2};
		String member2[] = new String[4];
		int a=lv.length;
		int ab=0;
		int ct =0;
		while(ab<a) {
			if(lv[ab]<3) {
				member2[ct]=member[ab];
				ct++;
			}
			ab++;
		}
		System.out.println(Arrays.toString(member2));
		//Arrays.toString 숫자 문자 소수 [] 현재 배열 변수값을 출력하는 함수 

	}

}
