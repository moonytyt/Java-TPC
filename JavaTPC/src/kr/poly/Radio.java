package kr.poly;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("���� ä���� �ö󰣴�");
	}

	@Override
	public void chDown() {
		System.out.println("���� ä���� ��������");
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȵȴ�");
	}

}
