import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class exception7 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
		 �ش� ������ �� �� ���� ���� ��� �ǵ��� �� �迭 �Ͻÿ�. 
		 ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� ���� �� ���� �մϴ�.
		 �ش� ���� ���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�. 
		 getter���� �ش� �迭�� �������� �������� �մϴ�.
		 ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		redata r = new redata();
		try {
			Object data[]= {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
			r.setter(data);
			LinkedList<String> result = r.getter();
			System.out.println(result);
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
			}
		}
		
	}
	
}
class redata{
	LinkedList<String> redata = new LinkedList<>();//>������ �̷��� ����ص� �����ϵ� ��. 
	
	public void setter(Object[] call) throws Exception {
		int ea = call.length;
		int w=0;
		//int ck = Integer.valueOf((int)call[1]);
		//int ck = (int)call[1];>�����϶� ���� ���� _������Ʈ
		//String ck = (String)call[1];>�����϶� ���� ���� _������Ʈ
		do {
			try {
				//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object�迭 �̹Ƿ� �����Ͽ���. 
				String ck = String.valueOf((String)call[w]);
				this.redata.add(ck);
				
			}catch(Exception ex) {//�ڽ� class���� ���� �߻��� ��µǴ� catch��
				//��, throw ����ϸ� �ٽ� main���� ���� //__throw�� ���޽� �ش� �ݺ��� ����.
				//�� ���� �߻����ڸ��� �ݺ��� ����. 
			    //���⼭ ���� ���� errors �޼ҵ�� ������ ����. 
				//System.out.println(ex); //>>������ ���⼭ ó���Ѱ�
				//throw ���� ������ ���� �����°�.
			}
			w++;
		}while(w<ea);
//		System.out.println(this.redata);
	}
	public void errors(String msg) {
		System.out.println(msg);
	}
	public LinkedList<String> getter() {
		//�迭 Ŭ���� �̸����� ���� �� ����. 
		
		return this.redata;
		
	}
}