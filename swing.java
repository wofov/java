import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class swing {

	public static void main(String[] args) {
		/*wrapper class(box����)
		 float,char,byte,long,short(�⺻Ÿ��)
		 wrapper class : Byte, Integer, Long, Double */
		
			Integer a=new Integer(20);//int a=20;//��ڽ� > ��� ����
			Integer b=new Integer(20);//new integer (�ڽ�) >
			//���� �����ȣ ��� �ȵ� //��ȣ �ȿ� 20 �� ���� �ڽ� ���¶���.
			//���� ���� �ڽ� ���� ���Ҷ� equals��� // �ڽ̰� ��ڽ� ���Ҷ��� equals.
			if(a.equals(b)) {System.out.println(a+b);}
			Integer bo1 = 20;//��ڽ� �ڡ� ��ȣ Ȯ�� �߿�
			Integer no = new Integer(99);//�ڽ�
			int aa= no// ��ڽ�
			Integer bb= no.intValue();//��ڽ�
			System.out.println(bb);
			
			//Map �迭Ű�� �迭���� �ִ�. remove,get,size, ��put
			//Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�.(�ӵ��� �ֻ��)
			//���� Ű�� ���� �������� ����� ������ ���� �˴ϴ�. 
			//Ű ���� ���� �ߺ� ��Ű�� ���� 
			Map<String , String> m =new HashMap<>();
			//ex ) hong(�迭Ű) > hash function(hash map) > 0x231251 �̷������� �ߺ����� �߻����� ����.
			
			m.put("hong", "ȫ�浿");
			m.put("kang", "������");//put�� ���� ���ϴ� ��.
			m.put("","���鵵 Ű");// =���鵵 Ű �̷������� ��� ��
			//����ִ� Ű�� ����� �� ������,Map�� �������� �ùٸ��� ����. 
			System.out.println(m);//{hong=ȫ�浿, kang=������}
			System.out.println(m.get("hong"));//ȫ�浿 //�� �տ� �迭Ű.
			System.out.println(m.get("������"));//null
			m.put("park", "");//���� ��� //Ű�� ������ ���� ������� ��� 
			if(m.get("park").equals("")) {m.put("park", "��");}
			m.remove("hong");//Ű�� ���� ��.
			System.out.println(m);//{=���鵵 Ű, kang=������, park=��}
			System.out.println(m.get("park"));
			Map<String,Integer> m2 = new HashMap<>();//map ���� ���� �ڷ����� ����� �� ����. 
			//Map<String,Object> m2 = new HashMap<>(); >>������Ʈ�� ���� ��� �ڷ��� ���� �� ����. 
			
			m2.put("age", 32);
			m2.put("level", 5);
			System.out.println(m2.keySet());//Ű�� ��� �빮�� S
			System.out.println(m2.values());//���� ���
			System.out.println(m2.containsKey("age"));//�ش� Ű�� �ִ��� Ȯ��. ������ false, ������ true
			
			//�ݺ����� �̿��Ͽ� Ű���� �� �迭���� split���� �и��۾�
			String data[]= {"ȫ","��","��","��"};
			Map<String, String> m =new HashMap<>();
			int w =0;
			do {
					m.put("name"+w, data[w]);
					//��ϵ��� ���� Ű�� ���� + �ش� �迭�� �ִ� index��ȣ ��� 
					w++;
					//m.put(String.valueOf(w),data[w])>>�̷��Ե� ��밡��.
				}while(w<data.length);
			Map<String, String> m2 =new HashMap<>();
				for(String names : data) {
					m2.put(names, names+1);//for each�� Ű, ���� �����ϰ� ���� 
				}
			String alldata[]= {"name=ȫ�浿","age=22","email=joo@mejj"};
			Map<String,String> m3=new HashMap<>();
				for(int f=0;f<alldata.length;f++) {
					String key[]=alldata[f].split("=");
					m3.put(key[0], key[1]);
				}
				
			HashMap m =new HashMap<>();//������ �ڷ��� ��� ����. 
			Map m =new HashMap<>();//������ �ڷ��� ��� ����.
			for(int a=0;a< data.length;a++) {//2�� �迭 �ؽ������� �ٲٱ�/
				if(!m.containsKey(data[a][0])) {
					m.put(data[a][0],data[a][1]);
				}
				else {
					m.put(data[a][0]+a,data[a][1]);
				}
			}
			
			/*
			 �������� ���� ����
			 frame���� �� �ٷ� absolute ���·� layer�� �����մϴ�. 
			 �ڵ鸵 Ŭ������ ������Ʈ ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε��������մϴ�.
			 ������ ���� Ŭ���� �ڵ鸵 Ŭ���� ����.
			 */
			if(textField.getText().equals("")) {//����ڰ� �ؽ�Ʈ �ʵ忡 �Է��� ���� "" �̶� �� �ϴ� ��. 
				msg.setText("���̵� �Է��ϼ���");//�� �� ��(msg) ���ٰ� "���̵� ~"���
				}
			else {
				int lg = textField.getText().length();//�Է� ���� ���� 
				if(lg<5) {
					msg.setText("���̵�� 5�� �̻� ��� ����");
				}
				else {
					msg.setText("���̵� ���� ���Դϴ�.");
	            }
				
				 //keyPressed _ Ű�� ���� ��
				 //keyReleased _Ű�� ���� �� �ö�� ��
				 //keyTyped _ Ű�� �����Է���������
				//swing 6 �� �п����� Ȯ���ϱ�.
				
				JRadioButton rd1 = new JRadioButton("�ſ�ī��");
				rd1.setName("card");//������ ���̽��� �ѱ۷� ���� x ��, �ſ�ī��� ���� �ȵ� �³��� ���� ����� ���� 
				//setName ���� ����� ���� setName�� ������ ���� ������, ��׶��忡�� �ش� �Ӽ��� ���� �����ϴ� ���� ���մϴ�. 
				
				ButtonGroup ap =new ButtonGroup();
				//���� ���� ��ư�׷��� �̿� �ؾ� �Ѵ�. 
				ap.add(rd1);
				ap.add(rd2);
				ap.add(rd3);
				
				//���� 7�� ���� ��ư Ȯ���ϱ�
				
				//swing ���α׷��� �۵� �� �ش� �޼ҵ�� 1�� �� ���� �ǹǷ� ������ 
				//progress �ۼ�Ʈ �������� ��
				Timer t = new Timer();
				TimerTask task = new TimerTask() {
					@Override
					public void run() {
						pstart();
					}
				};
				t.schedule(task, 100);
			}
			public void pstart() {
				int w=0;
				try {
					while(w<=100) {
						Thread.sleep(50);
						this.progress.setValue(w);//setValue Value�� ������ W ���ڸ� ���������ϴ� ��
						w++;
					}
				}catch(Exception k) {
					System.out.println("�����߻�");
				}
				if(this.progress.getValue()==100) {//getValue �� W���ڰ� 100�϶� �޴°�.
					this.lb.setVisible(true);
					this.lb.setText("�ٿ���Ϸ�");
					
					JEditorPane webpage = new JEditorPane();// JEditorPane webpag�ڡ�
					webpage.setContentType("text/html");//setContentType ���ڵ� ��� �׸��� html�ڵ嵵 ���
					webpage.setText("<h1>ap</h1>" //>>���⿡ �̹��� �ּ� �ø��� �ȴ�.
				
				String list[]= {"skt","kt","lg","�˶���"};
				JComboBox cb = new JComboBox(list);
				
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\image3.jpg");
			    Image reimg = img.getImage();//�̹��� ���� ��θ� �ε�
			    //�̹��� �ε� ��ư Ŭ���� �ȿ��ٰ�
				
				
				
				
				
				
				
				
				
				
				
				
			

