import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();

		Cat c = new Cat();
		c.eat();
		c.night();

		Animal d1 = new Dog();
		d1.eat();
		Animal c1 = new Cat();
		c1.eat();
		((Cat)c1).night();
	}
}
