import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���� �ϳ� �����ϼ���");
		int no = sc.nextInt();
		
		memoerys m = new memoerys();
		//memoerys m = null;
		m = new memoerys();
		m.ms(no); //�޸� �����ϸ鼭 �ڵ� �ۼ��ϴ¹�.
		m=null; //���⼭ �� �ʱ�ȭ  // �ش� �ν��Ͻ��� ���.
		m = new memoerys();
		m.rd();
		
	}

}
class memoerys{
	public void ms(int user) {
		//Math.random() ���� �޼ҵ� ���� : �⺻�ڷ��� double �Դϴ�
		/*
		 random > �����ڵ�, �����ڵ�, ��÷, �귿
		 */
		//double a = Math.random(); // 0.0 ~ 1.0 ����
		//int b = (int)(Math.random()*10);//���ϱ� �Ҷ� �� ��ȣ 	double > int�� �ٲ۰���.
		int w=0;
		while(w<10) {
			int b = (int)(Math.random()*10);
		//	System.out.printf("%d ",b);
			w++;
		}
		/*System.out.println(b);
	    if(user==b) {
	    	System.out.println("��÷");
	    }
	    else {
	    	System.out.println("������ȸ��");
	    }
		
		//System.out.println(b);
		 
		 */
		
		
	}
	public void rd() {//random util ���� 
		Random r = new Random();//random ��ü ���� �� �ν��Ͻ� ���� 
		int w=0;
		while(w<=5) {
			System.out.println(r.nextInt(45));//0~9���� //r.nextint�� ���
			w++;
		}
	//	System.out.println(r.nextInt(10));//0~9���� //r.nextint�� ���
		
		
		
		
		
		
	}
}
