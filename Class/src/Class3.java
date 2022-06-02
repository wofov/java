
public class Class3 {

	public static void main(String[] args) {
		//자료형(데이터형) 변환
		double a =1.37;
		int b =(int)a;
		//double > int 변환
		
		int c=35;
		double d=c; //double d=(double)c;  int > double 변환
		System.out.println(d);
		

		//long사용시 Long.parseLong 사용
		//String > int  이거는 안됨
		String x = "35";
		String x2 = "156";
//		int z= Integer.parseInt(x); //parseInt int형에 사용하는 산술연산 언어임
		int z= Integer.valueOf(x);//valueOf > parseInt // valueOf 메소드(메소드함수) 
		int total = Integer.parseInt(x) + Integer.parseInt(x2);//문자형을 숫자형으로 변환하여 산술계산을 처리함
		System.out.println(z);
		
		String j = "9123456789";
		String j2 = "99123456789";
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2); ★★int는 int로 / long는 long로
		long total2 = Long.parseLong(j) + Long.parseLong(j2);//
		System.out.println(total2);
		
		//문자(char) > 문자(String) 기본 지식만 사용
		char part = 'a';//char 작은 따옴표 사용해야함 한 단어만 가능
		String f = String.valueOf(part); // 문자 > 문자 valueOf사용
        System.out.println(f);
	}

}
