package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//arrayList,linkedList �迭���� �ִ� -add,remove,get,size
		//Map �迭Ű�� �迭���� �ִ�. remove,get,size, put
		//Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�.(�ӵ��� �ֻ��)
		//���� Ű�� ���� �������� ����� ������ ���� �˴ϴ�. 
		//Ű ���� ���� �ߺ� ��Ű�� ���� 
		Map<String,String> m =new HashMap<>();
		//ex ) ghong(�迭Ű) > hash function(hash map) > 0x231251 �̷������� �ߺ����� �߻����� ����.
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");//put�� ���� ���ϴ� ��.
		m.put("","���鵵 Ű");// =���鵵 Ű �̷������� ��� ��
		//����ִ� Ű�� ����� �� ������,Map�� �������� �ùٸ��� ����. 
		System.out.println(m);//{hong=ȫ�浿, kang=������}
		System.out.println(m.get("hong"));//ȫ�浿 //�� �տ� �迭Ű.
		System.out.println(m.get("������"));//null
		m.put("park", "");//���� ��� //Ű�� ������ ���� ������� ��� 
		if(m.get("park").equals("")) {
			m.put("park", "��");
		}
		m.remove("hong");//Ű�� ���� ��.
		System.out.println(m);//{=���鵵 Ű, kang=������, park=��}
		System.out.println(m.get("park"));
		
		//map ���� ���� �ڷ����� ����� �� ����. 
		Map<String,Integer> m2 = new HashMap<>();
		//Map<String,Object> m2 = new HashMap<>(); >>������Ʈ�� ���� ��� �ڷ��� ���� �� ����. 
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);//{level=5, age=32}
		System.out.println(m2.get("level"));//5 ���
		System.out.println(m2.keySet());//Ű�� ��� �빮�� S
		System.out.println(m2.values());//���� ���
		System.out.println(m2.containsKey("age"));//�ش� Ű�� �ִ��� Ȯ��. ������ false, ������ true
	}

}
