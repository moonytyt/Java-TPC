package kr.poly;

public class Cat extends Animal {

	public void night() {
		System.out.println("¹ã¿¡ ´«ÀÌ ºû³­´Ù");
	}

	@Override
	public void eat() {
		System.out.println("°í¾çÀÌ¹ä");
	}

}
