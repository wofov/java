package example;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 �迭+�⺻(Ŭ����)�޼ҵ� ����
		 product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ����
		 �߿� ����, ��, Ű���� ����
		 �ش� ���� �� �迭�� �ٽ� ����Ʈ ����ϼ���
		 ��, �ش� ó�������� ��� ���� �޼ҵ忡�� ó��
		 �ݺ��� ����
		 */
		String lists1[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		
        ppl(lists1);
	}
	public static void ppl(String a[]) {
		int aa = a.length;
		String lists2[] = new String[aa];
		int idx = 0;
		for(String p : a) {
			if(!p.equals("����")&&!p.equals("��")&&!p.equals("Ű��")) {
                lists2[idx]=p;

			
				idx++;
			}
			
		}
	
		System.out.println(Arrays.toString(lists2));
		
	}

}
