import kr.tpc.Inflearn;

public class TPC31 {
	public static void main(String[] args) {
		// Inflearn inf = new Inflearn(); -> Inflearn의 생성자가 private이기 때문에 접근이 불가능

		// inf.tpc();
		Inflearn.tpc(); // -> 클래스메서드(static메서드)는 객체를 생성하지 않고 클래스명으로 호출 가능
		// inf.java();
		Inflearn.java(); // ->클래스메서드(static메서드)는 객체를 생성하지 않고 클래스명으로 호출 가능

		// Java API의 private 생성자
		// System sys = new System();
		System.out.println("출력!"); // -> 객체를 생성하지 않고 호출
		// Math m = new Maht();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}
