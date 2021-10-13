package hachmap_ex;

import java.util.*;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//map�� ������ ����
		map.put("1", "1");  //(key, value)
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", null); //null -> value�� �� ����
		map.put(null, "100");  // null -> key�� �� ����,  null �ߺ��� �Ұ���
		
		//map���� �����͸� �����ö�
		String value = map.get("3");
		System.out.println("key=3, value="+value);
		
		// Ű�� �ش��ϴ� ���� ������ �⺻���� ����
		value = map.getOrDefault("5", "�⺻��");
		System.out.println("key=5, value="+value);  // 5�� ������ 5�� ���� �������� ���Ƿ� �����ذ�
		
		// Ű��, value ���� ���翩�� Ȯ��
		boolean keyExists = map.containsKey(null);
		boolean valueExists = map.containsValue("100");
		System.out.println("nullŰ�� ���翩��"+keyExists);
		System.out.println("value�� 100�� �����ϴ°�?"+valueExists);
		
		// map�� ����� ��ü ����� ������
		Set<Entry<String,String>>entrySet = map.entrySet();
		System.out.println(entrySet);
		
		// Ű�� ����� ������
		Set<String> keySet = map.keySet();
		System.out.println("keySet = "+keySet);
		
		// value �� ���
		Collection<String> values = map.values();
		System.out.println("map values = "+values);
		
		// Ű�� ���� ���� ���� ->remove 
		String result = map.remove(null);
		System.out.println("���ŵ� ���� "+result);
		
		

	}

}
