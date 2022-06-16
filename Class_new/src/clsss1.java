
public class clsss1 {
/*부모클래스 및 자식클래스 연동*/
	public static void main(String[] args) {
		//부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호출 하지 못함. 
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child();//부모class.자식class 이름생성 = 부모클래스 명.
		
		pc.c_box();
	}

}
class parents{//부모클래스
	String a ="홍길동"; //부모 필드에 있는 전역변수 
	String b;
	class child{//자식 클래스 >> 보안에 사용한다.
		int a =20;
		
		public void c_box() {//자식 메소드
			double c = 10.5;
			System.out.println(c);//자식 메소드 내부 전용 지역변수 
		    System.out.println(this.a);//자식 클래스 전용 전역 변수
		    System.out.println(parents.this.a);//부모클래스 전용 전역변수
		    System.out.println(parents.this.b);//부모클래스에서 가져온거 
		}
	    
	}
	
	public void p_box() {//부모 메소드
        String a="이순신"; //<지역변수 
        this.b=a;//자식 클래스에서도 사용 가능함.
		System.out.println(this.a);//this 전역변수
	}
	
}