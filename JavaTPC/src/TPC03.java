import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// ���踦 �����϶�. PDV VS UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a; // ��������

		// å 1���� �����ϱ����� ������ �����Ͻÿ�.
		Book b; // b�� �����͸� 1���� ������ �� �ִ�
		b = new Book(); // �޸� ��򰡿� ��ü ����, b���� �޸��� �������� �Ҵ�
		b.title = "�ڹ�";
		b.price = 15000;
		b.company = "�Ѻ��̵��";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		System.out.println();
		
		PersonVO p;
		p = new PersonVO();
		p.name="�����";
		p.age=30;
		p.weight=72.5f;
		p.height=185.5f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
	}
}