
public class If_for {

	public static void main(String[] args) {
		final int a = 1;
		//final ���� �������� ����� ����
		//��� : ���� ������ �ʴ� ��
		final String name = "ȫ�浿";
		//name ="�̼���";
		//System.out.println(name);
		
		final int ct = 11;//���尪
		int f;//�ݺ���
		boolean ok = false;//���ǿ� ���� true, false
		for(f=1;f<10;f++) {
			if(f==ct) {//�ݺ��� ���� �������� ���� ��� 
				System.out.println("��ϵ� ���� Ȯ�ε˴ϴ�");
				ok = true; //���ǿ� ���� ���� ���� 
			}
		
		}
        if(ok==false) {//���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ� 
        	System.out.println("Ȯ���� ���� ���� ���� �Դϴ�");
        }
        
        /*
         �� 20���� ���� �ݺ��մϴ� .
         �� �� Ȧ�� ���� ����Ͻÿ�
         */
        int ff;
        String odd=""; // oddȦ�� even¦��
        for(ff=1;ff<21;ff++) {
        	if(ff%2==0) {
        		System.out.print(ff+" ");
        	}//
        	else {//���࿡ Ȧ�� ���� ��� odd������ ���������� ���� �߰��ϰ� �ȴ�.
        		odd = odd + " " + ff; //�߰� �� ��� " " �� ������ Ȱ���Ͽ� ���� ��.
        	
        	}
        }
        System.out.println(odd);
        
        
	}

}
