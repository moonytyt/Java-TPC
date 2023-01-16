package kr.poly;

public abstract class Animal { // 추상클래스(불완전한객체) -> Animal ani = new Animal(); 불가능
	// Dog, Cat --> eat()
	public abstract void eat(); // 추상메서드(불완전한메서드)

	public void move() { // 구현메서드
		System.out.println("이동이동이동");
	}
}