package generic_test;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();  // 10개의 항목이 들어갈 수 있는 공간이 만들어짐
		
		strList.add("alpha");
		//기본형은 넣을 수 없음,  byte/int/long 등, byte->Byte/int->Int/long-< Long 기본명-> 참조형으로 바뀌면서 참조형으로 숫자를 넣을 수 있음
		strList.add("beta");
		
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i);  // 원래 스트링타입으로 들어가 있었기 댸문에(필드에) Object라고 해도 스트링 넣을 수 있음
			System.out.println(str);
		}
		
		// 숫자를 저장
		strList.add(Integer.valueOf(123));  // 매개변수로 넘겨줄수 없기 때문에 Object 어쩌구 낸거임 -> Integer.valueOf 뺴면 기냥 기본형 타입이라 안됌, Object 어쩌구 해야함
		
		System.out.println("숫자 저장 후 내용:");
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i); // 숫자를 String으로 바꾸려하니 오류나는것
			System.out.println(str);
		}

	}

}
