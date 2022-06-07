
public class Method81 {

	public static void main(String[] args) {
		/*
		 응용문제 협엽 프로그래머가 해당 db의 값 중 
		 홀수 값에 대한 총 갯수를 받고자 합니다.
		 해당 갯수를 출력 될 수 있도록 코드를 작성하세요. 
		 */
		oddd pp=new oddd();
		System.out.println(pp.aaa());

	}

}
class oddd{
	private int ori[];//배열값이 변경되지 않도록 사용
	private int count=0;//홀수 일 경우 +1씩 증가 하기 위한 필드 변수값
	public oddd() {		
		int odata2[]= {15,22,17,14,32,35,19,33};
		this.ori=odata2;
	//	aaa();
	
	
	}
	public int aaa() {
		int w=0;
		int ea=this.ori.length;
		while(w<ea) {
			if(this.ori[w]%2==1) {
				this.count++;//홀수이면 +1씩 증가 
			}
			w++;
		}
		return this.count;//최종 값을 return시킴
	}
	
	
}