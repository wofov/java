package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {
	//add�߰�,  get�����ͷε� ,remove����  , size�ε��� ����,
	//ArrayList��� ��ƿ �޼ҵ忡�� �����
	//Array.asList : �ε带 �迭 ������ ����
	//add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���
	//��, �ε��� ��ȣ�� ���� �� ���� �����ϸ� �ش� �ε��� �κп� �߰� 
	public static void main(String[] args) {
		String member[] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		System.out.println(mb);
		int ea = mb.size();
//		System.out.println(ea);
		mb.add("������");
//		System.out.println(mb);
		mb.remove(1);
//		System.out.println(mb);
		mb.add(3,"�������");
//		System.out.println(mb);
		String checks =mb.get(2);
//		System.out.println(checks);
		/*
		���빮�� {15,22,37,8,11,19,41};
		�ش� �����͸� Ŀ���� �Ͽ� ���� ��� ó�� ����Ͻÿ�
		{7,15,22,8,11,39,41}
		 */
		//arrayList������ int�� ������� ���� ��� integer�� �����. 
		Integer num[]= {15,22,37,8,11,19,41};
		ArrayList<Integer> a= new ArrayList<Integer>(Arrays.asList(num));
		a.remove(2);
		a.remove(4);
		System.out.println(a);
		a.add(0,7);
		a.add(5,39);
		System.out.println(a);
		
		
	}

}
