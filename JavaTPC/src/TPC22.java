import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		// upcasting
		Animal ani = new Cat();
		ani.eat(); // �����Ͻ��� -> Animal, ������� -> Cat

		// ani.night();
		// Downcasting
		Cat c = (Cat) ani;
		// �Ʒ��� ���� �ٿ�ĳ������ �� �ִ�.
		((Cat) ani).night();

		ani = new Dog();
		ani.eat();
		// ������
		// ����Ŭ������ ����Ŭ�������� ������ �޼���� ���� �ٸ��� ���۽�Ű�� ����(����)
		
	}
}
