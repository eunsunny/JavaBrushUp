package hachmap_ex;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Double> tall = new HashMap<>();
		
		tall.put("����", 188.0);
		tall.put("�ӽÿ�", 166.0);
		tall.put("�����", 177.0);
		tall.put("������", 168.5);
		tall.put("����", 177.5);
		tall.put("��ȣ��", null);
		
		Double value = tall.get("�����");
		System.out.println("������� Ű�� "+value);
		
		//Set<String> keyset = tall.keySet();
		//Iterator<String> it1 = keySet.iterator() �� �ؿ� �����ذ�
		
		Iterator<String> it = tall.keySet().iterator();
		while (it.hasNext()) {
			String en = (String)it.next();
			System.out.println(en+tall.get(en));
		}
		
		Set <Entry<String, Double>> entrySet = tall.entrySet();
		System.out.println("��ü �� = "+entrySet);
		
		System.out.println("���� ����� ������ ��: "+tall.size());
		
		boolean keyExist = tall.containsKey("�����");
		System.out.println("������� Ű ���� �����մϱ�? " + keyExist);
		
		System.out.println("������� Ű��? "+tall.get("�����"));
		
		System.out.println("����ִ°�? "+tall.isEmpty());
		
		Double result = tall.remove("��ȣ��");
		System.out.println("��ȣ�� ���� �� ��ü �� = "+entrySet);
		
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
