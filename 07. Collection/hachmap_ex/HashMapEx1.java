package hachmap_ex;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Double> tall = new HashMap<>();
		
		tall.put("김우빈", 188.0);
		tall.put("임시완", 166.0);
		tall.put("김수현", 177.0);
		tall.put("권지용", 168.5);
		tall.put("에릭", 177.5);
		tall.put("강호동", null);
		
		Double value = tall.get("김수현");
		System.out.println("김수현의 키는 "+value);
		
		//Set<String> keyset = tall.keySet();
		//Iterator<String> it1 = keySet.iterator() 를 밑에 합쳐준거
		
		Iterator<String> it = tall.keySet().iterator();
		while (it.hasNext()) {
			String en = (String)it.next();
			System.out.println(en+tall.get(en));
		}
		
		Set <Entry<String, Double>> entrySet = tall.entrySet();
		System.out.println("전체 값 = "+entrySet);
		
		System.out.println("현재 저장된 데이터 수: "+tall.size());
		
		boolean keyExist = tall.containsKey("김수현");
		System.out.println("김수현의 키 값이 존재합니까? " + keyExist);
		
		System.out.println("김수현의 키는? "+tall.get("김수현"));
		
		System.out.println("비어있는가? "+tall.isEmpty());
		
		Double result = tall.remove("강호동");
		System.out.println("강호동 삭제 후 전체 값 = "+entrySet);
		
		Set <String> keySet = tall.keySet();
		
		
//		while (it.hasNext()) {
//			String en = (String) it.next();
//		}
		
		
//		Iterator it = (Iterator) tall.keySet();
//		
//		while (it.g) {
//			Entry en = (Entry)it.next();
//			System.out.println("Iterator="+en);
//		}
//		Iterator it = ((Set<Entry<String, Double>>) tall).iterator(); 
//		
//		while (it.hasNext()) {
//			Entry en = (Entry)it.next();
//			System.out.println("Iterator="+en);
//		}

		
	}

}
