import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 다음 데이터 값이 있습니다.
		 a1 {"홍길동","이순신","강감찬","유관순","김유신"}
		 a2 {100, 80, 39, 60, 55}
		 검색하고자 하는 이름을 적어주세요
		 검색어에 이순신이라고 검색하면 
		 이순신님은 80점 입니다. 라고 출력하세요
		 */
		//00,10,//01,11
		String a1[]={"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[]={"100", "80", "39", "60", "55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름은?");
		String user_name =sc.next();//사용자가 입력 //2번 구분 잘하기
		
		jumsu j =new jumsu();
		j.ck(a1,a2,user_name);//답만 추출하는게 아니라 필요한 정보를 보내는것.//정보 // 1번 정보랑 답 확인하기★★★	   
		
		
	}

}
class jumsu{
	public void ck(String data1[],String data2[],String user) {//답
	  // System.out.println(Arrays.toString(data1));
		System.out.println(user);
		
		
	}
}


class point{
	public void number(String user[], String po[]) {
		int a=0;
		String msg = "";
		while(a<5) {
			if(user[a].equals(user)) {
				msg = user[a] + po[a];
			}
			
			
			a++;
		}
		
		System.out.println(msg);
		
	}
}
