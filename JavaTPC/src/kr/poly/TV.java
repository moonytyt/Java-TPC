package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;

	@Override
	public void chUp() {
		if (currCH < RemoCon.MAXCH) {
			currCH++;
			System.out.println("TVä���� �ö󰣴�: " + currCH);
		} else {
			currCH = 1;
			System.out.println("TVä���� �ö󰣴�: " + currCH);
		}
	}

	@Override
	public void chDown() {
		if (currCH > RemoCon.MINCH) {
			currCH--;
			System.out.println("TVä���� ��������: " + currCH);
		} else {
			currCH = 100;
			System.out.println("TVä���� ��������: " + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȴ�");
	}

}
