import java.util.Scanner;

public class data_type {

	public static void main(String[] args) {
//		/intern() : equals�� ������� �ʰ� ==,�ε��ȣ�� ��� ����. 
		String data[]= {"ȫ�浿","ȫ�浿"};
		String data1[]= new String[] {"ȫ�浿"};//�迭�� new����ص� String pool�� �ִ�
		//new ��� �ϸ� ���δٸ� heap�������� ���ٰ� ���� ����. 
		String a="ȫ�浿";
		String b="ȫ�浿";
		String c=new String("ȫ�浿").intern();
		String d=new String("ȫ�浿");
		String d1=new String(data[0]).intern();
		//��ü�� �����ؼ� �÷ȱ� ������ �ٸ��ٰ� ����. 
		//��ĳ�� ���� new�� �����ؼ� �÷ȱ⶧���� �ٸ�. 
		String e=data[0];
//		Scanner sc = new Scanner(System.in);
//		String f=sc.next();
		System.out.println(c==a);
//		if(a==e) {
//			System.out.println("�� ����.");
//		}

		//new String : �Ҽ��� ���� �����й��� �ڷ��� (���� �� �迭��)
	}

}
