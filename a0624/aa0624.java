package a0624;

import java.util.Arrays;

public class aa0624 {
/*
 다음 결과 처럼 각각의 배열로 나누어진 것을 다음과 같이 배열로 정렬해주세요
 홍길동=55 이순신=60 강감찬=80 유관순=95
 */
	public static void main(String[] args) {
		box2 bx = new box2();

		bx.setter();
	}

	
}
class box2 implements inter,inter2{
//	String user = this.user;
	@Override
	public void setter() {
		// TODO Auto-generated method stub
//		this.user = "김유신";
		System.out.println(Arrays.toString(this.user));
		System.out.println(Arrays.toString(st));
		
	}
	@Override
	public String getter() {
		// TODO Auto-generated method stub
		return null;
	}
}