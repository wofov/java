import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];//���� ���� �迭
		String m[]= {"ȫ�浿", "�̼���","������"};//�迭���� �����Ͱ� �ִ� ���� 
		//System.out.println(names[0]);
		//String a[] = null; �ڡڱ����� �������ִ� �迭�� �ʱ�ȭ�ϴ� ��
		int ct=0;//for each �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ �������ֱ� ���� ��.
		for(String a : m) {
			//System.out.println(ct);
			if(a.equals("ȫ�浿")||a.equals("������")) {//�ش� (����)�迭 �� �� ���ǿ� �´� ���� �߷��� 
		    //���ο� �迭���� �߰� 
				
			names[ct]=a;
			ct++;//�ε��� ��ȣ�� ���������� �����ϱ� ����.
			}
		}
		System.out.println(names[2]);//������ ��µ�
		//int name_ea = names.length;
	//	System.out.println(Arrays.toString(names));//�̰� names�� ��Ƶδ� �迭�� ��� ǥ���� �� �ִ°�
	}
    
	/*
	 ���빮�� �迭array
	 ����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�
	 ��, �ش� �ݾ� ����Ʈ�� ����������� ���� ��ü ���� �ݾ׸� ����ϼ���
	 1500 22000 13000 14500 113800 45000
	 */
}
