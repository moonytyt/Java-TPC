import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// 다형성인수
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
		if (r instanceof Cat) { // r이 Cat타입으로부터 인스턴스가 만들어졌으면 true 실행
			((Cat) r).night(); // downcasting
		}
	}

}
