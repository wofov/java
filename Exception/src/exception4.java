import java.io.IOException;

public class exception4 {

	public static void main(String[] args) throws IOException{
	try {
		ex e =new ex();
		e.loader("ok");
		//throw : 자신을 호출하여 예외가 발생 하면 자신을 호출한 class로 return
		
	}catch(Exception e) {
		//Exception e 이거 작동할려면
		//this.ea = new Exception();
		//throw this.ea; > 이거 있어야함. 
		System.out.println(e);
		
	}

	}

}
class ex{
	Exception ea=null;
//	IOException io = null;
	/*//자신의 오류를 상위 main 클래스에 모두 전달하는 상황//아래 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우 */
	public void loader(String a) throws Exception{//throws 쓰는 순간 메인 메소드에 try catch 작성 해아함.
		//throws try-catch를 받기 위한 class를 로드
		//IOE 는 fileReader 이런거 사용할때 있어야함.(특수)
//		if(a=="ok") {
//			
//		}
//		else {
//		
////			int k = Integer.valueOf(a);
////			int keycode = Integer.valueOf(a);
//			//아래 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우 
//			//자신의 오류를 상위 main 클래스에 모두 전달하는 상황
//			this.ea = new Exception();
//			throw this.ea;
//		}
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("tt");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());//내꺼 오류 확인해보자 하고 보내는것
			//자신의 오류 상황을 리턴 받아서 확인함. 
			this.ea = new Exception();
			throw this.ea;
			
		}
		
			
		}
}