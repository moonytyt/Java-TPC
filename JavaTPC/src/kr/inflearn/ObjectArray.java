package kr.inflearn;

public class ObjectArray {
	private int count;
	private Object[] arr;

	public ObjectArray() {
		this(10); // this(10)은 또다른 생성자인 public IntArray(int 10) 을 호출한다
	}

	public ObjectArray(int init) {
		arr = new Object[init];
	}

	public void add(Object data) {
		arr[count++] = data;
	}

	public Object get(int index) {
		return arr[index];
	}

	public int size() {
		return count;
	}
}
