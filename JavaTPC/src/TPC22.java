import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		// upcasting
		Animal ani = new Cat();
		ani.eat(); // 컴파일시점 -> Animal, 실행시점 -> Cat

		// ani.night();
		// Downcasting
		Cat c = (Cat) ani;
		// 아래와 같이 다운캐스팅할 수 있다.
		((Cat) ani).night();

		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위클래스가 하위클래스에게 동일한 메서드로 서로 다르게 동작시키는 원리(개념)
		
	}
}
