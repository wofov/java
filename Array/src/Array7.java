import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

		/*
		���빮��
		�ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ���� �˴ϴ�
		�� �� ���� ������ ���� 3�̸��� ���� Ȯ���Ͽ� 
		�迭 �����͸� �簡�� �մϴ�.
		
		"ȫ�浿","�̼���","������","�������","������","������"
		4,3,1,1,2,2
		
		["������","�������","������","������"]
		 */
		String member[]= {"ȫ�浿","�̼���","������","�������","������","������"};
		int lv[] = {4,3,1,1,2,2};
		String member2[] = new String[4];
		int a=lv.length;
		int ab=0;
		int ct =0;
		while(ab<a) {
			if(lv[ab]<3) {
				member2[ct]=member[ab];
				ct++;
			}
			ab++;
		}
		System.out.println(Arrays.toString(member2));
		//Arrays.toString ���� ���� �Ҽ� [] ���� �迭 �������� ����ϴ� �Լ� 

	}

}
