import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.RadialGradientPaint;
import java.awt.TextField;
import java.awt.event.WindowAdapter;

class awt1 {
	/*
	 GUI ��� : AWT(abstract,window ������), SWING(AWT : �׷���)
	 CUI ��� : Scanner
	 SWING : Jframe > jpanel >jobject
	 */

	public static void main(String[] args) {
		//awt ���� ���
		//Frame > Panel > Object (���ۼ���)
		//object > panel > frame (����ܰ�)
		popclose pc = new popclose();
		Frame fr = new Frame();// ������ â
		fr.setTitle("����� �α���");//â �̸�
		fr.setSize(500,300);//â ũŰ
		fr.setVisible(true);//��� ��.��
		fr.addWindowListener(pc);//awp �޼ҵ带 ��ӹ޾Ƽ� ó��
		Panel pa = new Panel();//���
		
		
		
		CheckboxGroup radio =new CheckboxGroup();//üũ�ڽ� ���� ����
		TextField id =new TextField(10);//TextField 10�� ���� ��� ����
		TextField pw =new TextField(10);
		TextField sa = new TextField("�����ȣ �Է��ϼ���");
		Button b1 = new Button("�α���");//������Ʈ
		Checkbox c1 = new Checkbox("�ڵ��α���");
		Checkbox c2=new Checkbox("������",false,radio);
		Checkbox c3=new Checkbox("���Ǿ���",true,radio);
		
		pa.add(c3);
		
		pa.add(c2);
		pa.add(c1);
		pa.add(id);
		pa.add(sa);
		pa.add(pw);
		
		pa.add(b1);//add �߰� ������Ʈ�� �гο� ����
		fr.add(pa);//�г� > ������ ����
		
		
	}
	

}
class popclose extends WindowAdapter{
	public void windowClosing(WindowAdapter a) {
		System.out.println("���α׷� ���� �մϴ�.");
		System.exit(0);
		System.gc();
	}
}
