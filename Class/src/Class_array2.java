import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자 하나 선택하세요");
		int no = sc.nextInt();
		
		memoerys m = new memoerys();
		//memoerys m = null;
		m = new memoerys();
		m.ms(no); //메모리 관리하면서 코드 작성하는법.
		m=null; //여기서 또 초기화  // 해당 인스턴스를 비움.
		m = new memoerys();
		m.rd();
		
	}

}
class memoerys{
	public void ms(int user) {
		//Math.random() 랜덤 메소드 사용법 : 기본자료형 double 입니다
		/*
		 random > 보안코드, 인증코드, 추첨, 룰렛
		 */
		//double a = Math.random(); // 0.0 ~ 1.0 랜덤
		//int b = (int)(Math.random()*10);//곱하기 할때 꼭 괄호 	double > int로 바꾼거임.
		int w=0;
		while(w<10) {
			int b = (int)(Math.random()*10);
		//	System.out.printf("%d ",b);
			w++;
		}
		/*System.out.println(b);
	    if(user==b) {
	    	System.out.println("당첨");
	    }
	    else {
	    	System.out.println("다음기회에");
	    }
		
		//System.out.println(b);
		 
		 */
		
		
	}
	public void rd() {//random util 사용법 
		Random r = new Random();//random 객체 생성 및 인스턴스 적용 
		int w=0;
		while(w<=5) {
			System.out.println(r.nextInt(45));//0~9까지 //r.nextint를 사용
			w++;
		}
	//	System.out.println(r.nextInt(10));//0~9까지 //r.nextint를 사용
		
		
		
		
		
		
	}
}
