package kr.inflearn;

public class IntArray {
	private int count;
	private int[] arr;

	public IntArray() {
		this(10); // this(10)은 또다른 생성자인 public IntArray(int 10) 을 호출한다
	}

	public IntArray(int init) {
		arr = new int[init];
	}

	public void add(int data) {
		arr[count++] = data;
	}

	public int get(int index) {
		return arr[index];
	}

	public int size() {
		return count;
	}
}