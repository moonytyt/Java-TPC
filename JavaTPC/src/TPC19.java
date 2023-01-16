import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {

		// Animal <--- [Dog, Cat]

		Dog d = new Dog();
		d.eat();
		
		Animal ani = new Dog();
		ani.eat();

		ani = new Cat();
		ani.eat();
	}
}