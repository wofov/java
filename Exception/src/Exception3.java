import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 응용문제
		 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
		 해당 ㄱ밧을 던질 때 예외 처리를 무조건 발생 시켜야 하며
		 최초 값을 던질 때는 가공없이 던진다
		 main2에서는 해당 배열값을 받응 후 해당 점수를 모두 
		 합산함 결과가 나와햐 한다. 
		 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 
		 해당 main2 메소드로 다시 호출 하여 정상적으로 데이터가 나오도록
		 하십시오.
		 */

		String data[]= {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		ex.main2(data);
		
	}
	public void main2 (String da[]){
		try {
			int w=0;
			int total=0;
			while(w<da.length) {
				total += Integer.valueOf(da[w]);
				w++;
			}
			System.out.println(total);
		}catch(Exception z) {//	b = b.replaceAll("[a-z][A-Z]", " ");
			System.out.println(z);
		}finally {
			
			int a=0;
			while(a<da.length) {
				da[a]=da[a].replaceAll("[a-zA-Z]","");
				a++;
			}
			int w=0;
			int total=0;
			while(w<da.length) {
				total += Integer.valueOf(da[w]);
				w++;
			}
			
			System.out.println(total);
		}
	}

}
