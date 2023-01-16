import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal �θ�Ŭ������ ������� ���� -> ����� ������ �̿�x
		Dog d = new Dog();
		d.eat(); // ? -> ��������

		Cat c = new Cat();
		c.eat(); // ����̹�
		c.night();

		Animal d1 = new Dog(); // ��Ӱ���� �θ�=�ڽ�()�� ���� => �ڵ����� ����ȯ
								// ���� Ŭ������ ���Ŭ������ ����ȯ => upcasting
		d1.eat(); // ��������, Override�� ���� ���� Ŭ������ ����.

		Animal c1 = new Cat();
		c1.eat(); // ����̹�
		// c1.night(); -> CatŬ������ �޼����̰� Animal�� ���� �޼����̱� ������ ���� �Ұ���
		((Cat) c1).night(); // �㿡 ������ ���̳��� --> downcasting(��������ȯ)

	}
}
