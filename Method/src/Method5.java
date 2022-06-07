
public class Method5 {

	public static void main(String[] args) {

		cab c =new cab();
//		c.d1 = "홍길동";
//		cab.d1="이순신";
//		c.d3 ="홍";
//		cab.data1(d3);
//		c.data2(d1);
//		cab.data1();
		//c.d2="강감찬";private로 선언한 객체 이므로 main class에서 로드 못함
		c.data2("강감찬");
		
	}

}
class cab{
	String d1;//void 자료형 메소드 로드 가능
	private String d2=null;
	public static String d3;//다 사용 가능
	public static void data1() {//static 있을때 private 로드 불가, static 자료형 외에는 로드 불가
		//여기서도 this사용불가
		System.out.println(d3);
	}
    public void data2(String user) {
    	this.d2 =user;
    	data2(d3);
		System.out.println(this.d2);
	}
    public String data3() {
		String a=this.d2;
		//String a=null;
		return a;//강감찬을 위로 넘기는것
		
	}
	
	
}