
public class oop3 {
	//multi thread : start ,run, sleep, setstop
//��Ƽ ������ : cpu�� �ھ�� ���谡 �ִ�. 
	public static void main(String[] args) {
		//������ thread : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����.
		//multi thread : ���μ��� ���ο��� �� ���� �̻��� �۾��� ���� ���
		//������ > ���
		//��Ƽ ������ > ��� �ٸ���1 �ٸ���2 /��Ƽ �½�ŷ
		Thread my = new mythread();
		Thread my2 =new test2();
		my.start();
		my2.start();//������ �޼ҵ忡 �⺻ run�� �ۿ��ϱ� ���� start ��ɾ� �Դϴ�. 
		int a1 = 1;
		while(a1<6) {
			System.out.println("���� Ŭ���� : "+a1);
			a1++;
		}
	}
}
class test2 extends Thread{
	@Override
   public void run() {
		int a2 = 1;
		while(a2<6) {
			System.out.println("�ܺ�2 Ŭ���� : "+a2);
			a2++;
		}
	}
}
class mythread extends Thread{//������ : JVR�⺻���� ž�� �Ǿ� �ִ� �޼ҵ�
	//������� �ܵ����� ������� ����. extends �� ���� ���
	@Override
	public void run() {//run�̶� : ��Ƽ �޼ҵ� �⺻ ���� �޼ҵ� 
		int a = 1 ;
		while(a<6) {
			System.out.println("�ܺ�1 Ŭ���� : "+ a);
			a++;
		}
	}
}