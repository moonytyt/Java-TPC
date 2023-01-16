package kr.inflearn;

// default접근제어 사용가능 그러나 다른 패키지에서도 사용해야하기 때문에 보통 public을 사용
public class MyClass {
	public int sum(int a, int b) {
		int hap = 0;
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}
}
