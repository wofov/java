import java.util.ArrayList;
import java.util.Arrays;

public class oop12 {

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
				Object a1[]= {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
				se s = new se();
				s.setter(a1);
			}

		}
		class se{
			ArrayList<String> abc = null;
			ArrayList<Object> a11 = null;
			ArrayList<Object> re = null;
			
			public void setter(Object a2[]) {
				this.a11=new ArrayList<>(Arrays.asList(a2));
				this.abc=new ArrayList<>(Arrays.asList());
				this.re=new ArrayList<>(Arrays.asList());
				try {
					int w=0;
					while(w<a2.length) {
						
						if(this.abc!=this.a11.get(w)) {
							Exception e2 = new Exception();
							throw e2;
						}
						
						w++;
					}
			
					
				}catch(Exception e) {
					System.out.println("아");
				}finally {
					int w1=0;
					int number;
					while(w1<a2.length) {
						Object k=this.a11.get(w1);
						if(number=Integer.parseInt(k.toString(w1))) {
							this.a11.remove(w1);
//							System.out.println(this.a11.get(w1));
							this.a11.add("");
						}
						
						w1++;
					}
					int ww=0;
					while(ww<this.a11.size()) {
						this.re.add(this.a11.get(ww));
						ww++;
					}
					System.out.println(this.re);
					
				}
			}
			
			
			
			
			
			
		}