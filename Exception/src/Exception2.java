
public class Exception2 {

	public static void main(String[] args) {
		

		try {
			Exception2 ex =new Exception2();
			String a= "홍길동2";
			ex.test(a);
		}catch(Exception z) {
			System.out.println(z);
		}

	}
	public void test(String b) throws Exception,NumberFormatException{
		//throw는 main메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를 막기 위해. 
		//test를 main에서 불렀을때 throws Exception를 
		//작성했기 때문에 메인에서 예외문법 없으면 출력 안됨 
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c=new Exception();
		System.out.println("te");
		throw c;//예외처리 결과에 대한 값을 main메소드로 다시 return시킴
		//throw 코드 맨밑에 사용을 하며 throw +return과 비슷한 성격을 지님
	}
}
