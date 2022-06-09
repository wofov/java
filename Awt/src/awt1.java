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
	 GUI 모드 : AWT(abstract,window 도구들), SWING(AWT : 그래픽)
	 CUI 모드 : Scanner
	 SWING : Jframe > jpanel >jobject
	 */

	public static void main(String[] args) {
		//awt 생성 방식
		//Frame > Panel > Object (제작순서)
		//object > panel > frame (적용단계)
		popclose pc = new popclose();
		Frame fr = new Frame();// 프레임 창
		fr.setTitle("사용자 로그인");//창 이름
		fr.setSize(500,300);//창 크키
		fr.setVisible(true);//사용 유.무
		fr.addWindowListener(pc);//awp 메소드를 상속받아서 처리
		Panel pa = new Panel();//페널
		
		
		
		CheckboxGroup radio =new CheckboxGroup();//체크박스 구릅 성정
		TextField id =new TextField(10);//TextField 10자 까지 사용 가능
		TextField pw =new TextField(10);
		TextField sa = new TextField("사원번호 입력하세요");
		Button b1 = new Button("로그인");//오브젝트
		Checkbox c1 = new Checkbox("자동로그인");
		Checkbox c2=new Checkbox("동의함",false,radio);
		Checkbox c3=new Checkbox("동의안함",true,radio);
		
		pa.add(c3);
		
		pa.add(c2);
		pa.add(c1);
		pa.add(id);
		pa.add(sa);
		pa.add(pw);
		
		pa.add(b1);//add 추가 오브젝트를 패널에 적용
		fr.add(pa);//패널 > 프레임 적용
		
		
	}
	

}
class popclose extends WindowAdapter{
	public void windowClosing(WindowAdapter a) {
		System.out.println("프로그램 종료 합니다.");
		System.exit(0);
		System.gc();
	}
}
