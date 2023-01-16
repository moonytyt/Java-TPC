package kr.poly;

// 클래스를 설계할 때 기본적으로 생략된 코드
import java.lang.*;

// extends Object는 클래스를 설계할 때 기본적으로 생략된 코드
public class A extends Object {

	// 클래스를 설계할 때 기본적으로 생략된 코드
	public A() {
		super();
	}

	public void display() {
		System.out.println("A 클래스");
	}

	// toString()
	@Override
	public String toString() {
		return "toString 재정의";
	}

}
