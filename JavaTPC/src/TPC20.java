import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않음 -> 상속의 이점을 이용x
		Dog d = new Dog();
		d.eat(); // ? -> 강아지밥

		Cat c = new Cat();
		c.eat(); // 고양이밥
		c.night();

		Animal d1 = new Dog(); // 상속관계면 부모=자식()이 가능 => 자동으로 형변환
								// 하위 클래스가 상속클래스로 형변환 => upcasting
		d1.eat(); // 강아지밥, Override를 통해 하위 클래스르 접근.

		Animal c1 = new Cat();
		c1.eat(); // 고양이밥
		// c1.night(); -> Cat클래스의 메서드이고 Animal에 없는 메서드이기 때문에 접근 불가능
		((Cat) c1).night(); // 밤에 눈에서 빛이난다 --> downcasting(강제형변환)

	}
}
