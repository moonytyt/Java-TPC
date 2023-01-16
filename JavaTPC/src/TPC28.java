import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		System.out.println(a); // a는 a.toString()과 같다 재정의를 하지 않으면 주소가 출력

		Object o = new A(); // upcasting
		((A) o).display(); // downcasting
		System.out.println(o); // toString을 하위 클래스인 A에서 재정의 했기 때문에 재정의한 메서드 호출
		
		
	}
}