import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class exception7 {

	public static void main(String[] args) {
		/*
		 응용문제
		 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
		 해당 데이터 값 중 문자 값만 출력 되도록 재 배열 하시오. 
		 단, 메인에서는 해당 배열을 외부 클래스 세터 로 전송 합니다.
		 해당 세터 에서 배열값을 확인하여 이름만 재배열로 생성합니다. 
		 getter에서 해당 배열을 리털으로 보내도록 합니다.
		 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
		redata r = new redata();
		try {
			Object data[]= {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
			r.setter(data);
			LinkedList<String> result = r.getter();
			System.out.println(result);
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
			}
		}
		
	}
	
}
class redata{
	LinkedList<String> redata = new LinkedList<>();//>선생님 이렇게 사용해도 무방하도 함. 
	
	public void setter(Object[] call) throws Exception {
		int ea = call.length;
		int w=0;
		//int ck = Integer.valueOf((int)call[1]);
		//int ck = (int)call[1];>문자일때 오류 나옴 _오브젝트
		//String ck = (String)call[1];>숫자일때 오류 나옴 _오브젝트
		do {
			try {
				//해당 배열을 로드시 (자료형) 변환을 하는 이유는 Object배열 이므로 선언하였음. 
				String ck = String.valueOf((String)call[w]);
				this.redata.add(ck);
				
			}catch(Exception ex) {//자신 class에서 문제 발생시 출력되는 catch문
				//단, throw 사용하면 다시 main으로 전달 //__throw로 전달시 해당 반복문 종료.
				//즉 에러 발생하자마자 반복문 종료. 
			    //여기서 오류 내용 errors 메소드로 보낼수 있음. 
				//System.out.println(ex); //>>에러를 여기서 처리한것
				//throw 사용시 에러를 위로 보내는것.
			}
			w++;
		}while(w<ea);
//		System.out.println(this.redata);
	}
	public void errors(String msg) {
		System.out.println(msg);
	}
	public LinkedList<String> getter() {
		//배열 클래스 이름으로 만들 수 잇음. 
		
		return this.redata;
		
	}
}