import kr.tpc.Inflearn;

public class TPC31 {
	public static void main(String[] args) {
		// Inflearn inf = new Inflearn(); -> Inflearn�� �����ڰ� private�̱� ������ ������ �Ұ���

		// inf.tpc();
		Inflearn.tpc(); // -> Ŭ�����޼���(static�޼���)�� ��ü�� �������� �ʰ� Ŭ���������� ȣ�� ����
		// inf.java();
		Inflearn.java(); // ->Ŭ�����޼���(static�޼���)�� ��ü�� �������� �ʰ� Ŭ���������� ȣ�� ����

		// Java API�� private ������
		// System sys = new System();
		System.out.println("���!"); // -> ��ü�� �������� �ʰ� ȣ��
		// Math m = new Maht();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}
