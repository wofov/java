import java.util.Scanner;

public class Loop_Scan2 {

	public static void main(String[] args) {
		//��ĳ�ʿ� �Բ� while ������ ����ڰ� �Է��ϴ�
		//������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�
		Scanner a = new Scanner(System.in);
		System.out.println("���ϴ� �������� ���ڸ� �Է��ϼ���");
		int b = a.nextInt();
		int c=1;
		int j;
	    while(c<10) {
	    	j=c*b;
	    	System.out.printf("%d ",j);
	    	c++;
	    }
	    a.close();

	}

}
