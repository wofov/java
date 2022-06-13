import java.util.Arrays;

/*배열 신규 생성값을 정확하게 설정하여 신규 배열로 생성하기.*/
public class oop2 {

	public static void main(String[] args) {
		array1 ar = new array1();
		
	}

}
class array1{
	private int ar1[];//={1,2,3,4,5,6,7};
	private int ea;
	public array1() {
	
		//배열을 필드에 있는 변수 선언으로 처리하는 방식
		this.ar1= new int[] {1,2,3,4,5,6,7};
		this.ea= this.ar1.length;
		//5이상의 배열값만 가져오기
		int w = 0 ;
		String newdata ="";
		while(w<ea){
			if(this.ar1[w]>=5) {
				newdata +=this.ar1[w]+",";
				//해당 조건에 맞는 값만 문자열로 변환하여 저장 하는 방식.
			}
			w++;
		}
		String ar2[]=newdata.split(",");
		int ar2_ea=ar2.length;
		int oridata[]=new int[ar2_ea];
		System.out.println(Arrays.toString(ar2));
		System.out.println(ar2_ea);
		//문자열 갯수만큼 배열 생성자 값을 추가하게 됩니다. 
		int ww=0;
		while(ww<ar2_ea) {
			oridata[ww]= Integer.parseInt(ar2[ww]);
			ww++;
			
		}
		System.out.println(Arrays.toString(oridata));
		
	}
	
}