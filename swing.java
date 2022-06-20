import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class swing {

	public static void main(String[] args) {
		/*wrapper class(box상태)
		 float,char,byte,long,short(기본타입)
		 wrapper class : Byte, Integer, Long, Double */
		
			Integer a=new Integer(20);//int a=20;//언박싱 > 계산 가능
			Integer b=new Integer(20);//new integer (박싱) >
			//서로 산술기호 계산 안됨 //괄호 안에 20 을 보고 박싱 상태라함.
			//또한 서로 박싱 상태 비교할때 equals사용 // 박싱과 언박싱 비교할때도 equals.
			if(a.equals(b)) {System.out.println(a+b);}
			Integer bo1 = 20;//언박싱 ★★ 괄호 확인 중요
			Integer no = new Integer(99);//박싱
			int aa= no// 언박싱
			Integer bb= no.intValue();//언박싱
			System.out.println(bb);
			
			//Map 배열키와 배열값이 있다. remove,get,size, ★put
			//Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인합니다.(속도는 최상급)
			//같은 키를 사용시 마지막에 적용된 값으로 갱신 됩니다. 
			//키 값을 절대 중복 시키지 않음 
			Map<String , String> m =new HashMap<>();
			//ex ) hong(배열키) > hash function(hash map) > 0x231251 이런식으로 중복값이 발생하지 않음.
			
			m.put("hong", "홍길동");
			m.put("kang", "강감찬");//put은 값을 더하는 것.
			m.put("","공백도 키");// =공백도 키 이런식으로 출력 됨
			//비어있는 키를 사용할 수 있으나,Map에 원리에는 올바르지 않음. 
			System.out.println(m);//{hong=홍길동, kang=강감찬}
			System.out.println(m.get("hong"));//홍길동 //즉 앞에 배열키.
			System.out.println(m.get("강감찬"));//null
			m.put("park", "");//공백 출력 //키는 있으나 값이 비어있을 경우 
			if(m.get("park").equals("")) {m.put("park", "박");}
			m.remove("hong");//키를 삭제 함.
			System.out.println(m);//{=공백도 키, kang=강감찬, park=박}
			System.out.println(m.get("park"));
			Map<String,Integer> m2 = new HashMap<>();//map 여러 개의 자료형을 사용할 수 있음. 
			//Map<String,Object> m2 = new HashMap<>(); >>오브젝트로 인해 모든 자료형 받을 수 있음. 
			
			m2.put("age", 32);
			m2.put("level", 5);
			System.out.println(m2.keySet());//키만 출력 대문자 S
			System.out.println(m2.values());//값만 출력
			System.out.println(m2.containsKey("age"));//해당 키가 있는지 확인. 없으면 false, 있으면 true
			
			//반복문을 이용하여 키생성 및 배열값을 split으로 분리작업
			String data[]= {"홍","강","이","유"};
			Map<String, String> m =new HashMap<>();
			int w =0;
			do {
					m.put("name"+w, data[w]);
					//등록되지 않은 키값 생성 + 해당 배열에 있는 index번호 사용 
					w++;
					//m.put(String.valueOf(w),data[w])>>이렇게도 사용가능.
				}while(w<data.length);
			Map<String, String> m2 =new HashMap<>();
				for(String names : data) {
					m2.put(names, names+1);//for each로 키, 값이 동일하게 적용 
				}
			String alldata[]= {"name=홍길동","age=22","email=joo@mejj"};
			Map<String,String> m3=new HashMap<>();
				for(int f=0;f<alldata.length;f++) {
					String key[]=alldata[f].split("=");
					m3.put(key[0], key[1]);
				}
				
			HashMap m =new HashMap<>();//데이터 자료형 상관 없이. 
			Map m =new HashMap<>();//데이터 자료형 상관 없이.
			for(int a=0;a< data.length;a++) {//2차 배열 해쉬맵으로 바꾸기/
				if(!m.containsKey(data[a][0])) {
					m.put(data[a][0],data[a][1]);
				}
				else {
					m.put(data[a][0]+a,data[a][1]);
				}
			}
			
			/*
			 본격적인 스윙 시작
			 frame생성 후 바로 absolute 형태로 layer을 변경합니다. 
			 핸들링 클래스가 오브젝트 보다 상위코드에 있으면 해당 오브젝트를 로드하지못합니다.
			 프레임 더블 클릭시 핸들링 클래스 생성.
			 */
			if(textField.getText().equals("")) {//사용자가 텍스트 필드에 입력한 값을 "" 이랑 비교 하는 것. 
				msg.setText("아이디를 입력하세요");//비교 후 라벨(msg) 에다가 "아이디를 ~"출력
				}
			else {
				int lg = textField.getText().length();//입력 문자 갯수 
				if(lg<5) {
					msg.setText("아이디는 5자 이상만 사용 가능");
				}
				else {
					msg.setText("아이디 검토 중입니다.");
	            }
				
				 //keyPressed _ 키를 누를 때
				 //keyReleased _키를 누른 후 올라올 때
				 //keyTyped _ 키를 문자입력을받을때
				//swing 6 번 학원에서 확인하기.
				
				JRadioButton rd1 = new JRadioButton("신용카드");
				rd1.setName("card");//데이터 베이스느 한글로 저장 x 즉, 신용카드로 저장 안됨 셋네임 옆에 영어로 저장 
				//setName 옆에 영어로 저장 setName은 노출은 되지 않으며, 백그라운드에서 해당 속성에 값을 적용하는 것을 말합니다. 
				
				ButtonGroup ap =new ButtonGroup();
				//라디오 사용시 버튼그룹을 이용 해야 한다. 
				ap.add(rd1);
				ap.add(rd2);
				ap.add(rd3);
				
				//스윙 7에 라디오 버튼 확인하기
				
				//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되므로 적용함 
				//progress 퍼센트 차오르는 것
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
						this.progress.setValue(w);//setValue Value를 보낸다 W 숫자를 보여지게하는 것
						w++;
					}
				}catch(Exception k) {
					System.out.println("오류발생");
				}
				if(this.progress.getValue()==100) {//getValue 그 W숫자가 100일때 받는거.
					this.lb.setVisible(true);
					this.lb.setText("다운도르완료");
					
					JEditorPane webpage = new JEditorPane();// JEditorPane webpag★★
					webpage.setContentType("text/html");//setContentType 문자도 사용 그리고 html코드도 사용
					webpage.setText("<h1>ap</h1>" //>>여기에 이미지 주소 올리면 된다.
				
				String list[]= {"skt","kt","lg","알뜰폰"};
				JComboBox cb = new JComboBox(list);
				
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\image3.jpg");
			    Image reimg = img.getImage();//이미지 파일 경로를 로드
			    //이미지 로드 버튼 클래스 안에다가
				
				
				
				
				
				
				
				
				
				
				
				
			

