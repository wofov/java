import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		/*
		���빮�� {"�ܹ���","����","ġŲ","Ŀ��"}
		�ֹ��ϰ��� �ϴ� ������ �����ϼ��� < ����
		�ش� ������ �� 4�� ����ϴ�
		��, "�ֹ�����"��� �Է½� ��� �ֹ� ����Ǹ�,
		�ֹ������� ���.
		 */
		//�� �迭 ������ �����Ͱ� �ִ� �迭�� Ŀ���� ���
		int a[] = new int[2];//3���� ������ ������ (0, 1, 2)
		int b[] = {1,2,3,4,5,6,7};//7���� ��ü�� �ִ� ��Ȳ
		int ea = b.length;//b �迭 �ȿ� ��� �����Ͱ� �ִ���.
		int ee = a.length;
		int w = 0 ;
		int ct = 0 ;
		while(w<ea) {
			//System.out.println(b[w]);
			// && ct<ee �ڡڡڡ� ���� ����� Ȯ���ϱ�
			if(b[w]%2==0 && ct<ee) {// if(b�迭)�� ���� ¦���� && ���ο� a �迭�� ��ü ��üũ�� ��ŭ��
				a[ct] = b[w];
				ct++;//���Ǹ� ������ �ε��� ��ȣ�� +1�� ������Ŵ 
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
