package kr.poly;

// Ŭ������ ������ �� �⺻������ ������ �ڵ�
import java.lang.*;

// extends Object�� Ŭ������ ������ �� �⺻������ ������ �ڵ�
public class A extends Object {

	// Ŭ������ ������ �� �⺻������ ������ �ڵ�
	public A() {
		super();
	}

	public void display() {
		System.out.println("A Ŭ����");
	}

	// toString()
	@Override
	public String toString() {
		return "toString ������";
	}

}
