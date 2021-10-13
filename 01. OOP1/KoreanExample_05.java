// 한국인을 나타내는 클래스
class Korean { 
	String nation = "대한민국";
	String name;   // 멤버변수
	String birthday;
	
	// 기본생성자
	Korean() { }
	
	// 매개변수가 있는 생성자
	// 입력 매개변수 : n, b
	// n : name값을 설정
	// b : birthday값을 설정
	/*
	Korean(String n, String b) {  // 입력 매게변수
		name = n;
		birthday = b;		
	}
	*/
	// 참조변수 : this. -> 인스턴스 자신을 가르킨다.
	Korean(String name, String birthday) {
		this.name = name;  // this.name 이 멤버변수, 변수 이름이 같을때 this를 넣어줌(헷갈리지 않게)
		this.birthday = birthday;	// 보통 멤버변수와 매게변수와 동일하게 쓴다(헷갈리지 않도록)
	}
}

public class KoreanExample_05 {

	public static void main(String[] args) {
		Korean k1 = new Korean();
		System.out.println("국적="+k1.nation);
		System.out.println("이름="+k1.name);
		System.out.println("생일="+k1.birthday);
		
		// 매개변수가 있는 생성자의 사용
		Korean k2 = new Korean("홍길동", "14900705");
		System.out.println("k2국적="+k2.nation);
		System.out.println("k2이름="+k2.name);
		System.out.println("k2생일="+k2.birthday);
	}

}
