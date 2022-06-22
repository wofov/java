import java.util.Scanner;

public class data_type {

	public static void main(String[] args) {
//		/intern() : equals를 사용하지 않고 ==,부등기호로 사용 가능. 
		String data[]= {"홍길동","홍길동"};
		String data1[]= new String[] {"홍길동"};//배열은 new사용해도 String pool에 있다
		//new 사용 하면 서로다른 heap구역으로 간다고 생각 하자. 
		String a="홍길동";
		String b="홍길동";
		String c=new String("홍길동").intern();
		String d=new String("홍길동");
		String d1=new String(data[0]).intern();
		//객체를 생성해서 올렸기 때문에 다르다고 생각. 
		//스캐너 또한 new를 생성해서 올렸기때문에 다름. 
		String e=data[0];
//		Scanner sc = new Scanner(System.in);
//		String f=sc.next();
		System.out.println(c==a);
//		if(a==e) {
//			System.out.println("값 같다.");
//		}

		//new String : 소속이 없는 자유분방한 자료형 (문자 및 배열형)
	}

}
