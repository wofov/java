package a0624;

import java.util.Arrays;

public class aa0624 {
/*
 ���� ��� ó�� ������ �迭�� �������� ���� ������ ���� �迭�� �������ּ���
 ȫ�浿=55 �̼���=60 ������=80 ������=95
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
//		this.user = "������";
		System.out.println(Arrays.toString(this.user));
		System.out.println(Arrays.toString(st));
		
	}
	@Override
	public String getter() {
		// TODO Auto-generated method stub
		return null;
	}
}