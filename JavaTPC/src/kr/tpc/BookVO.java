package kr.tpc;

// å(Object)
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;

	// ����Ʈ �����ڸ޼���(����) -> �����ڰ� �ϳ��� ���� �� �ڵ����� �������
	// �׷��� ������ �޼��带 �ߺ����� �Ѵٸ� ����Ʈ ������ �޼��带 �ݵ�� �߰��ؾ��Ѵ�.
	public BookVO() {
		// �ʱ�ȭ �۾�
		this.title = "�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 780;
	}

	// ������ �޼����� �ߺ�����(overloading) -> �Ű������� ������ �ٸ��� ����
	public BookVO(String title, int price, String company, int page) {
		// �ʱ�ȭ �۾�
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
