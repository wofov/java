import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ��ٱ��Ͽ� ���� ���� ��ǰ�� ����� �ֽ��ϴ�
		 �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����ϼ���
		 �ù��� 30000 �̻� (����)
		 15000 48000 67000 8000 118200 49800 6000 18700
		 
		 ��� [48000 67000 118200 49800] < ��ȣ ������ �迭 ����� ���
		 */
		int a[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int b[] = new int[4];
		int a1 = a.length;
		int aa = 0;
		int ct = 0;
		while(aa<a1) {
			if(a[aa]>=30000) {
				b[ct]=a[aa];
				ct++;
			}
			aa++;
		}
		System.out.println(Arrays.toString(b));
		
		/*
		���빮�� {"�ܹ���","����","ġŲ","Ŀ��"}
		�ֹ��ϰ��� �ϴ� ������ �����ϼ��� < ����
		�ش� ������ �� 4�� ����ϴ�
		��, "�ֹ�����"��� �Է½� ��� �ֹ� ����Ǹ�,
		�ֹ������� ���.
		 */
		String z[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		String bbb[] = new String[4];
	    Scanner sc = new Scanner(System.in);
	    String zzz;
		int y =z.length;
		int abc = 0 ;
		int ctt = 0;
		while(abc<y) {
			System.out.println("�ֹ� �޴��� �����ϼ���");
			zzz = sc.next();
			
				if(zzz.equals("�ܹ���")||zzz.equals("����")||zzz.equals("ġŲ")||zzz.equals("Ŀ��")) {
					bbb[ctt]=z[abc];
					ctt++;
				}
				else if(zzz.equals("�ֹ�����")) {
					break;
				}
			
			abc++;
		}
		System.out.println(Arrays.toString(bbb));
		
		
		
		
		
		

	}

}
