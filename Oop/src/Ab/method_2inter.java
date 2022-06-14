package Ab;
//inertface의 원래 기능은 메소드만 선언,추가로 연산을 처리하는 형태의 default가 추가됨.

public interface method_2inter {//this, private 적용하기 힘들다.

	//하나의 메소드라서 필드 생성 못함. 
	public String names();//리턴 메소드 생성 
	default void setbox(String name) {//setter
	
		System.out.println(name);
	}
	default String box3() {//getter
		
		//인터페이스에는 default를 선언하면 연산 메소드를 사용함
		return null;
	}
}
interface method_2re extends method_2inter{
	//인터페이스에 extends로 부모 인터페이스를 로드할수있따. 
}