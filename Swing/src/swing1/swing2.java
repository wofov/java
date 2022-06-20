package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//arrayList,linkedList 배열값이 있다 -add,remove,get,size
		//Map 배열키와 배열값이 있다. remove,get,size, put
		//Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인합니다.(속도는 최상급)
		//같은 키를 사용시 마지막에 적용된 값으로 갱신 됩니다. 
		//키 값을 절대 중복 시키지 않음 
		Map<String,String> m =new HashMap<>();
		//ex ) ghong(배열키) > hash function(hash map) > 0x231251 이런식으로 중복값이 발생하지 않음.
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");//put은 값을 더하는 것.
		m.put("","공백도 키");// =공백도 키 이런식으로 출력 됨
		//비어있는 키를 사용할 수 있으나,Map에 원리에는 올바르지 않음. 
		System.out.println(m);//{hong=홍길동, kang=강감찬}
		System.out.println(m.get("hong"));//홍길동 //즉 앞에 배열키.
		System.out.println(m.get("강감찬"));//null
		m.put("park", "");//공백 출력 //키는 있으나 값이 비어있을 경우 
		if(m.get("park").equals("")) {
			m.put("park", "박");
		}
		m.remove("hong");//키를 삭제 함.
		System.out.println(m);//{=공백도 키, kang=강감찬, park=박}
		System.out.println(m.get("park"));
		
		//map 여러 개의 자료형을 사용할 수 있음. 
		Map<String,Integer> m2 = new HashMap<>();
		//Map<String,Object> m2 = new HashMap<>(); >>오브젝트로 인해 모든 자료형 받을 수 있음. 
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);//{level=5, age=32}
		System.out.println(m2.get("level"));//5 출력
		System.out.println(m2.keySet());//키만 출력 대문자 S
		System.out.println(m2.values());//값만 출력
		System.out.println(m2.containsKey("age"));//해당 키가 있는지 확인. 없으면 false, 있으면 true
	}

}
