package package_example.mycompany;

//import package_example.hankook.SnowTire;
//import package_example.hyundai.Engine;
//import package_example.kumho.BigWidthTire;

import package_example.hankook.*; // *를 하면 패키지 안의 클래스를 모두 사용할 수 있음
import package_example.hyundai.*;
import package_example.kumho.*;

public class Car {
	// 필드
	// 다른 패키지 안의 클래스를 사용하려면 아래와 같이 클래가 위치한 패키지명을 지정해야함.
	//package_example.hyundai.Engine engine = new package_example.hyundai.Engine();
	//package_example.kumho.BigWidthTire tire1 = new package_example.kumho.BigWidthTire();
	
	// 패키지명을 지정하지 않고 클래스를 사용하려면 import를 사용
	Engine engine = new Engine();
	BigWidthTire tire1 = new BigWidthTire();
	SnowTire tire2 = new SnowTire();
	
	// hankook과 kumho 패키지 내에 동일한 이름의 Tire 클래스가 있으면 클래스 명 앞에 패키지명을 지정해줘야 함.
	package_example.hankook.Tire tire3 = new package_example.hankook.Tire();
	

}
