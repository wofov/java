
public class time1 {

	public static void main(String[] args) {
/*
 try catch문 예외처리기능 문법 
 */
		int w = 1;
		while(w<11) {
			
			try {//예외 발생할 코드를 적용 
				Thread.sleep(1000);//1000 : 1초
				//Thread.sleep : 일시 정지 상태를 말합니다. 
			}catch(InterruptedException a){
				//InterruptedException : 해당 예외 발생이 되었을 경우 처리 하기 위한 문법
			}
			
			System.out.println(w);
			w++;
		}

	}

}
