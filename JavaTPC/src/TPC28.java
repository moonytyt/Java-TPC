import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		System.out.println(a); // a�� a.toString()�� ���� �����Ǹ� ���� ������ �ּҰ� ���

		Object o = new A(); // upcasting
		((A) o).display(); // downcasting
		System.out.println(o); // toString�� ���� Ŭ������ A���� ������ �߱� ������ �������� �޼��� ȣ��
		
		
	}
}