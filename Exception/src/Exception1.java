/*
 Exception / try�� catch�� �Բ� ��� �Ѵ�. 
 runtime exception (error �߻��� ����ó�� üũ�� ����) null class arraysize
 other exception (����ó�� üũ���� �����)
 exception[����]
 arithmetic :0���� ������ �߻�
 NullPointer :null ��ü�� �����Ҷ�
 ClassCast :Ŭ������ ��ȯ
 numberFormat:���������� ��ȯ
 arrayindexOutOfBound : �迭 ������ �ε��� ��ȣ ���� .
 IOException: ����� ���� �߻�
 exception : ��ü ����ó�� ���� 
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b="c1";
		try {
			a= Integer.valueOf(b);
		}catch(Exception z){
			System.out.println(z);
		}
		finally {//���ܹ߻��� catch�߻� �� finally ��� 
			b = b.replaceAll("[a-z][A-Z]", " ");
			a = Integer.valueOf(b);
			
		}
		System.out.println(a);
	}

}
