import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 ���� ������ ���� �ֽ��ϴ�.
		 a1 {"ȫ�浿","�̼���","������","������","������"}
		 a2 {100, 80, 39, 60, 55}
		 �˻��ϰ��� �ϴ� �̸��� �����ּ���
		 �˻�� �̼����̶�� �˻��ϸ� 
		 �̼��Ŵ��� 80�� �Դϴ�. ��� ����ϼ���
		 */
		//00,10,//01,11
		String a1[]={"ȫ�浿","�̼���","������","������","������"};
		String a2[]={"100", "80", "39", "60", "55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸���?");
		String user_name =sc.next();//����ڰ� �Է� //2�� ���� ���ϱ�
		
		jumsu j =new jumsu();
		j.ck(a1,a2,user_name);//�丸 �����ϴ°� �ƴ϶� �ʿ��� ������ �����°�.//���� // 1�� ������ �� Ȯ���ϱ�ڡڡ�	   
		
		
	}

}
class jumsu{
	public void ck(String data1[],String data2[],String user) {//��
	  // System.out.println(Arrays.toString(data1));
		System.out.println(user);
		
		
	}
}


class point{
	public void number(String user[], String po[]) {
		int a=0;
		String msg = "";
		while(a<5) {
			if(user[a].equals(user)) {
				msg = user[a] + po[a];
			}
			
			
			a++;
		}
		
		System.out.println(msg);
		
	}
}
