import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
	
		 /*int a=3;
		 System.out.println(a++);
		 System.out.println(++a);
         
		int b =10;
		int c = 10;
		int d = ++b + (++c);//��ȣ �̿��ϱ�
		System.out.println(d);
		*/
		Scanner sc = new Scanner(System.in);//�Է¿���
	    int su;//������Է�
		int total=0;//����ڰ� �Է��� �հ�
		int f;//�ݺ���
		for(f=1;f<4;f++) {
			System.out.println("������ �Է����ּ���");
			su = sc.nextInt();//����ڰ��Է��Ѱ�
			total += su;//����ڰ� �Է��� ���� �հ躯���� �̰�
		}
		System.out.println("�� ������ ���� "+total);//�հ�
		sc.close();//��������
		
		
	}

}
