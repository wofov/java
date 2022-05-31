
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		int w=1;
		while(w<4) {
			int ww=1;//★★★★★★★★while 이랑 do while은 더블 조건문 코드에서 조건을
			         //★★★★★★★★안에다가 넣어야 한다.
			while(ww<5) {
				//System.out.println(w+"+"+ww);
				ww++;
			}
			w++;
		}

		//do while
		int dw = 1;
		do {
			//do while문 포함 while문 같이 초기값을 큰 반복문 안에 설정
			int ddw = 1;
			do {
				System.out.println(dw+"+"+ddw);
				ddw++;
			}while(ddw<5);//작은 반복문 범위
			dw++;
		}while(dw<4);//큰 반복문 범위
	}

}
