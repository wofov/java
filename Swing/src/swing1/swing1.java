package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class(box상태)
		/*
		 float,char,byte,long,short(기본타입)
		 wrapper class : Byte, Integer, Long, Double
		 */
		//int a=20;//언박싱 > 계산 가능
		Integer a=new Integer(20);
		Integer b=new Integer(20);//new integer (박싱) > 서로 산술기호 계산 안됨 //괄호 안에 20 을 보고 박싱 상태라함.
		//또한 서로 박싱 상태 계산할때 equals사용
		if(a.equals(b)) {
			System.out.println(a+b);
		}
		Integer bo1 = 20;//언박싱
		Integer no = new Integer(99);//박싱
		//int aa= no 언박싱
		Integer bb= no.intValue();//언박싱
		System.out.println(bb);
	
		/*
		 박싱과 언박싱 비교할 때는 equals를 사용 해야만 비교가 이루어짐. 
		 */

	}

}
