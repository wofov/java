import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];//값이 없는 배열
		String m[]= {"홍길동", "이순신","감나무"};//배열값에 데이터가 있는 상태 
		//System.out.println(names[0]);
		//String a[] = null; ★★기존에 가지고있던 배열값 초기화하는 법
		int ct=0;//for each 인덱스 번호가 없으므로 새롭게 인덱스 번호 지정해주기 위한 것.
		for(String a : m) {
			//System.out.println(ct);
			if(a.equals("홍길동")||a.equals("감나무")) {//해당 (기존)배열 값 중 조건에 맞는 값만 추려서 
		    //새로운 배열값에 추가 
				
			names[ct]=a;
			ct++;//인덱스 번호를 순차적으로 적용하기 위함.
			}
		}
		System.out.println(names[2]);//감나무 출력됨
		//int name_ea = names.length;
	//	System.out.println(Arrays.toString(names));//이건 names을 담아두는 배열을 모두 표현할 수 있는것
	}
    
	/*
	 응용문제 배열array
	 사용자가 장바구니에 내용을 결제 하게 됩니다
	 단, 해당 금액 리스트를 출력하지말고 최종 전체 결제 금액만 출력하세요
	 1500 22000 13000 14500 113800 45000
	 */
}
