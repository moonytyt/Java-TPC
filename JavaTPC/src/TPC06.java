public class TPC06 {
	public static void main(String[] args) {
		// 5. �޼��� -> ����(method), ���(function)
		int a = 67;
		int b = 89;
		int result = sum(a, b);
		System.out.println(result);

		int arr[] = makeArr(); // 10,20,30
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);
	}

	// ���� 2���� �Ű������� �޾� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}

	// 10,20,30
	public static int[] makeArr() {
		int[] x = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		return x;
	}
}