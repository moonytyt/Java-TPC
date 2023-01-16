package kr.poly;

public interface RemoCon { // 객체생성x; RemoCon r = new RemoCon();
	// 상수를 사용가능
	int MAXCH = 100; // RemoCon.MAXCH
	int MINCH = 1; // RemoCon.MINCH

	// 추상메서드
	public void chUp();

	public void chDown();

	public void internet();
}
