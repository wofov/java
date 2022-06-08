
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(상속)
		/*
		 절대 부모 클래스에 construct 부문에 인수값을 작용하면
		 자식 클래스에서 로드를 못하는 사항이 발생함
		 단, 자식 클래스에서 인수값을 적용하면 construct를 사용할수있음.
		 */

		//mth1 m1 = new mth1();
		mth2 m2= new mth2(2);
		
	}

}
class mth1{
	public int no;
	public mth1(/*int z*/) {// > 인수값 ㄴㄴ
		this.no=20;
		System.out.println("mth1");
	}
//	class mth1{
//		public int no;
//		public mth1() {// 
//			this.no=20; > 이거는 가능함
//			System.out.println("mth1");
//		}
}
class mth2 extends mth1{
	public mth2(int a) {//>>하지만 자식은 인수값 가능
		
		System.out.println("mth2");
	}
}