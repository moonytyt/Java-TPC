import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		// ��ȭ
		MovieVO mv = new MovieVO("����1", 1200, "�Ѱ�����1", 12, 1.3f);
		System.out.println(mv);
		System.out.println("----------------------");
		// ��ȭ 3���� ����
		MovieVO[] marr = new MovieVO[3];
		marr[0] = mv;
		marr[1] = new MovieVO("����2", 1300, "�Ѱ�����2", 12, 1.3f);
		marr[2] = new MovieVO("����3", 1400, "�Ѱ�����3", 12, 1.3f);

		for (int i = 0; i < marr.length; i++) {
			System.out.println(marr[i]);
		}
	}
}