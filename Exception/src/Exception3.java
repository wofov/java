import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
		 �ش� ������ ���� �� ���� ó���� ������ �߻� ���Ѿ� �ϸ�
		 ���� ���� ���� ���� �������� ������
		 main2������ �ش� �迭���� ���� �� �ش� ������ ��� 
		 �ջ��� ����� ������ �Ѵ�. 
		 ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� 
		 �ش� main2 �޼ҵ�� �ٽ� ȣ�� �Ͽ� ���������� �����Ͱ� ��������
		 �Ͻʽÿ�.
		 */

		String data[]= {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		ex.main2(data);
		
	}
	public void main2 (String da[]){
		try {
			int w=0;
			int total=0;
			while(w<da.length) {
				total += Integer.valueOf(da[w]);
				w++;
			}
			System.out.println(total);
		}catch(Exception z) {//	b = b.replaceAll("[a-z][A-Z]", " ");
			System.out.println(z);
		}finally {
			
			int a=0;
			while(a<da.length) {
				da[a]=da[a].replaceAll("[a-zA-Z]","");
				a++;
			}
			int w=0;
			int total=0;
			while(w<da.length) {
				total += Integer.valueOf(da[w]);
				w++;
			}
			
			System.out.println(total);
		}
	}

}
