import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 외부 클래스 생성
		 응용문제
		 관리자에서 메뉴를 활성화 하는 프로세서입니다.
		 해당 메뉴는 활성화는 2차 배열이며, 메뉴얼, 활성화하는
		 (y,n)구분 합니다
		 해당 활성화 값을 대입하여 "y"로 적용되는 인덱스 번호에 맞는
		 메뉴명을 1차 배열로 재구성 후 메인에서 출력 되도록 합니다.
		 결과 : ["로켓배송","로켓프레시","골드박스","이벤트""추석"]
		 단 private 및 return을 활용하여 프로그램을 작성한다.
		 */
		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
	}
}
class menus{
	private String mdata[][];
	private String rdata[];
	String a;
	public menus() {
		String ms[][]= {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"y","y","n","y","y","n","y"}
		};
		this.mdata=ms;
		//System.out.println(Arrays.toString(this.mdata[1]));
		//2차 배열 출력은 저렇게 가능 this.mdata만 작성하면 안됨
		redata();//연결고리
	}
	public void redata() {
		int w = 0 ;
		int ea = this.mdata[0].length;
		int ct = 0 ;
		String ww[] = new String[ea];
		
		do {
			if(this.mdata[1][w]=="y") {
				ww[ct]=this.mdata[0][w];
				ct++;
			}
			w++;
		}while(w<ea);
		//String rdata[]=new String[ct]; 필요 없는 코드.
		this.rdata=ww;
	}
	public String[] get() {
		return this.rdata;
	}
}