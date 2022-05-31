
public class Class1 {

	public static void main(String[] args) {//일반 main 함수
		Adata a = new Adata();//Adata class 먼저 로드
		Bdata b = new Bdata();//Bdata class 먼저 로드
		System.out.println(a.aa);//Adata Class먼저 aa라는 문자 자료형 객체값을 가져옴
		System.out.println(b.aa);//Bdata Class먼저 aa라는 문자 자료형 객체값을 가져옴
		
		Cdata c =  new Cdata();
		/*
		 Cdata안에 변수 자료형을 선언함 -> 현재 기본함수에 값만 입력한 뒤 객체 값을 받아
		 산술 식으로 계산 (인스턴스 변수)
		 */
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);
		//System.out.println(c.cc);
	}

}

//aa는 각각의 다른 클래스에 있기 때문에 중복되지않습니다.
class Adata{
	
	String aa = "홍길동";
}

class Bdata{
	String aa = "이순신";
}
class Cdata{
	//해당 Cdata에 있는 클래스 에는 자료형에 대한 변수만 선언합니다
	//단, 계산 수식은 함수가 없는 상황이므로 수식 또는 sysout을 사용하지 못함.
	int aa;//
	int bb;
	int cc;
}