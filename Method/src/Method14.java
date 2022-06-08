
public class Method14 {

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("이순신");

	}

}
class Mbc{
	public Mbc() {//일반 construct
		System.out.println("구조1");
		test();
	}
    public Mbc(String user) {// construct 인수값이 있는 
	
    	System.out.println(user);
    	test(user);
	}
    public void test() {//construct에서 인수값은 자료형으로 구분 ★★★★
    	System.out.println("메소드");
    	total();
    }
    public void test(String user) {//인수값이 있는 메소드
    	System.out.println(user);
    	total();
    }
    public static void total() {
    	System.out.println("시스템종료");
    }
}