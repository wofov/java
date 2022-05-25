
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		String a = "1234";
		System.out.println(a);
		
		/* 정수형 */
		byte b = 127;   //byte : -128~127
		System.out.println(b);
		
		short c = 32767;   //short : -32,768 ~32,767
		System.out.println(c);
		
		int d = 1000000;   //int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 99999999999999L;    //long : -2^63 ~ (2^63-1)  기본 메모리 할당에서 
		//추가적용시 가능범위가 늘어남
		//long 사용시 끝에 L 사용해야함
		System.out.println(f);
		/* 정수형 끝*/
		
		/* 실수형 */
		float e = 3.5f;  //..402480000000+38  (f를 무조건 사용 해야함)
		System.out.println(e);
		
		double g = 55.5d;  //1.784+308  (d를 유/무 모두 됨)
		System.out.println(g);
		/* 실수형 끝 */
		
	}

}
