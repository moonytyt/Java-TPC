import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// �������μ�
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
	}

	/*
	 * private static void display(Dog d) {
	 * 
	 * }
	 * 
	 * private static void display(Cat c) {
	 * 
	 * }
	 */							//upcasting
	private static void display(Animal r) {
		r.eat();
		// r.night();
		if (r instanceof Cat) { // r�� CatŸ�����κ��� �ν��Ͻ��� ����������� true ����
			((Cat) r).night(); // downcasting
		}
	}

}
