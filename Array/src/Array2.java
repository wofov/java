
public class Array2 {

	public static void main(String[] args) {
		//String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[4].length();//�ڡ�length() < �ܾ� ���� �� ��ȣ �� 
		//System.out.println(word);
		/*
		 ���빮�� �ش� ����� ����Ʈ �迭�� �ִ�
		 �ش� �迭�� �� ����� id 3�ܾ� �̻� ����Ͻÿ�
		 */
		String id[] = {"hong","kim","park","lee","jang","jung"};
		int a = id.length;//��ü ȸ������ �ľ��ϱ� ����
		int aa = 0;
		int word;//������ �迭 �������� ���� �����ľ�
	    while(aa<a) {
	    	word = id[aa].length();//���� ���� �ľ�
	    	if(word>3) {//3�ܾ� �̻��� ������ �� ���
	    	//	System.out.println(id[aa]);
	    	}
	    	aa++;
	    }
		/*
		 ���빮�� �迭������ ������ ����
		 15 60 11 14 27
		 ���� ������ ���� ��� ���ؼ� ���� ������� ����ϼ���
		 */
		int x[] = {15,60,11,14,27};
		int p = x.length;
		int total=0;
		int z=0;
		while(z<p) {
			total += x[z];
			z++;
		}
		System.out.println(total);

	}

}
