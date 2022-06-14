package Ab2;

public interface app_data1 {//

	String a="ㅂㅂㅂㅂ";//필드에 자료형을 비어있는 값을 사용할 경우 적용 자체가 안됨.
	//무조건 값을 정해놔야함.
	public void user_join();//선언 형태의 메소드는 this사용 못함. 
	default void aaa() {
		System.out.println(this.a);//default에서는 this사용 가능 
	}
}
