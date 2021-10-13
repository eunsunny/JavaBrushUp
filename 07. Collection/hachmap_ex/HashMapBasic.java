package hachmap_ex;

import java.util.*;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//map에 데이터 저장
		map.put("1", "1");  //(key, value)
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", null); //null -> value의 값 가능
		map.put(null, "100");  // null -> key의 값 가능,  null 중복은 불가능
		
		//map에서 데이터를 가져올때
		String value = map.get("3");
		System.out.println("key=3, value="+value);
		
		// 키에 해당하는 값이 없으면 기본값을 지정
		value = map.getOrDefault("5", "기본값");
		System.out.println("key=5, value="+value);  // 5가 없으니 5에 대한 벨류값을 임의로 정해준거
		
		// 키값, value 값의 존재여부 확인
		boolean keyExists = map.containsKey(null);
		boolean valueExists = map.containsValue("100");
		System.out.println("null키의 존재여부"+keyExists);
		System.out.println("value에 100이 존재하는가?"+valueExists);
		
		// map에 저장된 전체 목록을 가져옴
		Set<Entry<String,String>>entrySet = map.entrySet();
		System.out.println(entrySet);
		
		// 키의 목록을 가져옴
		Set<String> keySet = map.keySet();
		System.out.println("keySet = "+keySet);
		
		// value 의 목록
		Collection<String> values = map.values();
		System.out.println("map values = "+values);
		
		// 키에 대한 값을 제거 ->remove 
		String result = map.remove(null);
		System.out.println("제거된 값은 "+result);
		
		

	}

}
