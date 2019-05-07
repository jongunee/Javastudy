package inheritance;

public class Child1 extends Parent{
	void b() {
		a();
		//c();	사용 불가 c 메소드 없음
	}
}
