import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//클래스,메소드,배열
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 성함은?");
		String users[]= {"홍길동","이순신","김유신"};
		String pm = sc.next();
		arrays.lists(users,pm);

		
		/*
		 응용문제 사용자가 자신의 이름을 입력합니다
		 사용자 이름을 해당 class로 보내서 등록된 사용자 인지
		 미 가입자 사용자 인지 확인하는 코드를 작성하시오
		 등록된 사용자면 가입이 되어있습니다
		 미등록자면 미가입자 입니다
		 */

	}

}
class arrays{
	public static void lists(String a[], String data) {
		int ea = a.length;
		int b;
		String msg="";
		//String msg = null;//★//메소드로 해당 값을 전달 할때는 비어있는 값을 명확하게 적용하셔야 합니다.
		//String "" or null int 0으로 표현
		//int datas = 0;
		boolean ck = false;
		for(b=0;b<ea;b++) {
			if(data.equals(a[b])) {
				msg="가입된 사용자";
				ck=true;
			}
			
		}
		if(ck==false) {
			msg="미가입자";
		}
		arrays ar = new arrays();
	    ar.messger(msg);
		
		
	}
	public void messger(String m) {
		System.out.println(m);
	}
	
}
