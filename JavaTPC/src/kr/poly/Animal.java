package kr.poly;

public abstract class Animal { // �߻�Ŭ����(�ҿ����Ѱ�ü) -> Animal ani = new Animal(); �Ұ���
	// Dog, Cat --> eat()
	public abstract void eat(); // �߻�޼���(�ҿ����Ѹ޼���)

	public void move() { // �����޼���
		System.out.println("�̵��̵��̵�");
	}
}